import json
import os
# Paths
SRC_DIR = './src'
DB_FILE = './data.json'

# Load existing data.json
with open(DB_FILE, 'r') as f:
    try:
        data = json.load(f)
    except ValueError:
        print("❌ Invalid JSON format in data.json")
        exit(1)

# Get all SVG filenames (without .svg extension)
svg_files = [
    os.path.splitext(f)[0]
    for f in os.listdir(SRC_DIR)
    if f.endswith('.svg')
]

# Track additions
added = []

# Add missing keys
for icon_name in svg_files:
    if icon_name not in data:
        data[icon_name] = []
        added.append(icon_name)

# Save updated data.json
with open(DB_FILE, 'w') as f:
    json.dump(data, f, indent=2, sort_keys=True)

# Report
if added:
    print(f"✅ Added {len(added)} missing icons to data.json:")
    for name in added:
        print(f"  • {name}")
else:
    print("🎉 No missing icons found. data.json is complete!")
