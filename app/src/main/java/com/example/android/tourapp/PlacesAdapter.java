package com.example.android.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class PlacesAdapter extends ArrayAdapter<Place> {

     PlacesAdapter(Activity context, ArrayList<Place> placeList) {
        super(context, 0, placeList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View placeView = convertView;
        if (placeView == null) {
            //inflate a view if one doesn't already exist
            placeView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_layout, parent, false);
        }
        Place place = getItem(position);

        //set images and texts for the text views and image views for albums

        TextView placeName = placeView.findViewById(R.id.tv_current_place);
        placeName.setText(place.getmName());

        TextView artistName = placeView.findViewById(R.id.tv_place_description);
        artistName.setText(place.getmDescription());

        return placeView;
    }
}
