package com.strangerweather.nextgenicons.activities;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.activities.CandyBarMainActivity;
import com.dm.material.dashboard.candybar.activities.configurations.ActivityConfiguration;
import com.strangerweather.nextgenicons.licenses.License;

public class MainActivity extends CandyBarMainActivity {

    @NonNull
    @Override
    public ActivityConfiguration onInit() {
        return new ActivityConfiguration()
                .setLicenseCheckerEnabled(License.isLicenseCheckerEnabled())
                .setLicenseKey(License.getLicenseKey())
                .setRandomString(License.getRandomString())
                .setDonationProductsId(License.getDonationProductsId())
                .setPremiumRequestProducts(License.getPremiumRequestProductsId(), License.getPremiumRequestProductsCount());
    }
}
