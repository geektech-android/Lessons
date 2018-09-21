package com.akai.geektech.practiclessons.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akai.geektech.practiclessons.first.Main1Activity;
import com.akai.geektech.practiclessons.fourth.Main4Activity;
import com.akai.geektech.practiclessons.second.Main2Activity;
import com.akai.geektech.practiclessons.R;
import com.akai.geektech.practiclessons.third.Main3Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1: goToFirstActivity(); break;
            case R.id.btn2: goToSecondActivity(); break;
            case R.id.btn3: goToThirdActivity(); break;
            case R.id.btn4: goToFourthActivity(); break;
        }
    }

    private void goToFirstActivity() {
        startActivity(Main1Activity.newInstance(this));
    }

    private void goToSecondActivity() {
        startActivity(Main2Activity.newInstance(this));
    }

    private void goToThirdActivity() {
        startActivity(Main3Activity.newInstance(this));
    }

    private void goToFourthActivity() {
        startActivity(Main4Activity.newInstance(this));
    }
}
