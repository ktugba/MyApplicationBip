package com.example.myapplicationbip;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<String> mTitleList;
    private ArrayList<Fragment> mFragmentsList;

    public PagerAdapter(ArrayList<String> titleList, ArrayList<Fragment> fragmentsList, @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        mTitleList = titleList;
        mFragmentsList = fragmentsList;
    }

    //geçiş yapılacak fragment pozisyonları
    @NonNull
    @Override
    public Fragment getItem(int position) {

        return mFragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentsList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return mTitleList.get(position);
    }
}
