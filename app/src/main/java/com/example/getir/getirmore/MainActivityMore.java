package com.example.getir.getirmore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.getir.R;
import com.example.getir.getir.HomeGetirFragment;
import com.example.getir.getirtaksi.HomeFragmentTaksi;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivityMore extends AppCompatActivity {

    FloatingActionButton back_main_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_more);


        BottomNavigationView bottomNav = findViewById(R.id.bottomnavi);
        back_main_menu = findViewById(R.id.back_main_menu);
        back_main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(2);
                finish();
            }
        });
        bottomNav.setOnNavigationItemSelectedListener(navlistener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmrntcontainer, new HomeFragment()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectFragment = null;
                    switch (item.getItemId()){
                        case R.id.home:
                            selectFragment = new HomeFragment();
                            break;
                        case R.id.search:
                            selectFragment = new SearchFragment();
                            break;
                        case R.id.profil:
                            selectFragment = new AccountFragment();
                            break;
                        case R.id.gift:
                            selectFragment = new GiftFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmrntcontainer, selectFragment).commit();
                    return true;
                }
            };
}