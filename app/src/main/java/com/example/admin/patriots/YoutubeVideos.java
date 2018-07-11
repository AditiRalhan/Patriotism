package com.example.admin.patriots;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class YoutubeVideos extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    ListView l;
    String stations[]={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","Ram Nagar","Civil Lines" ,"Railway Station","Sindhi Camp","Chand Pole ","Choti Chaupar","Badi Chaupar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_videos);


        tabLayout=findViewById(R.id.patriots_tab_layout_id12);


        viewPager=findViewById(R.id.the_patriots_pager_id12);
        viewPager.setAdapter(new YoutubePager(getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}