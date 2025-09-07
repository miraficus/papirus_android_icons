# Android Support Library
-keep class !android.support.v7.internal.view.menu.**,android.support.** {*;}
-keep class android.support.v7.graphics.** { *; }
-dontwarn android.support.v7.graphics.**

-keep class android.support.design.widget.** { *; }
-keep interface android.support.design.widget.** { *; }
-dontwarn android.support.design.**

# Keep the source line when using ProGuard
-renamesourcefileattribute SourceFile
-keepattributes SourceFile,LineNumberTable

# LoganSquare JSON parser
-keep class com.bluelinelabs.logansquare.** { *; }
-keep @com.bluelinelabs.logansquare.annotation.JsonObject class *
-keep class **$$JsonObjectMapper { *; }

# Java 8
-dontwarn java.lang.invoke.*
-dontwarn **$$Lambda$*

# OkHttp
-dontwarn okhttp3.**
-dontwarn okio.**
-dontwarn javax.annotation.**
-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase
-dontwarn okhttp3.internal.platform.ConscryptPlatform
-dontwarn org.conscrypt.ConscryptHostnameVerifier

# Glide
-keep public class * extends com.bumptech.glide.module.AppGlideModule
-keep class com.bumptech.glide.GeneratedAppGlideModuleImpl

-keep class **.R
-keep class **.R$* {
    <fields>;
}