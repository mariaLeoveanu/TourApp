package com.example.android.tourapp;

import java.io.Serializable;


class Place implements Serializable {
    private int mImageResource;
    private String mName;
    private String mAddress;
    private String mPhoneNumber;
    private String mOpenHours;
    private String mLatitude;
    private String mLongitude;
    private int mDescription;

    Place(String name, int image, String address, String phone, String hours, String latitude, String longitude, int description) {
        mName = name;
        mImageResource = image;
        mAddress = address;
        mPhoneNumber = phone;
        mOpenHours = hours;
        mLatitude = latitude;
        mLongitude = longitude;
        mDescription = description;
    }

    String getmName() {
        return mName;
    }

    int getmImageResource() {
        return mImageResource;
    }

    String getmAddress() {
        return mAddress;
    }

    String getmPhoneNumber() {
        return mPhoneNumber;
    }

    String getmOpenHours() {
        return mOpenHours;
    }

    String getmLatitude() {
        return mLatitude;
    }

    String getmLongitude() {
        return mLongitude;
    }

    int getmDescription(){
        return mDescription;
    }
}
