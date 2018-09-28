package com.akai.geektech.practiclessons;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CounterFragment extends Fragment {
    private int mCounter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mCounter = savedInstanceState.getInt("mouse");
        }

        View root = inflater.inflate(R.layout.fragment_counter, container, false);
        Button counterBtn = root.findViewById(R.id.button_counter);
        final TextView textView = root.findViewById(R.id.quantity);
        textView.setText("Поймал мышей: " + mCounter);

        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Поймал мышей: " + ++mCounter);
            }
        });

        return root;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("mouse", mCounter);
    }
}
