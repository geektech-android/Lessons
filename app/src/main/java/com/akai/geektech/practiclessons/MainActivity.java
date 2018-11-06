package com.akai.geektech.practiclessons;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView1;
    final int REQUEST_CODE_BANANA = 1;
    final int REQUEST_CODE_APPLE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.banana_button);
        Button button2 = findViewById(R.id.apple_button);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        textView1 = findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        String action = "com.akai.geektech.practiclessons.THIRD_ACTION";
        switch (view.getId()) {
            case R.id.banana_button:
                Intent intent1 = new Intent(this, BananaActivity.class);
                startActivityForResult(intent1, REQUEST_CODE_BANANA);
                break;
            case R.id.apple_button:
                Intent intent2 = new Intent();
                intent2.setAction(action);
                startActivityForResult(intent2, REQUEST_CODE_APPLE);
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case REQUEST_CODE_BANANA:
                if (data == null) {
                    return;
                } else {
                    String name = data.getStringExtra("name");
                    String newTextView = name + " любит бананы, а ты?";
                    textView1.setText(newTextView);
                }
                break;
            case REQUEST_CODE_APPLE:
                if (data == null) {
                    return;
                } else {
                    String email = data.getStringExtra("email");
                    String newTextView2 = email + " любит яблоки, а ты?";
                    textView1.setText(newTextView2);
                }
                break;


        }

    }
}
