package com.example.himanhsu.patriotism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button indepenActivistsButton= findViewById(R.id.launch_independence_activists_activvity);
        indepenActivistsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FreedomFighters.class);
                startActivity(intent);
            }
        });
        Button quotesButton=findViewById(R.id.launch_quotes_activity);
        quotesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent quotesintent=new Intent(MainActivity.this,Quotes.class);
                startActivity(quotesintent);
            }
        });
    }
}
