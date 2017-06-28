package com.example.mymusicplayer.presenter.contact;

import android.os.Handler;
import android.os.Message;

import com.example.mymusicplayer.presenter.impl.ISplashContact;

/**
 * Created by Administrator on 2017/6/28.
 */

public class SplashContact implements ISplashContact.presenterCliclk {
    private ISplashContact.splashInTo splashInTo;
    private static final int WHAT = 1;
    private static final int TIME = 3000;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            splashInTo.inToMain();
        }
    };

    public SplashContact(ISplashContact.splashInTo splashInTo) {
        this.splashInTo = splashInTo;
    }

    @Override
    public void onClick() {
        handler.removeMessages(WHAT);
        splashInTo.inToMain();
    }

    @Override
    public void timer() {
        handler.sendEmptyMessageDelayed(WHAT, TIME);
    }
}
