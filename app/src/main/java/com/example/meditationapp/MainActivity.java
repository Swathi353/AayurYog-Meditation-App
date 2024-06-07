package com.example.meditationapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
       /* implements BottomNavigationView
        .OnNavigationItemSelectedListener*/ {


    BottomNavigationView bottomNavigationView;
    private ImageView meditate;
    private ImageView pranayam;
    private ImageView podcast;
    private ImageView  vlog1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meditate =findViewById(R.id.meditate);
        meditate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,meditationactivity.class);
                startActivity(intent);
            }
        });

        pranayam = findViewById(R.id.pranayam);
        pranayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,pranayamactivity.class);
                startActivity(intent);
            }
        });
        podcast = findViewById(R.id.podcast);
        podcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,podcastactivity.class);
                startActivity(intent);
            }
        });
        vlog1 =findViewById(R.id.vlog1);
        vlog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,vlogActivity.class);
                startActivity(intent);
            }
        });
       /* bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }
    homeFragment homeFragment = new homeFragment();
    sleepFragment sleepFragment = new sleepFragment();
    profileFragment profileFragment = new profileFragment();

    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {

        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, homeFragment)
                        .commit();
                return true;

            case R.id.sleep:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, sleepFragment)
                        .commit();
                return true;

            case R.id.profile:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, profileFragment)
                        .commit();
                return true;
        }
        return false;
    }*/
}}
