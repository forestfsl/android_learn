package com.forest.a05.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.forest.a05.fragment.LaunchFragment;

public class LaunchImproveAdapter extends FragmentStatePagerAdapter {
    private int [] mImageArray;//声明一个图片数组

    // 碎片页适配器的构造函数，传入碎片管理器与图片数组
    public LaunchImproveAdapter(FragmentManager fm, int[] imageArray) {
        super(fm);
        mImageArray = imageArray;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return LaunchFragment.newInstance(position, mImageArray[position]);
    }

    @Override
    public int getCount() {
        return mImageArray.length;
    }
}
