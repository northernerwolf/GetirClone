package com.example.getir.getir;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.getir.R;
import com.example.getir.getir.adapters.GiftFragmentAdapter;
import com.google.android.material.tabs.TabLayout;


public class GiftGetirFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private GiftFragmentAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_gift_getir, container, false);


        tabLayout = v.findViewById(R.id.tablayout_gift);
        viewPager2 = v.findViewById(R.id.viewpager2);

        tabLayout.addTab(tabLayout.newTab().setText("Promotions"));
        tabLayout.addTab(tabLayout.newTab().setText("Announcements"));

        FragmentManager fragmentManager = getParentFragmentManager();
        adapter = new GiftFragmentAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
        return v;
    }
}