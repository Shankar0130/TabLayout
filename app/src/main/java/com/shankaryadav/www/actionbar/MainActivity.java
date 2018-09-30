package com.shankaryadav.www.actionbar;

import android.graphics.drawable.TransitionDrawable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionPagerAdapter mSectionPgerAdapter;

    private ViewPager viewPager;

    private TabLayout tabLayout;

    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionPgerAdapter = new SectionPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.contain);

        appBarLayout = (AppBarLayout) findViewById(R.id.appBarTop);

        tabLayout = (TabLayout) findViewById(R.id.tabs);

        mSectionPgerAdapter.addFragment(new Tab1Fragment(), "Tab1");
        mSectionPgerAdapter.addFragment(new Tab2Fragment(),"Tab2");
        mSectionPgerAdapter.addFragment(new Tab3Fragment(), "Tab3");
        viewPager.setAdapter(mSectionPgerAdapter);




        tabLayout.setupWithViewPager(viewPager);



    }

}
