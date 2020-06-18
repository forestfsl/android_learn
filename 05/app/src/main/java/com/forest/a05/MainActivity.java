package com.forest.a05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_date_picker).setOnClickListener(this);
        findViewById(R.id.btn_time_picker).setOnClickListener(this);
        findViewById(R.id.btn_base_adapter).setOnClickListener(this);
        findViewById(R.id.btn_list_view).setOnClickListener(this);
        findViewById(R.id.btn_list_cart).setOnClickListener(this);
        findViewById(R.id.btn_grid_view).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_date_picker) {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_time_picker) {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_base_adapter) {
            Intent intent = new Intent(this, BaseAdapterActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_list_view) {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_list_cart) {
            Intent intent = new Intent(this, ShoppingCartActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_grid_view) {
            Intent intent = new Intent(this, GridViewActivity.class);
            startActivity(intent);
        }
    }
}
