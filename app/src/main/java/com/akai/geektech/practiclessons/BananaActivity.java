package com.akai.geektech.practiclessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BananaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banana_activity);
        Button btn = findViewById(R.id.banana_back_button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        EditText nameText = findViewById(R.id.banana_edit_text);
        String s = nameText.getText().toString();
        if(!TextUtils.isEmpty(s)) {
            Intent intent = new Intent();
            intent.putExtra("name", s);
            setResult(RESULT_OK, intent);
            finish();
        }
        else {
            Toast toast = Toast.makeText(this,"Введите, пожалуйста, своё имя",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
