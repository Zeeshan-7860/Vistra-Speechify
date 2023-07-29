package com.example.vistraspeechify;

import static com.example.vistraspeechify.R.id.SigPhoneNo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

public class Signup extends AppCompatActivity {
TextView gotoLogin;

Button signup;


EditText Sname,Semail,Sphone,Spassword,Saddress;
    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
View view,view2,view3,view4,view5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FirebaseApp.initializeApp(Signup.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mAuth = FirebaseAuth.getInstance();
        gotoLogin = findViewById(R.id.go_to_login);
        signup = findViewById(R.id.Signupsubmit);
        view = findViewById(R.id.view1);
        Sname = findViewById(R.id.SignupName);
        Semail = findViewById(R.id.SignupEmail);
        Sphone = findViewById(R.id.SigPhoneNo);
        Spassword = findViewById(R.id.password_edit_text);
        Saddress = findViewById(R.id.SignupAddress);
        view2 = findViewById(R.id.view2);
        view3 = findViewById(R.id.view3);
        view4 = findViewById(R.id.view4);
        view5 = findViewById(R.id.password_input_layout);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        gotoLogin.startAnimation(animation);
        signup.startAnimation(animation);
        view.startAnimation(animation);
        view2.startAnimation(animation);
        view3.startAnimation(animation);
        view4.startAnimation(animation);
        view5.startAnimation(animation);
        gotoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, Login.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = Sname.getText().toString().trim();
                String PhoneNumber = Sphone.getText().toString().trim();
                String Address = Saddress.getText().toString().trim();
                String Email = Semail.getText().toString().trim();
                String Password = Spassword.getText().toString().trim();
                if (Name.isEmpty() || PhoneNumber.isEmpty() || Address.isEmpty() || Email.isEmpty() || Password.isEmpty()) {
                    CustomToast.showToast(Signup.this, "Please fill all the fields");
                } else {
                    mAuth.createUserWithEmailAndPassword(Email, Password)
                            .addOnCompleteListener(Signup.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        String userId = user.getUid();
                                        DocumentReference userDocRef = db.collection("users").document(userId);

                                        // Create a user object with the required fields
                                        Users newUser = new Users(Name, PhoneNumber, Address, Email, Password);
                                        CustomToast.showToast(Signup.this, "User Registered Successfully");
                                        Intent intent = new Intent(Signup.this, Login.class);
                                        startActivity(intent);
                                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                                        finish();
                                        // User registered successfully
                                        // You can navigate to another activity here
                                        userDocRef.set(newUser)
                                                .addOnSuccessListener(aVoid -> {
                                                })
                                                .addOnFailureListener(e -> {
                                                    // Handle any errors
                                                });
                                    } else {
                                       // Toast.makeText(Signup.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
//
            }
        });
        }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}