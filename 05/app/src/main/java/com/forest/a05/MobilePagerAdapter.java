package com.forest.a05;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.forest.a05.bean.GoodsInfo;
import com.forest.a05.fragment.DynamicFragment;

import java.util.ArrayList;

public class MobilePagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<GoodsInfo> mGoodsList = new ArrayList<GoodsInfo>();//声明一个商品队列

    // 碎片页适配器的构造函数，传入碎片管理器与商品信息队列
    public MobilePagerAdapter(FragmentManager fm, ArrayList<GoodsInfo> goodsList) {
        super(fm);
        mGoodsList = goodsList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return DynamicFragment.newInstance(position,mGoodsList.get(position).pic,mGoodsList.get(position).desc);
    }

    @Override
    public int getCount() {
        return mGoodsList.size();
    }
    // 获得指定碎片页的标题文本
    public CharSequence getPageTitle(int position) {
        return mGoodsList.get(position).name;
    }
}
