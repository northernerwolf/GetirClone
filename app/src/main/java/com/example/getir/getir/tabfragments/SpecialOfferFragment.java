package com.example.getir.getir.tabfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.getir.R;
import com.example.getir.getir.adapters.GetirProductsAdapter;
import com.example.getir.getir.adapters.SpecialOfferAdapter;
import com.example.getir.getir.models.GetirProduct_model;
import com.example.getir.getir.models.Special_offer_model;

import java.util.ArrayList;
import java.util.List;


public class SpecialOfferFragment extends Fragment {

    List<Special_offer_model> special_offer_modelList;
    RecyclerView recycler_newproducts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =  inflater.inflate(R.layout.fragment_special_offer, container, false);

        special_offer_modelList = new ArrayList<>();

        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        special_offer_modelList.add(new Special_offer_model("Ayva","300ml","9.4 $",R.drawable.avagado));


        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recyclerview_getir_special);
        SpecialOfferAdapter specialOfferAdapter = new SpecialOfferAdapter(getContext(),special_offer_modelList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerView.setAdapter(specialOfferAdapter);


        return v;
    }
}