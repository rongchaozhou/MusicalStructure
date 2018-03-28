package com.rongchaozhou.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rongchaozhou on 3/25/2018.
 */

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        Song nowPlayingSong = ((MyApplication) this.getApplication()).getNowPlaying();
        if (nowPlayingSong == null) {
            Toast.makeText(this, "Select music to play!", Toast.LENGTH_SHORT).show();
        } else {
            TextView name = findViewById(R.id.now_playing_text);
            name.setText(nowPlayingSong.getSongName());
        }

        Button button_play = findViewById(R.id.play_button);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView button_text = findViewById(R.id.play_button);
                if (button_text.getText().equals(getString(R.string.button_play))) {
                    button_text.setText(getString(R.string.button_pause));
                } else {
                    button_text.setText(getString(R.string.button_play));
                }
            }
        });

        Button button_home = findViewById(R.id.home_button);
        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NowPlayingActivity.this, MainActivity.class));
            }
        });
    }
}
