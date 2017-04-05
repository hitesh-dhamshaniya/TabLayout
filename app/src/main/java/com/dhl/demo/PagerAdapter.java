package com.dhl.demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;


    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TempFragment tab1 = new TempFragment();
                return tab1;
            case 1:
                TempFragment tab2 = new TempFragment();
                return tab2;
            case 2:
                TempFragment tab3 = new TempFragment();
                return tab3;
            case 3:
                TempFragment tab4 = new TempFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}