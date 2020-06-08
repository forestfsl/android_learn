package com.forest.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        //当前页面布局采用的是res/layout/activity_main.xml
        setContentView(R.layout.activity_main);
//        //获取名叫hello的TextView空间
//        TextView tv_hello = findViewById(R.id.tv_hello);
//        //设置TextView 控件的文字内容
//        tv_hello.setText("今天天气不错，下雨下得很爽");
//        //设置TextView控件的文字颜色
//        tv_hello.setTextColor(Color.RED);
//        //设置TextView控件的文字大小
//        tv_hello.setTextSize(30);



        findViewById(R.id.btn_px).setOnClickListener(this);
        findViewById(R.id.btn_color).setOnClickListener(this);
        findViewById(R.id.btn_screen).setOnClickListener(this);
        findViewById(R.id.btn_margin).setOnClickListener(this);
        findViewById(R.id.btn_gravity).setOnClickListener(this);
        findViewById(R.id.btn_scroll).setOnClickListener(this);
        findViewById(R.id.btn_marquee).setOnClickListener(this);
        findViewById(R.id.btn_bbs).setOnClickListener(this);
        findViewById(R.id.btn_click).setOnClickListener(this);
        findViewById(R.id.btn_scale).setOnClickListener(this);
        findViewById(R.id.btn_capture).setOnClickListener(this);
        findViewById(R.id.btn_icon).setOnClickListener(this);
        findViewById(R.id.btn_state).setOnClickListener(this);
        findViewById(R.id.btn_shape).setOnClickListener(this);
        findViewById(R.id.btn_nine).setOnClickListener(this);
        findViewById(R.id.btn_calculator).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_px) {
            Intent intent = new Intent(this, PxActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_color) {
            Intent intent = new Intent(this, ColorActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_screen) {
            Intent intent = new Intent(this, ScreenActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_margin) {
            Intent intent = new Intent(this, MarginActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_gravity) {
            Intent intent = new Intent(this, GravityActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_scroll) {
            Intent intent = new Intent(this, ScrollActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_marquee) {
            Intent intent = new Intent(this, MarqueeActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_bbs) {
            Intent intent = new Intent(this, BbsActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_click) {
            Intent intent = new Intent(this, ClickActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_scale) {
            Intent intent = new Intent(this, ScaleActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_capture) {
            Intent intent = new Intent(this, CaptureActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_icon) {
            Intent intent = new Intent(this, IconActivity.class);
            startActivity(intent);
        }
    }
}
