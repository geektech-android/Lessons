package com.akai.geektech.practiclessons;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    public static final String ACTION = "com.akai.geektech.practiclessons.THIRD_ACTION";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}
