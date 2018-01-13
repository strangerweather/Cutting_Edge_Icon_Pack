package com.strangerweather.nextgenicons.activities;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.activities.CandyBarMuzeiActivity;
import com.strangerweather.nextgenicons.services.MuzeiService;

public class MuzeiActivity extends CandyBarMuzeiActivity {

    @NonNull
    @Override
    public Class<?> onInit() {
        return MuzeiService.class;
    }
}
