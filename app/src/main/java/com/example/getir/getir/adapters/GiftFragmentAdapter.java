package com.example.getir.getir.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.getir.getir.tabfragments.AnnouncementFragment;
import com.example.getir.getir.tabfragments.PromotionsFragment;

public class GiftFragmentAdapter extends FragmentStateAdapter {


    public GiftFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1){
            return new PromotionsFragment();
        }
        return new AnnouncementFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
