package com.example.admin.patriots;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ThePatriots extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_patriots);


        tabLayout=findViewById(R.id.patriots_tab_layout_id);


        viewPager=findViewById(R.id.the_patriots_pager_id);
        viewPager.setAdapter(new PatriotsPager(getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
