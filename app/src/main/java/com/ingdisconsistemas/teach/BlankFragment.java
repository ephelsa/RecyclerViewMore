package com.ingdisconsistemas.teach;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private View rootView;
    private RecyclerView mRecycler;
    private RecyclerAdapter mAdapter;

    public BlankFragment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_blank, container, false);


        mRecycler = rootView.findViewById(R.id.mRecyclerView);

        mRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecycler.setHasFixedSize(true);

        inflateRecycler();

        return rootView;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void inflateRecycler() {
        List<RecyclerModel> modelList = new ArrayList<>();

        modelList.add(new RecyclerModel("Chilly Willy"));

        for (int i = 0; i < 9; i++) {
            modelList.add(new RecyclerModel(getContext().getDrawable(R.drawable.cosa_fea), "Cosa fea " + i));
        }

        mAdapter = new RecyclerAdapter(modelList);
        mRecycler.setAdapter(mAdapter);
    }

}
