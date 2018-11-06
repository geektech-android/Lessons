package com.akai.geektech.practiclessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AppleActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String ACTION = "com.akai.geektech.practiclessons.THIRD_ACTION";
    EditText emailText;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apple_activity);
        emailText = findViewById(R.id.apple_edit_text);
        btn = findViewById(R.id.apple_back_button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String email = emailText.getText().toString();
        if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Intent intent = new Intent();
            intent.putExtra("email",email);
            setResult(RESULT_OK, intent);
            finish();
        }
        else {
            Toast toast = Toast.makeText(this,"Введите, пожалуйста, свою почту",Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
