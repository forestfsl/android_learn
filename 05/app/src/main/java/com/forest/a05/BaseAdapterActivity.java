package com.forest.a05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.forest.a05.adapter.PlanetListAdapter;
import com.forest.a05.bean.Planet;

import java.util.ArrayList;

public class BaseAdapterActivity extends AppCompatActivity {
    private ArrayList<Planet> planets;//声明一个行星队列


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);
        initPlanetSpinner();
    }

    //初始化行星列表的下拉框
    private void initPlanetSpinner(){
        //获取默认的行星队列即水星、金星、地球、火星、木星、土星
        planets = Planet.getDefaultList();
        //构建一个行星列表的适配器
        PlanetListAdapter adapter = new PlanetListAdapter(this,planets);
        //从布局文件中获取名叫sp_planet 的下拉框
        Spinner sp = findViewById(R.id.sp_planet);
        //设置下拉框的标题
        sp.setPrompt("请选择行星");
        //设置下拉框的列表适配器
        sp.setAdapter(adapter);
        //设置下拉框默认显示第一项
        sp.setSelection(0);
        //给下拉框设置选择监听器，一旦用户选择某一项，就出发监听器的onItemSelected方法
        sp.setOnItemSelectedListener(new MySelectedListener());
    }

    //定义一个选择监听器，它实现了接口OnItemSelectedListener
    private class MySelectedListener implements AdapterView.OnItemSelectedListener{
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(BaseAdapterActivity.this, "您选择的是" + planets.get(position).name, Toast.LENGTH_LONG).show();
        }
        // 未选择时的处理方法，通常无需关注
        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }


    }
}
