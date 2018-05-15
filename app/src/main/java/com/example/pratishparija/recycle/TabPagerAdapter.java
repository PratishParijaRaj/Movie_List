package com.example.pratishparija.recycle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class TabPagerAdapter extends FragmentPagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int index) {
        Bundle bundle = new Bundle();
        String tab = "";
        int colorResId = 0;
        switch (index) {
            case 0:
                tab = "List of Bollywood Movies";
                colorResId = R.color.colorAccent;
                break;
            case 1:
                tab = "List of Hollywood Movies";
                colorResId = R.color.colorWhite;
                break;
            case 2:
                tab = "List of Tollywood Movies";
                colorResId = R.color.colorOrange;
                break;
        }
        bundle.putString("tab",tab);
        bundle.putInt("color", colorResId);
        SwipeTabFragment swipeTabFragment = new SwipeTabFragment();
        swipeTabFragment.setArguments(bundle);
        return swipeTabFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}