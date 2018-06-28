package com.example.aditi.patriotism;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class VideosActivity extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    int pressedbuttonno;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //   b = (Button) findViewById(R.id.play);
        youTubePlayerView = findViewById(R.id.youtubeplayer12);
        pressedbuttonno = getIntent().getExtras().getInt("buttonno");


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(pressedbuttonno==1){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("77i8kH-Iw8Q");}
                if(pressedbuttonno==2)
                {
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("HZXd6oKXZwk");
                }
                if(pressedbuttonno==3)
                {
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("qlEE2hD2mMs");
                }
                if(pressedbuttonno==4)
                {
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("PIKLTEtntI8");
                }
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
