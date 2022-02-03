package com.example.getir.getir.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.getir.getir.tabfragments.BeveragesFragment;
import com.example.getir.getir.tabfragments.FruitsFragment;
import com.example.getir.getir.tabfragments.NewProductFragment;
import com.example.getir.getir.tabfragments.SpecialOfferFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 1:
                return new SpecialOfferFragment();
            case 2:
                return new BeveragesFragment();
            case 3:
                return new FruitsFragment();

        }
        return new NewProductFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
