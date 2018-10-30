package com.akai.geektech.practiclessons.movie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.akai.geektech.practiclessons.R;

import java.util.List;

public class MovieAdapter extends BaseAdapter {
    private Context context;
    private List<Movie> movies;

    MovieAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movies = movieList;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Movie getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Movie movie = movies.get(i);
        ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_movie_list, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
           holder = (ViewHolder) view.getTag();
        }

        holder.title.setText(movie.getTitle());
        holder.duration.setText(String.valueOf(movie.getDuration()));
        return view;
    }

    private static class ViewHolder {
        private TextView title, duration;

        ViewHolder(View view) {
            title = view.findViewById(R.id.movie_title);
            duration = view.findViewById(R.id.movie_duration);
        }
    }
}
