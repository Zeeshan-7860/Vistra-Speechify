package com.example.vistraspeechify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Favourites extends AppCompatActivity {

    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        SharedPreferences sharedPreferences = getSharedPreferences("Favourite", MODE_PRIVATE);
        String text = sharedPreferences.getString("text", "");
        String translation = sharedPreferences.getString("translation", "");
        ArrayList<String> data = new ArrayList<>();
        data.add(text);
        ArrayList<String> translated = new ArrayList<>();
        translated.add(translation);
        adapter = new CustomAdapter(this, data, translated);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }


}
