package com.example.himanhsu.patriotism;

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
