package com.example.myproject.activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.widget.ImageView;


import com.example.myproject.R;
import com.example.myproject.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

public class AnimationActivity extends BaseActivity {

    private ImageView mImage;
    private CountDownTimer mStart;
    private Timer mTimer;

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        initView();
    }

    @Override
    protected int getlayoutID() {
        return R.layout.activity_animation;
    }

    private void initView() {
        mImage = findViewById(R.id.image);
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {

                startActivity(new Intent(AnimationActivity.this, WelcomeActivity.class));
                finish();

            }
        }, 2000, 1000);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mTimer != null) {
         mTimer.cancel();
        }
    }
}
