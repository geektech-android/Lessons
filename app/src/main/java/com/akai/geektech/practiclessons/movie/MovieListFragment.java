package com.akai.geektech.practiclessons.movie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.akai.geektech.practiclessons.R;

import java.util.ArrayList;
import java.util.List;

public class MovieListFragment extends Fragment {
    private List<Movie> movies;
    private MovieClickListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (MovieClickListener) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_list, container, false);
        movies = prepareData();
        ListView listView = view.findViewById(R.id.lv_movie);
        MovieAdapter adapter = new MovieAdapter(getContext(), movies);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(clickListener);
        return view;
    }

    AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            listener.onItemClicked(movies.get(i));
        }
    };

    private List<Movie> prepareData() {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Dedpool", 1990, 120, "action", "USA", 1));
        list.add(new Movie("Terminator", 2000, 145, "action", "USA", 1));
        list.add(new Movie("Spider man", 2005, 90, "action", "Germany", 1));
        list.add(new Movie("Avangers", 2018, 105, "action", "China", 1));
        list.add(new Movie("Stars wars 2", 1991, 120, "action", "Kyrgyzstan", 10));
        return list;
    }
}
