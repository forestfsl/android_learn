package com.forest.a03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_relative_xml).setOnClickListener(this);
        findViewById(R.id.btn_relative_code).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_relative_xml){
            Intent intent = new Intent(this,RelativeXmlActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_relative_code) {
            Intent intent = new Intent(this, RelativeCodeActivity.class);
            startActivity(intent);
        }
    }
}
