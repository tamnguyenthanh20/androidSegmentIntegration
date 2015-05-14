package com.example.nttam.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.segment.analytics.Analytics;
import com.segment.analytics.Properties;

/**
 * Created by nttam on 5/13/2015.
 */
public class Screen2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        System.out.println("DEBUG: Inside Screen2Activity !!!");
        // Screen
        Analytics.with(getApplicationContext()).screen("FromAndroid",
                "Screen2Activity",new Properties().putValue("testScr2","test Screen 2 Activity"));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
