package com.example.aditi.patriotism;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    private FirebaseAuth firebaseAuth1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth1 = FirebaseAuth.getInstance();

        if (firebaseAuth1.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.hindi:
                setLocale("hi");
                return true;
            case R.id.english:
                setLocale("en");
                return true;
            case R.id.logout:
                firebaseAuth1.signOut();
                Toast.makeText(MainActivity.this, "Successfuly Logged Out!", Toast.LENGTH_SHORT).show();
                finish();
                Intent i =new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private Locale myLocale;
    public void setLocale(String lang) {

        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        finish();
    }

    public void onSongs(View view)
    {
        Intent i = new Intent(MainActivity.this,SongsActivity.class);
        startActivity(i);
    }


     public void onFreedomFighter(View view)
    {
        Intent i = new Intent(MainActivity.this,FreedomFighterActivity.class);
        startActivity(i);
    }

     public  void onQuotes(View view)
    {
        Intent i = new Intent(MainActivity.this,QuotesActivity.class);
        startActivity(i);
    }

    public void onVideos(View view)
    {
        Intent i = new Intent(MainActivity.this,videos2.class);
        startActivity(i);
    }
}
