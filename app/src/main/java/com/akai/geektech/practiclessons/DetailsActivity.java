package com.akai.geektech.practiclessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {
    public static final String EXTRA_CAT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        DetailFragment workoutDetailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);

        int catId = (int) getIntent().getExtras().get(EXTRA_CAT_ID);
        workoutDetailFragment.setCatId(catId);
    }
}
