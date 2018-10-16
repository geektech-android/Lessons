package com.akai.geektech.practiclessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button.setOnClickListener(listener);
        button2.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String action = "android.intent.action.VIEW";
            switch (view.getId()) {
                case R.id.btn1:
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    Intent intent2 = new Intent();
                    intent2.setAction(action);
                    startActivity(intent2);
                    break;
            }

        }
    };
}
