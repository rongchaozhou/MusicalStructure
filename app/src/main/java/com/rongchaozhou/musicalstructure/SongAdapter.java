package com.rongchaozhou.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View.OnClickListener;

import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by rongchaozhou on 3/25/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.title_text_view);
        nameTextView.setText(currentSong.getSongName());

        nameTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ((MyApplication) getContext().getApplicationContext()).setNowPlaying(getItem(position));
                getContext().startActivity(new Intent(getContext(), NowPlayingActivity.class));
            }
        });


        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getSongArtist());

        TextView timeTextView = listItemView.findViewById(R.id.time_text_view);
        timeTextView.setText("" + (currentSong.getSongTime() / 60) + ":" + (currentSong.getSongTime() % 60));

        return listItemView;
    }
}
