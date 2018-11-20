package com.akai.geektech.practiclessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mText;
    private ProgressBar mProgress;
    private Button mBtnStart, mBtnStop, mBtnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = findViewById(R.id.text_log);
        mProgress = findViewById(R.id.progress);

        mBtnStart = findViewById(R.id.btn_start);
        mBtnStop = findViewById(R.id.btn_stop);
        mBtnCheck = findViewById(R.id.btn_check_lock);

        mBtnStart.setOnClickListener(this);
        mBtnStop.setOnClickListener(this);
        mBtnCheck.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start: startHardWork();
                break;
            case R.id.btn_stop: stopHardWork();
                break;
            case R.id.btn_check_lock: checkUiThread();
                break;
        }
    }

    private void startHardWork() {
        mProgress.setVisibility(View.VISIBLE);
        startService(new Intent(this, HardWorkService.class));
    }

    private void stopHardWork() {
        mProgress.setVisibility(View.GONE);
        stopService(new Intent(this, HardWorkService.class));
    }

    private void checkUiThread() {
        mText.setText("Text is changed");
    }
}
