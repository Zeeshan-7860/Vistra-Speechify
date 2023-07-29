package com.example.vistraspeechify;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import static android.app.Activity.RESULT_OK;
import static android.content.Context.MODE_PRIVATE;
import static android.view.View.INVISIBLE;

import static com.example.vistraspeechify.Login.sharedPreferences;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Profile_Fragment extends Fragment {
    CardView cardView, cardView1,cardView2;
    TextView textView, textView1, textView2,textView3,textView4,Username;

    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    EditText editText;
    private static final String DATABASE_NAME = "my_Info";
    private static final String TABLE_NAME = "my_table";

    LinearLayout linearLayoutnew;

    public static SharedPreferences sharedPreferences1,sharedPreferences2;

    private SQLiteDatabase database;

    ImageView imageView, imageView1, imageView2, imageView3,imageView4,imageView5,imageView6,imageView7,button;
    public Profile_Fragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_, container, false);

        cardView = view.findViewById(R.id.cardbackprofile1);
        Username = view.findViewById(R.id.dpusername);
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        String userId = user.getUid();

        DocumentReference userDocRef = db.collection("users").document(userId);
        sharedPreferences2 = requireActivity().getSharedPreferences("New_Profile", MODE_PRIVATE);
        boolean isEdited = sharedPreferences2.getBoolean("isChanged", true);






        cardView2 = view.findViewById(R.id.cardbackprofile3);
       imageView7 = view.findViewById(R.id.editpic);
        textView4 = view.findViewById(R.id.edit);
        imageView1 = view.findViewById(R.id.gmailimage);
        imageView5 = view.findViewById(R.id.favourites);
        imageView2 = view.findViewById(R.id.addressimage);
        imageView3 = view.findViewById(R.id.phonepic);
        imageView6 = view.findViewById(R.id.info);
        imageView4 = view.findViewById(R.id.passwordpic);
        textView = view.findViewById(R.id.email);
        textView3 = view.findViewById(R.id.favourites1);
        button = view.findViewById(R.id.logout);
        textView1 = view.findViewById(R.id.address);
        textView2 = view.findViewById(R.id.phone);
        linearLayoutnew = view.findViewById(R.id.linearlayout);
        editText = view.findViewById(R.id.password);
        imageView1.setVisibility(INVISIBLE);
        imageView2.setVisibility(INVISIBLE);
        imageView3.setVisibility(INVISIBLE);
        imageView4.setVisibility(INVISIBLE);
        textView.setVisibility(INVISIBLE);
        textView1.setVisibility(INVISIBLE);
        textView2.setVisibility(INVISIBLE);
        editText.setVisibility(INVISIBLE);
        textView4.setVisibility(INVISIBLE);
        imageView7.setVisibility(INVISIBLE);
        linearLayoutnew.setVisibility(INVISIBLE);
        imageView5.setVisibility(INVISIBLE);
        textView3.setVisibility(INVISIBLE);

        cardView1 = view.findViewById(R.id.cardbackprofile2);
        imageView = view.findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in);
        Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in);

        cardView.startAnimation(animation);
        cardView1.startAnimation(animation);
        cardView2.startAnimation(animation);
        imageView.startAnimation(animation);
        imageView6.startAnimation(animation);
        button.startAnimation(animation);





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
                        String phone = users.getPhone();
                        String address = users.getAddress();
                        String email = users.getEmail();
                        String password = users.getPassword();

                        Username.setText(name);
                        textView.setText(email);
                        textView1.setText(address);
                        textView2.setText(phone);
                        editText.setText(password);

                        if (isEdited){
                            String image1 = sharedPreferences2.getString("image", "");
                            if (!image1.isEmpty()) {
                                byte[] decodedBytes = Base64.decode(image1, Base64.DEFAULT);
                                Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
                                imageView.setImageBitmap(bitmap);
                            }
                            String name1 = sharedPreferences2.getString("name", "");
                            String email1 = sharedPreferences2.getString("email", "");
                            String phone1 = sharedPreferences2.getString("phone", "");
                            String address1 = sharedPreferences2.getString("address", "");
                            String password1 = sharedPreferences2.getString("password", "");
                            Username.setText(name1);
                            textView.setText(email1);
                            textView1.setText(address1);
                            textView2.setText(phone1);
                            editText.setText(password1);

                        }






                        // Use the retrieved user information as needed
                    } else {
                        // Document does not exist (user details not found)
                    }
                })
                .addOnFailureListener(e -> {
                    // Handle any errors
                });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLogoutDropdown();
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                imageView1.startAnimation(animation1);
                textView.startAnimation(animation1);
                imageView2.startAnimation(animation1);
                textView1.startAnimation(animation1);
                imageView3.startAnimation(animation1);
                textView2.startAnimation(animation1);
                imageView4.startAnimation(animation1);
                textView4.startAnimation(animation1);
                imageView7.startAnimation(animation1);
                editText.startAnimation(animation1);
                linearLayoutnew.startAnimation(animation1);
                imageView5.startAnimation(animation1);
                textView3.startAnimation(animation1);
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                textView1.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                imageView7.setVisibility(View.VISIBLE);

                linearLayoutnew.setVisibility(View.VISIBLE);
                editText.setVisibility(View.VISIBLE);
                imageView5.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), Favourites.class);
                        startActivity(intent);
                    }
                });
                imageView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), About.class);
                        startActivity(intent);

                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        userDocRef.get()
                                .addOnSuccessListener(documentSnapshot -> {
                                    if (documentSnapshot.exists()) {
                                        Users users = documentSnapshot.toObject(Users.class);

                                        // Access the user's information
                                        String name = users.getName();
                                        String phone = users.getPhone();
                                        String address = users.getAddress();
                                        String email = users.getEmail();
                                        String password = users.getPassword();


                                        Intent intent = new Intent(getContext(), NewProfileEdit.class);
                                        intent.putExtra("name", name);
                                        intent.putExtra("phone", phone);
                                        intent.putExtra("address", address);
                                        intent.putExtra("email", email);
                                        intent.putExtra("password", password);
                                        startActivity(intent);

                                        // Use the retrieved user information as needed
                                    } else {
                                        // Document does not exist (user details not found)
                                    }
                                })
                                .addOnFailureListener(e -> {
                                    // Handle any errors
                                });

                    }
                });
            }

        }, 1300);


        return view;
    }

    private void showLogoutDropdown() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout? \nAll Settings will be lost.");

        // Set the selected dropdown item as the positive button
        builder.setPositiveButton("Yes, I'm sure", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Perform logout action here
                // For example, navigate to the login screen
                sharedPreferences1 = requireActivity().getSharedPreferences("login_prefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences1.edit();
                editor.putBoolean("isLoggedIn", false);
                editor.apply();
                sharedPreferences2 = requireActivity().getSharedPreferences("New_Profile", MODE_PRIVATE);
                SharedPreferences.Editor editor1 = sharedPreferences2.edit();
                editor1.putBoolean("isChanged", false);
                editor1.putString("name", "");
                editor1.putString("email", "");
                editor1.putString("phone", "");
                editor1.putString("address", "");
                editor1.putString("password", "");
                editor1.putString("image", "");
                editor1.apply();
                CustomToast.showToast(getContext(), "Logged Out Successfully");


                Intent intent = new Intent(getContext(), Login.class);
                startActivity(intent);

                // Add your logic based on the selected item
            }
        });
        builder.setNegativeButton("No", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void onResume() {
        super.onResume();
        // Update the selected item of the BottomNavigationView
        ((MainActivity) requireActivity()).bottomNavigationView.setSelectedItemId(R.id.profile);
    }





}