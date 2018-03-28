package com.rongchaozhou.musicalstructure;

/**
 * Created by rongchaozhou on 3/25/2018.
 */

public class Song {
    private String mSongName;
    private String mSongArtist;
    private int mSongTime;

    public Song(String songName, String songArtist, int songTime) {
        mSongName = songName;
        mSongArtist = songArtist;
        mSongTime = songTime;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getSongArtist() {
        return mSongArtist;
    }

    public int getSongTime() {
        return mSongTime;
    }
}
