package com.example.admin.patriots;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class splash extends AppCompatActivity {
Animation animation;
ProgressBar p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView i=findViewById(R.id.splash);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        i.startAnimation(animation);
        p=(ProgressBar)findViewById(R.id.progressBar);
        p.setMax(100);
        p.setProgress(0);
        Thread t=new Thread()
        {
            @Override
            public void run() {
                super.run();
                try{
                    for(int i=0;i<100;i++)

                    {

                        p.setProgress(i);
                        sleep(30);
                    }
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i;
                    i=new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };t.start();
    }
}
