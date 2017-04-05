package com.dhl.demo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TempFragment extends Fragment {


    private View rootView;

    public TempFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_temp, container, false);
        initUI(rootView);
        return rootView;
    }

    private void initUI(View rootView) {
        RecyclerView rvData = (RecyclerView) rootView.findViewById(R.id.rvData);
        rvData.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvData.setAdapter(new SimpleAdapter());
        rvData.setHasFixedSize(false);
    }

}
