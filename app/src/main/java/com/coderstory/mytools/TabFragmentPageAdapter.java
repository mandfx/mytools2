package com.coderstory.mytools;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;

public class TabFragmentPageAdapter extends FragmentPagerAdapter {
    private Bundle args;
    FragmentManager fm;
    private List<Fragment> fragments;

    public TabFragmentPageAdapter(FragmentManager fm, List<Fragment> fragments, Bundle args) {
        super(fm);
        this.fragments = fragments;
        this.args = args;
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = fragments.get(position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

}
