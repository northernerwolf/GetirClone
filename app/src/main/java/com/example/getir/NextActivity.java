package com.example.getir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.getir.activity.AddressesActivity;
import com.example.getir.activity.SearchActivity;
import com.example.getir.adapter.SliderAdapter;
import com.example.getir.getir.MainActivityGetir;
import com.example.getir.getirfood.MainActivityFood;
import com.example.getir.getirlocals.MainActivityLocal;
import com.example.getir.getirmore.MainActivityMore;
import com.example.getir.getirtaksi.MainActivityTaksi;
import com.example.getir.getirwater.MainActivityWater;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class NextActivity extends AppCompatActivity {

    SliderView sliderView;
    RelativeLayout toolbar_next_page, search, getir_1, getir_more, getir_local, getir_food, getir_water, getir_taksi;
    CardView getirmore, getir, getirlocal, getirfood, getirwater;

    int[] image = {R.drawable.image2,
            R.drawable.image3,
            R.drawable.image1,
            R.drawable.image3,
            R.drawable.image1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        sliderView = findViewById(R.id.slider);
        toolbar_next_page = findViewById(R.id.toolbar_next_page);
        search = findViewById(R.id.search_next);
        getir_1 = findViewById(R.id.getir_1);
        getir_more = findViewById(R.id.gtir_more);
        getir_food = findViewById(R.id.getir_food);
        getir_local = findViewById(R.id.getir_local);
        getir_taksi = findViewById(R.id.getir_taksi);
        getir_water = findViewById(R.id.getir_water);
//        RecyclerView recyclerView = findViewById(R.id.recyclerview_next);
//        recyclerView.setHasFixedSize(true);

        SliderAdapter sliderAdapter = new SliderAdapter(image);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.COLOR);
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderView.startAutoCycle();

        toolbar_next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, AddressesActivity.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
        getir_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivityGetir.class);
                startActivity(intent);
            }
        });
        getir_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivityMore.class);
                startActivity(intent);
            }
        });
        getir_water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivityWater.class);
                startActivity(intent);
            }
        });
        getir_taksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivityTaksi.class);
                startActivity(intent);
            }
        });
        getir_local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivityLocal.class);
                startActivity(intent);
            }
        });
        getir_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivityFood.class);
                startActivity(intent);
            }
        });


//        List<NextItem> nextItems = new ArrayList<>();
//
//        nextItems.add(new NextItem(R.drawable.image1));
//        nextItems.add(new NextItem(R.drawable.image2));
//        nextItems.add(new NextItem(R.drawable.image3));
//        nextItems.add(new NextItem(R.drawable.image3));
//        nextItems.add(new NextItem(R.drawable.image2));
//
//        recyclerView.setLayoutManager(
//                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
//        );
//        PostAdapter adapter = new PostAdapter(nextItems);
//        recyclerView.setAdapter(adapter);


    }
}