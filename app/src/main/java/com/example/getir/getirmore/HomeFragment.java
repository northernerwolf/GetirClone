package com.example.getir.getirmore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.getir.R;
import com.example.getir.adapter.SliderAdapter;
import com.example.getir.getir.adapters.GetirMainAdapter;
import com.example.getir.getir.models.Main_model;
import com.example.getir.getirmore.moreadapter.GetirMoreMainAdapter;
import com.example.getir.getirmore.moremodels.Main_model_more;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    List<Main_model_more> main_model_more;
    SliderView sliderView;

    int[] images2 = {R.drawable.image2,
            R.drawable.image3,
            R.drawable.image1,
            R.drawable.image3,
            R.drawable.image1
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home, container, false);

        sliderView = v.findViewById(R.id.slider_getir);

        SliderAdapter sliderAdapter = new SliderAdapter(images2);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.COLOR);
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderView.startAutoCycle();

        main_model_more = new ArrayList<>();

        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image2));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image3));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image2));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image3));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image2));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image3));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image2));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image2));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));
        main_model_more.add(new Main_model_more("New Products",R.drawable.image1));

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recyclerview_getirmore_main);
        GetirMoreMainAdapter getirMoreMainAdapter = new GetirMoreMainAdapter(getContext(),main_model_more);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(getirMoreMainAdapter);
        return v;
    }
}