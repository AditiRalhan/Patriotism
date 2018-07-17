package com.example.admin.patriots;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class defencevideos extends YouTubeBaseActivity {

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
        pressedbuttonno = getIntent().getExtras().getString("cdes");


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(pressedbuttonno.equals("Indian Defence Laboratories")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("bzm0pZjnkN8");}
                if(pressedbuttonno.equals("How Dangerous is India?")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("v_xh9g0GmJk");}

                if(pressedbuttonno.equals("How Powerful is India?")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("6zcI6u6oTCw");}


                if(pressedbuttonno.equals("10 Most Powerful Militaries In The World")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("Kg3V4UKOAng");}
                if(pressedbuttonno.equals("Nat Geo Documentary on BSF- India's First Line of Defence")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("LF2bxi3K8GI");}
                if(pressedbuttonno.equals("Indian Missile System")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("X_XzE96otPs");}
                if(pressedbuttonno.equals("Why India Is Buying S-400 Missile Defence System?")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("94vj0_Rs8Ic");}
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


