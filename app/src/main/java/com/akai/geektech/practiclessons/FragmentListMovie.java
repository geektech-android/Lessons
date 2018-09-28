package com.akai.geektech.practiclessons;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentListMovie extends Fragment {
    private OnFragmentInteractionListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implemented xxxListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listmovie, container, false);
        ListView listView = view.findViewById(R.id.listView_movie);

        MovieAdapter adapter = new MovieAdapter(getActivity(), StorageUtil.getInstance().getMovies());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view1, pos, id) -> listener.onItemClicked(id));

        return view;
    }

    interface OnFragmentInteractionListener {

        void onItemClicked(long id);
    }
}
