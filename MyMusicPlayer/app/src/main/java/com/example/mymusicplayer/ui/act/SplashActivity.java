package com.example.mymusicplayer.ui.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.mymusicplayer.R;
import com.example.mymusicplayer.presenter.contact.SplashContact;
import com.example.mymusicplayer.presenter.impl.ISplashContact;

/**
 * Created by Administrator on 2017/6/28.
 */

public class SplashActivity extends BaseActivity implements ISplashContact.splashInTo, View.OnClickListener {
    private TextView into_tv;
    private SplashContact splashContact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        into_tv = (TextView) findViewById(R.id.tv_into);

        into_tv.setOnClickListener(this);
        splashContact = new SplashContact(this);
        splashContact.timer();
    }

    @Override
    public void inToMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onClick(View view) {
        splashContact.onClick();

    }
}
