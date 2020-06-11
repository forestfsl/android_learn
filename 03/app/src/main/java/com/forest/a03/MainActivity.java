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
        findViewById(R.id.btn_frame).setOnClickListener(this);
        findViewById(R.id.btn_checkbox).setOnClickListener(this);
        findViewById(R.id.btn_switch_default).setOnClickListener(this);
        findViewById(R.id.btn_switch_ios).setOnClickListener(this);
        findViewById(R.id.btn_radio_horizontal).setOnClickListener(this);
        findViewById(R.id.btn_radio_vertical).setOnClickListener(this);
        findViewById(R.id.btn_spinner_dropdown).setOnClickListener(this);
        findViewById(R.id.btn_spinner_dialog).setOnClickListener(this);
        findViewById(R.id.btn_spinner_icon).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_relative_xml){
            Intent intent = new Intent(this,RelativeXmlActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_relative_code) {
            Intent intent = new Intent(this, RelativeCodeActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_frame) {
            Intent intent = new Intent(this, FrameActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_checkbox) {
            Intent intent = new Intent(this, CheckboxActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_switch_default) {
            Intent intent = new Intent(this, SwitchDefaultActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_switch_ios) {
            Intent intent = new Intent(this, SwitchIOSActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_radio_horizontal) {
            Intent intent = new Intent(this, RadioHorizontalActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_radio_vertical) {
            Intent intent = new Intent(this, RadioVerticalActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_spinner_dropdown) {
            Intent intent = new Intent(this, SpinnerDropdownActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_spinner_dialog) {
            Intent intent = new Intent(this, SpinnerDialogActivity.class);
            startActivity(intent);
        }else if (v.getId() == R.id.btn_spinner_icon) {
            Intent intent = new Intent(this, SpinnerIconActivity.class);
            startActivity(intent);
        }
    }
}
