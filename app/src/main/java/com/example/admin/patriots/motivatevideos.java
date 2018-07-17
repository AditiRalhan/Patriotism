package com.example.admin.patriots;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class motivatevideos extends YouTubeBaseActivity {

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
        pressedbuttonno = getIntent().getExtras().getString("cde");


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(pressedbuttonno.equals("Main Hoon")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("EPSwY5pS6iw");}
                if(pressedbuttonno.equals("Heros")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("f4gSzOdAJQw");}

                if(pressedbuttonno.equals("Change Your Life")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("bheMzMp6RJY");}


                if(pressedbuttonno.equals("Leadership")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("0ryFpMRHKqs");}
                if(pressedbuttonno.equals("APJ Abdul Kalam Inspirational")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("7E-cwdnsiow");}
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

