package io.github.PapirusDevelopmentTeam.papirus_icons.applications;

import androidx.annotation.NonNull;

// TODO: Remove `//` below to enable OneSignal
//import com.onesignal.OneSignal;

import candybar.lib.applications.CandyBarApplication;
import io.github.PapirusDevelopmentTeam.papirus_icons.R;

public class CandyBar extends CandyBarApplication {

    @NonNull
    @Override
    public Class<?> getDrawableClass() {
        return R.drawable.class;
    }

    // TODO: Remove `/*` and `*/` below to enable OneSignal
    /*
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.setAppId("YOUR_ONESIGNAL_APP_ID_HERE");
        OneSignal.initWithContext(this, "YOUR_ONESIGNAL_APP_ID");
    }
    */

    @NonNull
    @Override
    public Configuration onInit() {
        Configuration configuration = new Configuration();

        // TODO: Remove `/*` and `*/` below to enable OneSignal
        /*
        configuration.setNotificationEnabled(true, (isEnable) -> {
            if (isEnable) {
                OneSignal.getUser().getPushSubscription().optIn();
            } else {
                OneSignal.getUser().getPushSubscription().optOut();
            }
        });
        */

        DonationLink[] donationLinks = new DonationLink[] {
        new DonationLink(
                // You can use png file (without extension) inside drawable-nodpi folder or url
                "apps_paypal",
                "PayPal",
                "Donate me on PayPal",
                "https://www.paypal.me/varlesh"),
        new DonationLink(
                // You can use png file (without extension) inside drawable-nodpi folder or url
                "apps_yoomoney",
                "YooMoney",
                "Donate me on YooMoney",
                "https://yoomoney.ru/to/410013316426627"),
        new DonationLink(
                // You can use png file (without extension) inside drawable-nodpi folder or url
                "apps_patreon",
                "Patreon",
                "Donate me on Patreon",
                "https://patreon.com/varlesh")
                };
        configuration.setDonationLinks(donationLinks);
        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);

        return configuration;
    }
}
