package com.example.admin.patriots;

/**
 * Created by ADITI on 6/28/2018.
 */

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class CalligraphyClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/quicksandmedium.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}