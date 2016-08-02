package com.example.android.mogilevcity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2500;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                setContentView(R.layout.screen);
                ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
                CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), getApplicationContext());
                viewPager.setAdapter(adapter);
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

}



