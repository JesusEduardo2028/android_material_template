package com.bitbang.jesusmunoz.bitbang_starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.widget.Toast;

/**
 * Created by jesuseduardomunoz on 5/25/16.
 */
public class SplashActivity extends Activity{
    private final int SPLASH_DISPLAY_TIME = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                SplashActivity.this.finish();
            }
        },SPLASH_DISPLAY_TIME);
    }
}
