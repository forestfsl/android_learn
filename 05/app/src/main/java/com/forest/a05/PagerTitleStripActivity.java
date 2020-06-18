package com.forest.a05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Toast;

import com.forest.a05.adapter.ImagePagerAdapater;
import com.forest.a05.bean.GoodsInfo;

import java.util.ArrayList;

public class PagerTitleStripActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private ArrayList<GoodsInfo> goodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_title_strip);
        initPagerStrip();
        initViewPager();
    }

    //初始化翻页标题栏
    private void initPagerStrip(){
        //从布局视图中获取名叫pts_title 的翻页标题栏
        PagerTitleStrip ps_title = findViewById(R.id.pts_title);
        //设置翻页标题栏的文本大小
        ps_title.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        //设置翻页标题栏的文本颜色
        ps_title.setTextColor(Color.BLUE);
    }

    //初始化翻页视图
    private void initViewPager(){
        goodsList = GoodsInfo.getDefaultList();
        //构建一个商品图片的翻页适配器
        ImagePagerAdapater adapter = new ImagePagerAdapater(this,goodsList);
        //从布局视图中获取名叫vp_content 的翻页视图
        ViewPager vp_content = findViewById(R.id.vp_content);
        //给vp_content 设置图片翻页适配器
        vp_content.setAdapter(adapter);
        //设置vp_content默认显示第一个页面
        vp_content.setCurrentItem(0);
        //给vp_content添加页面变化监听器
        vp_content.addOnPageChangeListener(this);
    }


    //初始化翻页视图

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }
    // 在翻页结束后触发。arg0表示当前滑到了哪一个页面
    @Override
    public void onPageSelected(int position) {
        Toast.makeText(this, "您翻到的手机品牌是：" + goodsList.get(position).name, Toast.LENGTH_SHORT).show();
    }
    // 翻页状态改变时触发。arg0取值说明为：0表示静止，1表示正在滑动，2表示滑动完毕
    // 在翻页过程中，状态值变化依次为：正在滑动→滑动完毕→静止
    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
