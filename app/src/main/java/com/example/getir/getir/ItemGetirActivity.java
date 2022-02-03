package com.example.getir.getir;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.getir.NextActivity;
import com.example.getir.R;
import com.example.getir.getir.adapters.FragmentAdapter;
import com.example.getir.getir.tabfragments.HomeProductsFragment;
import com.example.getir.getirmore.MainActivityMore;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class ItemGetirActivity extends AppCompatActivity {


    FloatingActionButton back_main_menu;
    CardView back_mian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_getir);


        BottomNavigationView bottomNav = findViewById(R.id.bottomnavi);

        back_mian = findViewById(R.id.back_main_page);

        back_mian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemGetirActivity.this, NextActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });

        bottomNav.setOnNavigationItemSelectedListener(navlistener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmrntcontainer, new HomeProductsFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectFragment = null;
                    switch (item.getItemId()){
                        case R.id.home:
                            selectFragment = new HomeProductsFragment();
                            break;
                        case R.id.search:
                            selectFragment = new SearchGerirFragment();
                            break;
                        case R.id.profil:
                            selectFragment = new AccontGetirFragment();
                            break;
                        case R.id.gift:
                            selectFragment = new GiftGetirFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmrntcontainer, selectFragment).commit();
                    return true;
                }
            };
}