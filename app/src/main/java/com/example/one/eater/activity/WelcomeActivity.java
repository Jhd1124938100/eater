package com.example.one.eater.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class WelcomeActivity extends BaseActivity implements Runnable {


    //判断是否第一次启动程序
    private boolean FirstUse;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        run();
    }

    public void run() {
        SharedPreferences shared = getSharedPreferences("is", MODE_PRIVATE);
        boolean isfer = shared.getBoolean("isfer", true);
        SharedPreferences.Editor editor = shared.edit();
        if (isfer) {
            //第一次进入跳转
            Intent in = new Intent(this, GuideActivity.class);
            startActivity(in);
            finish();
            editor.putBoolean("isfer", false);
            editor.commit();
        } else {
            //第二次进入跳转
            Intent in = new Intent(this, HomeActivity.class);
            startActivity(in);
            finish();

        }
    }
}
