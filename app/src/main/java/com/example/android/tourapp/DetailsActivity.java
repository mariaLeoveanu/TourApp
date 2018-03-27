package com.example.android.tourapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView mAddress;
    TextView mPhone;
    TextView mTimetable;
    TextView mName;
    ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        mAddress = findViewById(R.id.tv_address);
        mPhone = findViewById(R.id.tv_phone);
        mTimetable = findViewById(R.id.tv_timetable);
        mName = findViewById(R.id.tv_name);
        mImage = findViewById(R.id.iv_place);

        final Intent intent = getIntent();
        final Place place = (Place) intent.getSerializableExtra("Current place");

        final String currentName = place.getmName();
        mName.setText(currentName);

        String currentAddress = place.getmAddress();
        mAddress.setText(currentAddress);
        mAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGeo = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:"+place.getmLatitude() + ","+ place.getmLongitude() +
                        "?q="+ place.getmLatitude() + ","+ place.getmLongitude() +
                        "(" + currentName + ")"));
                startActivity(intentGeo);
            }
        });

        final String currentPhone = place.getmPhoneNumber();
        mPhone.setText(currentPhone);
        mPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + currentPhone));
                startActivity(intentCall);
            }
        });

        String currentTimetable = place.getmOpenHours();
        mTimetable.setText(currentTimetable);

        int currentImageResource = place.getmImageResource();
        mImage.setImageResource(currentImageResource);



    }
}
