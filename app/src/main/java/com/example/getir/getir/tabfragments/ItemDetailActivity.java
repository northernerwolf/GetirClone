package com.example.getir.getir.tabfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.getir.R;

public class ItemDetailActivity extends AppCompatActivity {

    AppCompatImageView imageView ;
    ImageView imageback;
    TextView title, cost, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        imageView = findViewById(R.id.image_detail);
        title = findViewById(R.id.title_detail);
        cost = findViewById(R.id.cost_detail);
        weight = findViewById(R.id.weight_detail);
        imageback = findViewById(R.id.back_main);

        imageback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(1);
                finish();
            }
        });


        Intent intent = getIntent();
        String Title = intent.getExtras().getString("title");
        String costs = intent.getExtras().getString("cost");
        String weights = intent.getExtras().getString("weight");
        int image = intent.getExtras().getInt("image");


        title.setText(Title);
        cost.setText(costs);
        weight.setText(weights);
        imageView.setImageResource(image);

    }
}