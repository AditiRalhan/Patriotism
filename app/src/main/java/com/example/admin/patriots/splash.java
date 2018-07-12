package com.example.admin.patriots;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView i=findViewById(R.id.splash);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        i.startAnimation(animation);
        new Handler().postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
