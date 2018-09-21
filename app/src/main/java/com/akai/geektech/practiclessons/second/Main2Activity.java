package com.akai.geektech.practiclessons.second;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.akai.geektech.practiclessons.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private List<Cat> cats;

    public static Intent newInstance(Context context) {
        return new Intent(context, Main2Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cats = fillCatList();
        ListView listView = findViewById(R.id.listView);
        CatArrayAdapter adapter = new CatArrayAdapter(this, R.layout.list_item_act2, cats);
        listView.setAdapter(adapter);
    }

    private List<Cat> fillCatList() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Васька", "кот"));
        cats.add(new Cat("Мурка", "кошка"));
        cats.add(new Cat("Барсик", "пацан"));
        cats.add(new Cat("Лиза", "котейка"));
        cats.add(new Cat("Черноглаз", "котэ"));
        cats.add(new Cat("Пивовар", "котэ"));

        return cats;
    }
}
