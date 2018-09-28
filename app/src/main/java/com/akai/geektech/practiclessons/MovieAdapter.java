package com.akai.geektech.practiclessons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MovieAdapter extends BaseAdapter {
    private Context context;
    private List<Movie> movieList;

    MovieAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Movie getItem(int i) {
        return movieList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return movieList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_list_movie, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Movie movie = movieList.get(i);
        viewHolder.textViewTitle.setText(movie.getTitle());
        viewHolder.textViewYear.setText(movie.getYear());
        return view;
    }

    private static class ViewHolder {
        private TextView textViewTitle;
        private TextView textViewYear;

        ViewHolder(View view) {
            textViewTitle = view.findViewById(R.id.title_movie_item);
            textViewYear = view.findViewById(R.id.year_movie_item);
        }
    }
}
