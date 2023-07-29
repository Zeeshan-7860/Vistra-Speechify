package com.example.vistraspeechify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_DURATION = 2000; // 3 seconds
    private static final int PROGRESS_MAX = 100; // Maximum progress value for the loading bar
    private MediaPlayer mediaPlayer;
    private ProgressBar loadingBar;
    private int progressStatus = 0;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        ImageView splashImage = findViewById(R.id.splash_image);
        loadingBar = findViewById(R.id.loading_bar);
        cardView = findViewById(R.id.cardbackload1);
        mediaPlayer = MediaPlayer.create(this, R.raw.iii);

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        splashImage.startAnimation(fadeIn);
        PlaybackParams params = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            params = mediaPlayer.getPlaybackParams();
            params.setSpeed(0.85f); // Adjust the playback speed as needed (0.5f is half speed)
            mediaPlayer.setPlaybackParams(params);
            mediaPlayer.start();
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < PROGRESS_MAX) {
                    progressStatus += 1;
                    // Update the progress bar on the main UI thread
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            cardView.setVisibility(CardView.VISIBLE);
                            loadingBar.setProgress(progressStatus);
                        }
                    });

                    try {
                        // Simulate loading delay
                        Thread.sleep(25);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Wait for 2 seconds before starting the fade-out animation
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Start the fade-out animation

                Animation fadeOut = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.fade_out);

                splashImage.startAnimation(fadeOut);
                cardView.setVisibility(CardView.INVISIBLE);
                splashImage.setVisibility(ImageView.INVISIBLE);

                // Wait for the remaining duration before starting the MainActivity
                try {
                    Thread.sleep(SPLASH_DURATION - 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent intent = new Intent(SplashScreen.this, Login.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        }).start();
    }

}
