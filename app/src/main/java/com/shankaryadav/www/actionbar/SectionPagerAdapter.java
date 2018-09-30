package com.shankaryadav.www.actionbar;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment>  mFragmentList = new ArrayList<>();
    private final List<String>    mFragmentTitle = new ArrayList<>();


    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitle.add(title);
    }
}
