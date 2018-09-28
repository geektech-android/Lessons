package com.akai.geektech.practiclessons;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailsFragment extends Fragment {
    private TextView titleView, yearView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        titleView = view.findViewById(R.id.details_title_movie);
        yearView = view.findViewById(R.id.details_year_movie);

        if (getArguments() != null) {
            long id = getArguments().getLong(DetailsActivity.EXTRA_MOVIE_ID);
            Movie movie = StorageUtil.getInstance().getMovieById(id);
            titleView.setText(movie.getTitle());
            yearView.setText(movie.getYear());
        }

        return view;
    }
}
