package com.example.aditi.patriotism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class videos2 extends AppCompatActivity {
    Button b1,b2,b3,b4;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_videos2);

            b1=(Button)findViewById(R.id.Jan);
            b2=(Button)findViewById(R.id.Vande);
            b3=(Button)findViewById(R.id.button_Maa);
            b4=(Button)findViewById(R.id.button_De);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   Intent i=new Intent(getApplicationContext(),VideosActivity.class);
                    i.putExtra("buttonno",1);
                    startActivity(i);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(),VideosActivity.class);
                    i.putExtra("buttonno",2);
                    startActivity(i);


                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(),VideosActivity.class);
                    i.putExtra("buttonno",3);
                    startActivity(i);


                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(),VideosActivity.class);
                    i.putExtra("buttonno",4);
                    startActivity(i);


                }
            });
        }
}

