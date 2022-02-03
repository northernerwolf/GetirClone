package com.example.getir.getir;

import android.content.Intent;
import android.hardware.lights.LightState;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.getir.NextActivity;
import com.example.getir.R;
import com.example.getir.activity.AddressesActivity;
import com.example.getir.adapter.SliderAdapter;
import com.example.getir.getir.adapters.GetirMainAdapter;
import com.example.getir.getir.models.Main_model;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class HomeGetirFragment extends Fragment {

    List<Main_model> main_modelList;
    SliderView sliderView;
    RelativeLayout select_addres;

    int[] images = {R.drawable.image2,
            R.drawable.image3,
            R.drawable.image1,
            R.drawable.image3,
            R.drawable.image1
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home_getir, container, false);

        sliderView = v.findViewById(R.id.slider_getir);
        select_addres = v.findViewById(R.id.toolbar_go_address);
        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.COLOR);
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderView.startAutoCycle();

        main_modelList = new ArrayList<>();

        main_modelList.add(new Main_model("New Products",R.drawable.newproduct));
        main_modelList.add(new Main_model("Special Offers",R.drawable.specials));
        main_modelList.add(new Main_model("Beverages",R.drawable.beverage));
        main_modelList.add(new Main_model("Fruits & Veg",R.drawable.fruits));
        main_modelList.add(new Main_model("Baked Goods",R.drawable.baked));
        main_modelList.add(new Main_model("Food",R.drawable.food));
        main_modelList.add(new Main_model("Snacks",R.drawable.snacks));
        main_modelList.add(new Main_model("Ice Cream",R.drawable.icecream));
        main_modelList.add(new Main_model("Milk & Dairy",R.drawable.milk));
        main_modelList.add(new Main_model("Breakfast",R.drawable.breakfast));
        main_modelList.add(new Main_model("Ready to Eat",R.drawable.readyeat));
        main_modelList.add(new Main_model("Fit & Form",R.drawable.fitform));
        main_modelList.add(new Main_model("Personal Care",R.drawable.personalcare));
        main_modelList.add(new Main_model("Home Care",R.drawable.homecare));
        main_modelList.add(new Main_model("Home & Living",R.drawable.homeliving));
        main_modelList.add(new Main_model("Tech",R.drawable.teach));
        main_modelList.add(new Main_model("Pet Food",R.drawable.petfood));
        main_modelList.add(new Main_model("Baby Care",R.drawable.babycare));
        main_modelList.add(new Main_model("Sex Health",R.drawable.shealth));

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recyclerview_main);
        GetirMainAdapter getirMainAdapter = new GetirMainAdapter(getContext(),main_modelList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),4));
        recyclerView.setAdapter(getirMainAdapter);

        select_addres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddressesActivity.class);
                startActivity(intent);
            }
        });
        return v;


    }
}