package com.akai.geektech.practiclessons.second;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.akai.geektech.practiclessons.R;

import java.util.List;

public class CatArrayAdapter extends ArrayAdapter<Cat> {

    public CatArrayAdapter(@NonNull Context context, int resource, List<Cat> cats) {
        super(context, resource, cats);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Cat cat = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_act2, null);
        }

        ((TextView) convertView.findViewById(R.id.cat_name)).setText(cat.getName());
        ((TextView) convertView.findViewById(R.id.cat_gender)).setText(cat.getGender());

        return convertView;
    }
}
