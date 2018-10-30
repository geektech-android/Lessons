package com.akai.geektech.practiclessons.movie;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akai.geektech.practiclessons.R;

public class MovieDetailsFragment extends Fragment {
    private TextView mTitle, mGenre, mDuration;
    private Movie mMovie;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_movie_details, container, false);
        mTitle = view.findViewById(R.id.movie_title);
        mGenre = view.findViewById(R.id.movie_genre);
        mDuration = view.findViewById(R.id.movie_duration);

        if (mMovie != null) {
            mTitle.setText(mMovie.getTitle());
            mGenre.setText(mMovie.getGenre());
            mDuration.setText(String.valueOf(mMovie.getDuration()));
        }
        return view;
    }

    public void setMovie(Movie movie) {
        mMovie = movie;
    }
}
