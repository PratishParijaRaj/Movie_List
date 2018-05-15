package com.example.pratishparija.recycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.Window;

public class TabsActivity extends FragmentActivity implements
        ActionBar.TabListener, android.app.ActionBar.TabListener {
    private ViewPager viewPager;
    private android.app.ActionBar actionBar;
    private TabPagerAdapter tabPagerAdapter;
    private android.app.ActionBar.Tab adtab;
    private String[] tabs = {"Bollywood", "Hollywood", "Tollywood"};

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        viewPager = (ViewPager) findViewById(R.id.pager);
        tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabPagerAdapter);
        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }


    @Override
    public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {

    }
}
