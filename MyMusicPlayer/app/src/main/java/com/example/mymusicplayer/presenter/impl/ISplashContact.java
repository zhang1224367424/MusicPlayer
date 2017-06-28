package com.example.mymusicplayer.presenter.impl;

/**
 * Created by Administrator on 2017/6/28.
 */

public interface ISplashContact {
    /**
     * view的接口
     */
    interface splashInTo {
        void inToMain();
    }

    /**
     * presenter的接口
     */
    interface presenterCliclk{
        void onClick();
        void timer();
    }
}
