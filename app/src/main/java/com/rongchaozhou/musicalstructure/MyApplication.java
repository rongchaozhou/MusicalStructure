package com.rongchaozhou.musicalstructure;

import android.app.Application;

/**
 * Created by rongchaozhou on 3/25/2018.
 */

public class MyApplication extends Application {
    private Song nowPlaying;

    public Song getNowPlaying() {
        return nowPlaying;
    }

    public void setNowPlaying(Song thisSong) {
        nowPlaying = thisSong;
    }
}
