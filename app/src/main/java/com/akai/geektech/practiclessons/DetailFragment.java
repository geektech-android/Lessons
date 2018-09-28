package com.akai.geektech.practiclessons;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
    private long mCatId;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mCatId = savedInstanceState.getLong("catId");
        } else {
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            CounterFragment counterFragment = new CounterFragment();
            transaction.replace(R.id.counter_container, counterFragment);
            transaction.addToBackStack(null);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            transaction.commit();
        }

        return inflater.inflate(R.layout.fragment_details_cat, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView titleTv = view.findViewById(R.id.title_cat);
            TextView descr = view.findViewById(R.id.description);

            Cat cat = Cat.cats[(int) mCatId];
            titleTv.setText(cat.getName());
            descr.setText(cat.getDescription());
        }
    }

    public void setCatId(long id) {
        this.mCatId = id;
    }
}
