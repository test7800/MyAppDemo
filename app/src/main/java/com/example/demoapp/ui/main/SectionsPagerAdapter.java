package com.example.demoapp.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.demoapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    List<Fragment> fragmentList  = new ArrayList<>();
    List<String> titleList = new ArrayList<>();

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = fragmentList.get(position);
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 6;
    }

    public void addFragment(Fragment fragment){
        fragmentList.add(fragment);
    }

    public void removeFragment(int position){
        fragmentList.remove(position);
    }

}