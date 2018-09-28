package com.akai.geektech.practiclessons;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE_ID = "com.akai.geektech.practiclessons.extra_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        long id = getIntent().getLongExtra(DetailsActivity.EXTRA_MOVIE_ID, -1);

        DetailsFragment fragment = new DetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(DetailsActivity.EXTRA_MOVIE_ID, id);
        fragment.setArguments(bundle);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_details, fragment);
        transaction.commit();
    }
}
