package com.akai.geektech.practiclessons;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private FragmentFirst firstFragment;
    private SecondFragment secondFragment;
    private CheckBox checkStack;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkStack = findViewById(R.id.checkBoxStack);
        firstFragment = new FragmentFirst();
        secondFragment = new SecondFragment();
    }

    public void onClick(View view) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.button_add:
                fragmentTransaction.add(R.id.frame_container, firstFragment);
                break;
            case R.id.button_remove:
                fragmentTransaction.remove(firstFragment);
                break;
            case R.id.button_replace:
                fragmentTransaction.replace(R.id.frame_container, secondFragment);
                break;
        }
        if (checkStack.isChecked()) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
    }
}
