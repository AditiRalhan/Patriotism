package com.example.aditi.patriotism;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity
{
    Animation anim1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo11=(ImageView)findViewById(R.id.logoimg);
        anim1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        logo11.startAnimation(anim1);



        new Handler().postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                Intent i=new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
