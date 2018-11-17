package com.akai.geektech.practiclessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.akai.geektech.practiclessons.Broadcast.WiFiReceiver;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    WiFiReceiver wiFiReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView = findViewById(R.id.textViewId);
        wiFiReceiver = new WiFiReceiver();

        Intent intent = new Intent();
    }
}
