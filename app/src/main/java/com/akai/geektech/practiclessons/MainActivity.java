package com.akai.geektech.practiclessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1, textView2;
    private EditText editText;
//    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.hello1);
        textView2 = findViewById(R.id.hello2);
        editText = findViewById(R.id.edit1);
//        button = findViewById(R.id.button1);

        textView1.setText("Hello from activity code");
        textView2.setText("This is TextView 2");
    }

    public void onClick(View view) {
        String text = editText.getText().toString();
        textView1.setText(text);
    }
}
