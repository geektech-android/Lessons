package com.akai.geektech.practiclessons.first;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.akai.geektech.practiclessons.R;

public class Main1Activity extends AppCompatActivity {

    public static Intent newInstance(Context context) {
        return new Intent(context, Main1Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        String[] countries = {"Бразилия", "Аргентина", "Кыргызстан", "Казахстан", "Россия", "Китай", "Уругвай"};

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        listView.setAdapter(adapter);
    }
}
