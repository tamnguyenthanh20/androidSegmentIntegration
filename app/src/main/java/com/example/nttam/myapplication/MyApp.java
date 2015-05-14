package com.example.nttam.myapplication;

import android.app.Application;

import com.segment.analytics.Analytics;

/**
 * Created by nttam on 5/13/2015.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        Analytics analytics = new Analytics.Builder(this, "0nZC2tA2957nilotErcs0rRmTs68kdbb").build();
        Analytics.setSingletonInstance(analytics);
    }
}
