package com.example.databindingbasic1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingbasic1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mBind = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        mBind.textView1.setText("Hello Nepal");
//        mBind.setTextName("Hello Israel");
        Model model = new Model("Hello Kathmandu");
        mBind.setTextName(model);

    }
}