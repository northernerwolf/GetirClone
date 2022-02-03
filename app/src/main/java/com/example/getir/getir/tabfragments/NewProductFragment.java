package com.example.getir.getir.tabfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.getir.R;
import com.example.getir.getir.adapters.GetirMainAdapter;
import com.example.getir.getir.adapters.GetirProductsAdapter;
import com.example.getir.getir.models.GetirProduct_model;
import com.example.getir.getir.models.Main_model;

import java.util.ArrayList;
import java.util.List;

public class NewProductFragment extends Fragment {

    List<GetirProduct_model> getirProduct_modelList;
    RecyclerView recycler_newproducts;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_new_product, container, false);

        getirProduct_modelList = new ArrayList<>();

        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.nuts));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.ayva));
        getirProduct_modelList.add(new GetirProduct_model("Ayva","300ml","9.4 $",R.drawable.avagado));

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recyclerview_getir_products);
        GetirProductsAdapter getirProductsAdapter = new GetirProductsAdapter(getContext(),getirProduct_modelList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerView.setAdapter(getirProductsAdapter);

        return v;
    }
}