package com.forest.a03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.forest.a03.util.Utils;

public class FrameActivity extends AppCompatActivity implements View.OnClickListener {
    private FrameLayout fl_content;//声明一个框架布局对象
    //定义一个颜色数组
    private int[] mColorArray = {
            Color.BLACK,Color.WHITE,Color.RED,Color.YELLOW,Color.GREEN,
            Color.BLUE,Color.CYAN,Color.MAGENTA,Color.GRAY,Color.DKGRAY
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        //从布局文件中获取名叫fl_content的框架布局
        fl_content = findViewById(R.id.fl_content);
        findViewById(R.id.btn_add_frame).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_add_frame){
            int random = (int)(Math.random() * 10 % 10);
            //创建一个新的视图对象
            View vv = new View(this);
            //把该视图的背景设置为随机颜色
            vv.setBackgroundColor(mColorArray[random]);
            //声明一个布局参数，其中宽度与上级持平，高度为随机高度
            LinearLayout.LayoutParams ll_params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, Utils.dip2px(this,(random + 1) * 30));
            //给改视图设置布局参数
            vv.setLayoutParams(ll_params);
            //设置该视图的长按监听器
            vv.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View vvv) {
                    //一旦监听到长按事件，就从相对布局中删除该视图
                    fl_content.removeView(vvv);
                    return  true;
                }
            });
            //往框架中添加该视图
            fl_content.addView(vv);
        }
    }
}
