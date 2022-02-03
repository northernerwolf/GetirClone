package com.example.getir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.getir.databinding.ActivityMainBinding;
import com.example.getir.getirmore.AccountFragment;
import com.example.getir.getirmore.GiftFragment;
import com.example.getir.getirmore.HomeFragment;
import com.example.getir.getirmore.SearchFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

//    CoordinatorLayout  main_menu;
    FloatingActionButton main_menu;

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

}