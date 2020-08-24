package com.lunodzo.gosocial;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        displaySplash();
    }

    public void displaySplash(){
        Thread mythread = new Thread(){
            @Override
            public void run() {
                try {
                    int displaying = 8000;
                    int waite = 0;
                    while (waite < displaying) {
                        sleep(100);
                        waite = waite + 100;
                    }
                    super.run();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent a = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(a);
                    finish();
                }
            }
        };
        mythread.start();
    }
}
