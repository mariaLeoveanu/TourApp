package com.example.android.tourapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;


import static android.graphics.Color.parseColor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
        ViewPager viewPager = findViewById(R.id.viewpager);
        FragmentPagerAdapter pagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                Fragment fragment = new Fragment();
                switch (position){
                    case 0:{
                        fragment =new MuseumsFragment();
                        break;
                    }
                    case 1:{
                        fragment =new RestaurantsFragment();
                        break;
                    }
                    case 2:{
                        fragment =new HotelsFragment();
                        break;
                    }
                    case 3:{
                        fragment = new OtherFragment();
                        break;
                    }
                }
                return fragment;
            }
        };
        viewPager.setAdapter(pagerAdapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.white));
        tabLayout.setTabTextColors(parseColor("#E0E0E0"), parseColor("#FFFFFF"));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_museums);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_restaurants);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_hotels);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_other);
    }
}
