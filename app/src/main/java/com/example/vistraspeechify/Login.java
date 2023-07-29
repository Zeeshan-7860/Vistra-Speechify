package com.example.vistraspeechify;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
TextView gotoRegister,heading;
ImageButton google,facebook,linkedin;
EditText email,password;
View email1;

private FirebaseAuth mAuth;
View password1;
public static SharedPreferences sharedPreferences;

CheckBox rememberMe;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();
        sharedPreferences = getSharedPreferences("login_prefs", MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);
        if (isLoggedIn) {
            // User is already logged in, so go directly to the main app screen
            Intent intent = new Intent(Login.this, Welcome.class);
            startActivity(intent);
            finish();
        }
        gotoRegister = findViewById(R.id.go_to_signup);
        login = findViewById(R.id.submit);
        google = findViewById(R.id.google_login_button);
        facebook = findViewById(R.id.facebook_login_button);
        linkedin = findViewById(R.id.linkedin_login_button);
        email = findViewById(R.id.Loginemail);
        rememberMe = findViewById(R.id.remember_me_checkbox);
        password = findViewById(R.id.Loginpassword);
        heading = findViewById(R.id.heading_textview);
        email1 = findViewById(R.id.materalemail);
        password1 = findViewById(R.id.materalpassword);
        google.setVisibility(View.INVISIBLE);
        facebook.setVisibility(View.INVISIBLE);
        linkedin.setVisibility(View.INVISIBLE);
        rememberMe.setVisibility(View.INVISIBLE);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        heading.startAnimation(animation);
        gotoRegister.startAnimation(animation);
        login.startAnimation(animation);
        email1.startAnimation(animation);
        password1.startAnimation(animation);
        //////////////////////////////////////////////////////////////////////////////////////
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_minus);
        new Handler().postDelayed(() -> {
            google.startAnimation(animation2);
            facebook.startAnimation(animation2);
            linkedin.startAnimation(animation2);
            rememberMe.startAnimation(animation2);
            google.setVisibility(View.VISIBLE);
            facebook.setVisibility(View.VISIBLE);
            linkedin.setVisibility(View.VISIBLE);
            rememberMe.setVisibility(View.VISIBLE);
        }, 1300);

        //////////////////////////////////////////////////////////////////////////////////////
        gotoRegister.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Signup.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        });
        login.setOnClickListener(v -> {

                    String Email = email.getText().toString().trim();
                    String Password = password.getText().toString().trim();

                    if (Email.isEmpty() || Password.isEmpty()) {
                        CustomToast.showToast(this, "Please fill all the fields");
                    } else {
                        mAuth.signInWithEmailAndPassword(Email, Password)
                                .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {
                                            SharedPreferences.Editor editor = sharedPreferences.edit();
                                            editor.putBoolean("isLoggedIn", true);
                                            editor.apply();
                                            FirebaseUser user = mAuth.getCurrentUser();
                                            CustomToast.showToast(Login.this, "Login Successful");
                                            Intent intent = new Intent(Login.this, Welcome.class);
                                            startActivity(intent);
                                            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                                            // You can navigate to another activity here
                                        } else {
                                            CustomToast.showToast(Login.this, "Login Failed");
                                        }
                                    }
                                });
                    }

//            Intent intent = new Intent(Login.this, Welcome.class);
//            startActivity(intent);
//            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//            finish();
        });


    }
}