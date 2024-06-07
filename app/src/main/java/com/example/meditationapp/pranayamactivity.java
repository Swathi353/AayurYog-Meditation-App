package com.example.meditationapp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class pranayamactivity extends AppCompatActivity {
    VideoView vv;
    MediaPlayer mysong;
    private Object context;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pranayamactivity);
        //mysong=MediaPlayer.create(MainActivity.this,R.raw.bpm);
        vv=findViewById(R.id.vv);
        vv.setVideoPath( "android.resource://" +getPackageName()+"/"+R.raw.vid);

        MediaController med= new MediaController(this);
        vv.setMediaController(med);
        med.setAnchorView(vv);
        vv.start();


    }

  /*  public void Playit(View v){
        mysong.start();
    }
    protected void onPause(){
        super.onPause();
        mysong.release();
    }*/

}