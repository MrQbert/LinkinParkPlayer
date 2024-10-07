package com.example.linkinpark;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class songList extends AppCompatActivity {
    ImageButton playNumbEl;
    ImageButton playPapercutEl;
    MediaPlayer numb;
    MediaPlayer papercut;
    Boolean isPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        numb = MediaPlayer.create(this,R.raw.numb);
        papercut = MediaPlayer.create(this,R.raw.numb);
        playNumbEl = findViewById(R.id.playNumbEl);
        playPapercutEl = findViewById(R.id.playPapercutEl);
        isPlaying = false;
    }
    public void play_pause(View v){
        if(v.getId() == R.id.playNumbEl){
            if(!isPlaying){
                numb.start();
                playNumbEl.setImageResource(R.drawable.pause);
                playPapercutEl.setEnabled(false);
                isPlaying= true;
            }else{
                numb.pause();
                playNumbEl.setImageResource(R.drawable.play);
                playPapercutEl.setEnabled(true);
                isPlaying= false;
            }
        }
        else if(v.getId()== R.id.playPapercutEl){
            if(!isPlaying) {
                papercut.start();
                playPapercutEl.setImageResource(R.drawable.pause);
                playNumbEl.setEnabled(false);
                isPlaying = true;
            }else{
                papercut.pause();
                playPapercutEl.setImageResource(R.drawable.play);
                playNumbEl.setEnabled(true);
                isPlaying= false;

            }

        }


    }

}