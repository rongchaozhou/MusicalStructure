package com.rongchaozhou.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by rongchaozhou on 3/25/2018.
 */

public class DatabaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        Button button_home = findViewById(R.id.home_button);
        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DatabaseActivity.this, MainActivity.class));
            }
        });

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Thunder", "Imagine Dragon", 190));
        songs.add(new Song("Demons", "Imagine Dragon", 176));
        songs.add(new Song("Sugar", "Maroon 5", 235));
        songs.add(new Song("Lost Stars", "Maroon 5", 266));
        songs.add(new Song("Fire", "Gavin Degraw", 228));
        songs.add(new Song("Centuries", "Fall Out Boy", 231));
        songs.add(new Song("Still Loving You", "Scorpions", 405));
        songs.add(new Song("You & I", "Scorpions", 376));
        songs.add(new Song("Wind Of Change", "Scorpions", 312));
        songs.add(new Song("House of Cards", "Scorpions", 305));
        songs.add(new Song("Magic", "Coldplay", 285));
        songs.add(new Song("Paradise", "Coldplay", 278));
        songs.add(new Song("Everglow", "Coldplay/Gwyneth Paltrow", 282));
        songs.add(new Song("Yellow", "Coldplay", 269));
        songs.add(new Song("Something Just Like This", "Coldplay/The Chainsmokers", 247));

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(new SongAdapter(this, songs));

        Toast.makeText(this, "Click title to play!", Toast.LENGTH_SHORT).show();
    }
}
