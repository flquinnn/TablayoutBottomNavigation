package com.example.tvb.calen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tvb.fragment.AccountFragment;
import com.example.tvb.fragment.CalenFragment;
import com.example.tvb.fragment.HomeFragment;

public class CalenViewPagerAdapter extends FragmentStatePagerAdapter {
    public CalenViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "MSV";
            case 1:
                return "Tên";
            case 2:
                return "Lớp";
            default:
                return "MSV";
        }
    }
}