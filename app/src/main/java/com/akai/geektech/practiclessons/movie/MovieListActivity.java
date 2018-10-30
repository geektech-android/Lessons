package com.akai.geektech.practiclessons.movie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.akai.geektech.practiclessons.R;

import java.util.ArrayList;
import java.util.List;

public class MovieListActivity extends AppCompatActivity implements MovieClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
    }

    @Override
    public void onItemClicked(Movie movie) {
        View fragmentContainer = findViewById(R.id.container_movie_details);
        if (fragmentContainer != null) {
            MovieDetailsFragment fragment = new MovieDetailsFragment();
            fragment.setMovie(movie);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container_movie_details, fragment);
            transaction.commit();
        } else {
            Intent intent = new Intent(this, MovieDetailsActivity.class);
            intent.putExtra("key_movie", movie);
            startActivity(intent);
        }
    }
}
