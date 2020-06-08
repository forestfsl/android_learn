package com.forest.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ShapeActivity extends AppCompatActivity implements View.OnClickListener {
    private View c_content;//声明一个椭圆对象



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
        //从布局文件中获取名叫v_content的视图
        c_content = findViewById(R.id.v_content);
        //给btn_rect 设置点击监听器
        findViewById(R.id.btn_rect).setOnClickListener(this);
        //给btn_oval 设置点击监听器
        findViewById(R.id.btn_oval).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_rect){
            //把矩形形状设置为v_content 的背景
            c_content.setBackgroundResource(R.drawable.shape_rect_gold);
        }else if (v.getId() == R.id.btn_oval){
            //把椭圆形状设置为v_content 的背景
            c_content.setBackgroundResource(R.drawable.shape_oval_rose);
        }
    }
}
