package com.example.a223playsomeaudiofilesinsideyourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mediaPlayer!=null) mediaPlayer.release();

                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.music_1);
                mediaPlayer.start();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mediaPlayer!=null) mediaPlayer.release();

                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("");
                    mediaPlayer.prepare();
                    mediaPlayer.start();


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });




    }
}