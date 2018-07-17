package com.example.admin.patriots;

import android.content.Intent;
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
   String pressedbuttonno,press;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        //   b = (Button) findViewById(R.id.play);
        youTubePlayerView = findViewById(R.id.youtubeplayer12);
        pressedbuttonno = getIntent().getExtras().getString("b");
 press=getIntent().getExtras().getString("cd");

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(pressedbuttonno.equals("Maa Tujhe Salam")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("e4xBXRd33Nc");}



                if(pressedbuttonno.equals("Kandho se Milte Hai Kandhe")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("s_-tthrE0Hg");}
                if(pressedbuttonno.equals("Sandeshe Aate Hai")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("BQBidc3eHPY");}
                if(pressedbuttonno.equals("Aisa Desh Hai Mera")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("wDheWYmNEhQ");}
                if(pressedbuttonno.equals("Ae Mere Vatan Ke Logon")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("DSJ1MMGi_IQ");}
                if(pressedbuttonno.equals("Suno Gaur Se Duniya Walo")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("QhWCAqZrYvw");}
                if(pressedbuttonno.equals("Sare Jahan Se Acha")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("Md52vV25Wxg");}
                if(pressedbuttonno.equals("Mera Desh hi Dharam")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("yfuPlMFxQmo");}
                if(pressedbuttonno.equals("Vande Matram")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("c6PHJg9D_Sk");}
                if(pressedbuttonno.equals("Vande Matram")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("c6PHJg9D_Sk");}
                if(pressedbuttonno.equals("Bharat Humko Jaan Se Pyara")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("LXDIgP4zW7o");}

                if(pressedbuttonno.equals("Lakshya")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("8DMF0U6xV78");}
                if(pressedbuttonno.equals("Chak De India")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("bnqLzCsffwY");}
                if(pressedbuttonno.equals("Kar Chale hum Fida")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("n6yTCblgAQQ");}
                if(pressedbuttonno.equals("Aao Bachho Tumhe Sikhaye")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("XiiBsKU4z6c");}
                if(pressedbuttonno.equals("Rang De Basanti Chola")){
                    Log.e("ppppp", "onInitializationSuccess");

                    youTubePlayer.loadVideo("1JRIhF3kh_8");}













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
