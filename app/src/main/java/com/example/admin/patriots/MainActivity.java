package com.example.admin.patriots;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth firebaseAuth1;
    Button b1,b2,b3;
Button quotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1=findViewById(R.id.songs);
        b2=findViewById(R.id.videos);
        b3=findViewById(R.id.freedomFighter);
        quotes=findViewById(R.id.quotes12);
        firebaseAuth1 = FirebaseAuth.getInstance();

        if (firebaseAuth1.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        }
        else
        {
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            View headerView = navigationView.getHeaderView(0);
            TextView navUsername = (TextView) headerView.findViewById(R.id.nameheader);
            navUsername.setText(firebaseAuth1.getCurrentUser().getDisplayName());
            TextView navemail = (TextView) headerView.findViewById(R.id.emailidheader);
            navemail.setText(firebaseAuth1.getCurrentUser().getEmail());
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),SongsActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),YoutubeVideos.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ThePatriots.class);
                startActivity(i);
            }
        });

            quotes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                    startActivity(new Intent(MainActivity.this, QuotesActivity.class));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), ""+e, Toast.LENGTH_LONG).show();
                    Log.i("Error:",""+e);

                }

            }
            });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

        //noinspection SimplifiableIfStatement
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent refresh = new Intent(this, MainActivity.class);
            startActivity(refresh);
            finish();
            Toast.makeText(this, "Welcome! to Home Screen", Toast.LENGTH_SHORT).show();// Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent i=new Intent(getApplicationContext(),Linkedin.class);
            i.putExtra("buttonno",5);
            startActivity(i);

        }  else if (id == R.id.nav_share) {


        } else if (id == R.id.nav_exit) {

                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Closing App")
                        .setMessage("Are you sure you want to close this app?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }

                        })
                        .setNegativeButton("No", null)
                        .show();
            }

        else if(id == R.id.naman){
            Intent i=new Intent(getApplicationContext(),Linkedin.class);
            i.putExtra("buttonno",1);
            startActivity(i);

        }
        else if(id == R.id.aditi){
            Intent i=new Intent(getApplicationContext(),Linkedin.class);
            i.putExtra("buttonno",2);
            startActivity(i);

        }
        else if(id == R.id.himanshu){
            Intent i=new Intent(getApplicationContext(),Linkedin.class);
            i.putExtra("buttonno",3);
            startActivity(i);

        }
        else if(id == R.id.satvik){
            Intent i=new Intent(getApplicationContext(),Linkedin.class);
            i.putExtra("buttonno",4);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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


}
