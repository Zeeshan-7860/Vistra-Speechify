package com.example.vistraspeechify;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Home_Fragment extends Fragment {
CardView cardView1,cardView2,cardView3;
ImageView imageView,imageView2;
TextView textView,textView2,textView3,textView4;

    private FirebaseAuth mAuth;

    SharedPreferences sharedPreferences2;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    public Home_Fragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        String userId = user.getUid();
        sharedPreferences2 = requireActivity().getSharedPreferences("New_Profile", MODE_PRIVATE);
        boolean isEdited = sharedPreferences2.getBoolean("isChanged", true);


        DocumentReference userDocRef = db.collection("users").document(userId);
        userDocRef.get()
                .addOnSuccessListener(documentSnapshot -> {
                    if (documentSnapshot.exists()) {
                        Users users = documentSnapshot.toObject(Users.class);

                        // Access the user's information
                        String image = sharedPreferences2.getString("image", "");
                        if (!image.isEmpty()) {
                            byte[] decodedBytes = Base64.decode(image, Base64.DEFAULT);
                            Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
                            imageView.setImageBitmap(bitmap);
                        }
                        else {
                            imageView.setImageResource(R.drawable.ron);
                        }
                        String name = users.getName();
                        textView2.setText(name);

                        if (isEdited) {
                            String image1 = sharedPreferences2.getString("image", "");
                            if (!image1.isEmpty()) {
                                byte[] decodedBytes = Base64.decode(image1, Base64.DEFAULT);
                                Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
                                imageView.setImageBitmap(bitmap);
                            }
                            else {
                                imageView.setImageResource(R.drawable.ron);
                            }
                            textView2.setText(sharedPreferences2.getString("name", "User"));
                        }


                        // Use the retrieved user information as needed
                    } else {
                        // Document does not exist (user details not found)
                    }
                })
                .addOnFailureListener(e -> {
                    // Handle any errors
                });

        textView = view.findViewById(R.id.emoji);
        cardView1 = view.findViewById(R.id.translate_card);
        cardView2 = view.findViewById(R.id.scan_card);
        imageView2 = view.findViewById(R.id.feedback);
        cardView3 = view.findViewById(R.id.speak_card);
        imageView = view.findViewById(R.id.profile_image);
        textView2 = view.findViewById(R.id.homeusername);

        textView3 = view.findViewById(R.id.welcome);
        textView4 = view.findViewById(R.id.hi);
        textView3.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.wave);
        Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in);
        Animation animation3 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in);

        cardView1.startAnimation(animation2);
        cardView2.startAnimation(animation2);
        cardView3.startAnimation(animation2);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTranslation();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMAinWork();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSpeech();
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setVisibility(View.INVISIBLE);
                textView.startAnimation(animation3);
                textView2.startAnimation(animation3);
                textView3.startAnimation(animation3);
                imageView.startAnimation(animation3);
                textView4.startAnimation(animation3);
                imageView2.startAnimation(animation3);
                textView3.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                textView.startAnimation(animation);
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(),Feedback.class);
                        startActivity(intent);
                    }
                });
            }

        }, 1000);



        return view;
    }

    private void navigateToTranslation() {
        Fragment selectedFragment = new Translation_Fragment();
        FragmentManager fragmentManager =getParentFragmentManager(); // Use getChildFragmentManager()
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, selectedFragment);
        fragmentTransaction.commit();
    }
    private void navigateToMAinWork() {
        Fragment selectedFragment = new Main_Fragment();
        FragmentManager fragmentManager =getParentFragmentManager(); // Use getChildFragmentManager()
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, selectedFragment);
        fragmentTransaction.commit();
    }
    private void navigateToSpeech() {
        Fragment selectedFragment = new Add_Fragment();
        FragmentManager fragmentManager =getParentFragmentManager(); // Use getChildFragmentManager()
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, selectedFragment);
        fragmentTransaction.commit();
    }

    private void navigateToProfile() {
        Fragment selectedFragment = new Profile_Fragment();
        FragmentManager fragmentManager =getParentFragmentManager(); // Use getChildFragmentManager()
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, selectedFragment);
        fragmentTransaction.commit();
    }





}