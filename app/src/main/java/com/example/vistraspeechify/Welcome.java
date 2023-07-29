package com.example.vistraspeechify;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
Button btn;
TextView textView;
CheckBox checkBox;
CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btn = findViewById(R.id.welcome_button);
        checkBox = findViewById(R.id.terms_checkbox);
        cardView = findViewById(R.id.cardback);
        textView = findViewById(R.id.intro_textview);
        Animation slideIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        textView.startAnimation(slideIn);
        checkBox.startAnimation(slideIn);
        cardView.startAnimation(slideIn);

        checkBox.setOnClickListener(v -> {
            if(checkBox.isChecked()){
                btn.setEnabled(true);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Animation slideIn = AnimationUtils.loadAnimation(Welcome.this, R.anim.fade_in);
                        btn.startAnimation(slideIn);
                        btn.setVisibility(VISIBLE);
                    }

                }, 500);
            }
            else{
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Animation slideIn = AnimationUtils.loadAnimation(Welcome.this, R.anim.fade_out);
                        btn.startAnimation(slideIn);
                        btn.setVisibility(View.INVISIBLE);
                    }

                }, 500);
            }
        });
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(Welcome.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });
    }

}