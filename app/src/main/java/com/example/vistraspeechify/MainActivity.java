package com.example.vistraspeechify;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    SharedPreferences sharedPreferences, sharedPreferences2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        sharedPreferences = getSharedPreferences("GoingMain", MODE_PRIVATE);
        sharedPreferences2 = getSharedPreferences("Edition", MODE_PRIVATE);
        boolean firstTime = sharedPreferences.getBoolean("test", true);
        boolean isEdited = sharedPreferences2.getBoolean("isEdited", true);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (firstTime) {
            fragmentTransaction.replace(R.id.flFragment, new Main_Fragment());
            fragmentTransaction.commit();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("test", false);
            editor.apply();
        }
        else if (isEdited) {
            fragmentTransaction.replace(R.id.flFragment, new Profile_Fragment());
            fragmentTransaction.commit();
            SharedPreferences.Editor editor = sharedPreferences2.edit();
            editor.putBoolean("isEdited", false);
            editor.apply();
        }
        else {
            fragmentTransaction.replace(R.id.flFragment, new Home_Fragment());
            fragmentTransaction.commit();
        }
        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
    }
    Home_Fragment firstFragment = new Home_Fragment();
    Add_Fragment secondFragment = new Add_Fragment();
    Profile_Fragment thirdFragment = new Profile_Fragment();
    Translation_Fragment fourthFragment = new Translation_Fragment();
    Main_Fragment fifthFragment = new Main_Fragment();


    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (item.getItemId()) {
            case R.id.home:

                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.flFragment, firstFragment);
                fragmentTransaction.commit();
                return true;

            case R.id.translate:

                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.flFragment, fourthFragment);
                fragmentTransaction.commit();
                return true;

            case R.id.add:
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.flFragment, secondFragment);
                fragmentTransaction.commit();
                return true;


            case R.id.profile:
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.flFragment, thirdFragment);
                fragmentTransaction.commit();
                return true;

            case R.id.main:
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.flFragment, fifthFragment);
                fragmentTransaction.commit();
                return true;
        }
        return false;
    }
}
