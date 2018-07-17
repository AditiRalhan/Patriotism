package com.example.admin.patriots;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class films extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
  String pressedbuttonno;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        //   b = (Button) findViewById(R.id.play);
        youTubePlayerView = findViewById(R.id.youtubeplayer12);
        pressedbuttonno = getIntent().getExtras().getString("cd");


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(pressedbuttonno.equals("The 80's INDIA")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("b6AY4GPLyP4");}
                if(pressedbuttonno.equals("Inside Indian Naval Academy")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("8bH6aJJ3CDs");}

                if(pressedbuttonno.equals("India Remonetized")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("wxLJZyuba5E");}


                if(pressedbuttonno.equals("Netaji Subhash Chandra Bose")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("uwaxWysHCZw");}
                if(pressedbuttonno.equals("KUMBH")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("ReWiJ4pd6Kc");}
            }


            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.e("ppppp", "onInitializationFailure");

            }
        };

        youTubePlayerView.initialize(YouTubeConfig.API_KEY, onInitializedListener);
   /*     b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("ppppp","onClick");

                youTubePlayerView.initialize(YotubeConfig.API_KEY, onInitializedListener);
            }
        });*/
    }

}

