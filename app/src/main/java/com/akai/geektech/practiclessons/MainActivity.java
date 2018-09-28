package com.akai.geektech.practiclessons;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements FragmentListMovie.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClicked(long id) {
        View fragmentCntr = findViewById(R.id.fragment_container);
        if (fragmentCntr != null) {
            DetailsFragment detailsFragment = new DetailsFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            Bundle bundle = new Bundle();
            bundle.putLong(DetailsActivity.EXTRA_MOVIE_ID, id);
            detailsFragment.setArguments(bundle);

            fragmentTransaction.replace(R.id.fragment_container, detailsFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.commit();
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra(DetailsActivity.EXTRA_MOVIE_ID, id);
            startActivity(intent);
        }
    }
}
