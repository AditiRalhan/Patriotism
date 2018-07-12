package com.example.admin.patriots;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PatriotsPager extends FragmentStatePagerAdapter {

    PatriotsPager(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position+1)
        {
            case 1:
                return new PatriotsFightersFragment();
            case 2:
                return new GallantryAwadsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position+1)
        {
            case 1:
                return "Freedom Fighters";
            case 2:
                return "Gallantry Awards";
            default:
                return null;
        }
    }
}

