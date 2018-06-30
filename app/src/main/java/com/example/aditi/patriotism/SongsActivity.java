package com.example.aditi.patriotism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    Button buttonNew,buttonOld;
    Intent intentNew,intentOld;

    public void newSong(View view){

        intentNew = new Intent(this,NewSongs.class);
        startActivity(intentNew);
    }

    public void oldSong(View view){

        intentOld = new Intent(this, OldSongs.class);
        startActivity(intentOld);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        buttonNew = (Button) findViewById(R.id.buttonNew);
        buttonOld = (Button) findViewById(R.id.buttonOld);

    }
}
