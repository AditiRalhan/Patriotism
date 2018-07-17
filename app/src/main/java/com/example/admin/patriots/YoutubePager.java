package com.example.admin.patriots;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class YoutubePager extends FragmentStatePagerAdapter {

   YoutubePager(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position+1)
        {
            case 1:
                return new VideoSongsFragment();
            case 2:
                return new Documentaries();
            case 3:
                return new Motivating();
            case 4:
                return new IndianDefence();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position+1)
        {
            case 1:
                return "Songs";
            case 2:
                return "Films";
            case 3:
                return "Motivation";
            case 4:
                return "Indian Defence";
            default:
                return null;
        }
    }
}