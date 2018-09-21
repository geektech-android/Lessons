package com.akai.geektech.practiclessons.third;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.akai.geektech.practiclessons.R;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    private Button buttonAdd;
    private ListView listView;
    private List<Person> persons;

    public static Intent newInstance(Context context) {
        return new Intent(context, Main3Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        buttonAdd = findViewById(R.id.btnAdd);
        listView = findViewById(R.id.listView);

        persons = fillPersonList();
        final CustomAdapter adapter = new CustomAdapter(this, persons);
        listView.setAdapter(adapter);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person = new Person();
                person.setName("Tom");
                person.setAge(21);
                person.setGender("male");
                adapter.add(person);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                persons.remove(i);
//                adapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                persons.remove(i);
                adapter.notifyDataSetChanged();
                return true;
            }
        });
    }

    private List<Person> fillPersonList() {
        List<Person> personList = new ArrayList<>();
        Person person;
        boolean isMale = true;
        for (int i=0; i < 20; i++) {
            person = new Person();
            person.setName("Person " + i);
            person.setAge(i+10);
            person.setGender(isMale ? "male" : "female");
            personList.add(person);
            isMale = !isMale;
        }
        return personList;
    }
}
