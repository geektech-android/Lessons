package com.akai.geektech.practiclessons.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.akai.geektech.practiclessons.R;

public class MovieDetailsActivity extends AppCompatActivity {
    private TextView mTitle, mGenre, mDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        mTitle = findViewById(R.id.movie_title);
        mGenre = findViewById(R.id.movie_genre);
        mDuration = findViewById(R.id.movie_duration);

        Intent intent = getIntent();
        if (intent != null) {
            Movie movie = intent.getParcelableExtra("key_movie");
            mTitle.setText(movie.getTitle());
            mGenre.setText(movie.getGenre());
            mDuration.setText(String.valueOf(movie.getDuration()));
        }

    }
}
