package com.akai.geektech.practiclessons.third;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.akai.geektech.practiclessons.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private List<Person> persons;

    public CustomAdapter(Context context, List<Person> personList) {
        this.context = context;
        this.persons = personList;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Person getItem(int i) {
        return persons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public void add(Person person) {
        persons.add(person);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Person person = getItem(i);
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.list_item_act3, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.name.setText(person.getName());
        holder.age.setText(String.valueOf(person.getAge()));
        holder.gender.setText(person.getGender());

        return view;
    }

    private static class ViewHolder {
        private TextView name;
        private TextView age;
        private TextView gender;

        ViewHolder(View view) {
            name = view.findViewById(R.id.name);
            age = view.findViewById(R.id.age);
            gender = view.findViewById(R.id.gender);
        }
    }
}
