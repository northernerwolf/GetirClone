package com.example.getir.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.getir.NextActivity;
import com.example.getir.R;

public class AddressesActivity extends AppCompatActivity {

    ImageView back_arrow;
    RelativeLayout add_home, add_city, add_town;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);

        back_arrow = findViewById(R.id.back_main);
        add_home = findViewById(R.id.add_addreshome);
        add_city = findViewById(R.id.add_addrscity);
        add_town = findViewById(R.id.add_addrestown);

        add_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddressesActivity.this, AddAddressActivity.class);
                startActivity(intent);
            }
        });
        add_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddressesActivity.this, AddAddressActivity.class);
                startActivity(intent);
            }
        });
        add_town.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddressesActivity.this, AddAddressActivity.class);
                startActivity(intent);
            }
        });


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(1);
                finish();
            }
        });

    }
}