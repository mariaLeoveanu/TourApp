package com.example.android.tourapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container,false);
        ReturnList getPlaces = new ReturnList();
        final ArrayList<Place> places = getPlaces.returnList("HOTELS");
        PlacesAdapter arrayAdapter = new PlacesAdapter(getActivity(),places);
        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("Current place", places.get(i));
                startActivity(intent);
            }
        });
        return rootView;
    }

    public HotelsFragment() {
        // Required empty public constructor
    }


}
