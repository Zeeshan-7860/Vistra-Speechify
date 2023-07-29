package com.example.vistraspeechify;

import static com.example.vistraspeechify.Login.sharedPreferences;
import static com.example.vistraspeechify.Profile_Fragment.sharedPreferences1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class NewProfileEdit extends AppCompatActivity {
    ImageView profileImage;

    Button saveButton, clearButton;
    private SQLiteDatabase database;

    public static Bitmap bitmap;

    SharedPreferences sharedPreferences, sharedPreferences2;
    EditText name, email, phone, address,password;
    private static final int REQUEST_CAMERA_PERMISSION = 1;
    private static final int REQUEST_IMAGE_CAPTURE = 2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_profile_edit);

        profileImage = findViewById(R.id.editimage);
        saveButton = findViewById(R.id.SAVE);
        clearButton = findViewById(R.id.clear_text);
        name = findViewById(R.id.editname);
        email = findViewById(R.id.editemail);
        phone = findViewById(R.id.editphone);
        address = findViewById(R.id.editaddress);
        password = findViewById(R.id.editpassword);

        Intent intent = getIntent();
        String name1 = intent.getStringExtra("name");
        String email1 = intent.getStringExtra("email");
        String phone1 = intent.getStringExtra("phone");
        String address1 = intent.getStringExtra("address");
        String password1 = intent.getStringExtra("password");

        name.setText(name1);
        email.setText(email1);
        phone.setText(phone1);
        address.setText(address1);
        password.setText(password1);



        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageSourceDialog();
            }
        });
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save all the changes


                String name1 = name.getText().toString();
                String email1 = email.getText().toString();
                String phone1 = phone.getText().toString();
                String address1 = address.getText().toString();
                String password1 = password.getText().toString();
                sharedPreferences = getSharedPreferences("Edition", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isEdited", true);
                editor.apply();
                sharedPreferences2 = getSharedPreferences("New_Profile", MODE_PRIVATE);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                String encodedImage = Base64.encodeToString(byteArray, Base64.DEFAULT);
                SharedPreferences.Editor editor1 = sharedPreferences2.edit();
                editor1.putString("image", encodedImage);
                editor1.putBoolean("isChanged", true);
                editor1.putString("name", name1);
                editor1.putString("email", email1);
                editor1.putString("phone", phone1);
                editor1.putString("address", address1);
                editor1.putString("password", password1);
                editor1.apply();
                Intent intent = new Intent(NewProfileEdit.this, MainActivity.class);
                startActivity(intent);
                CustomToast.showToast(NewProfileEdit.this, "Profile Updated");
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear all the fields
                name.setText("");
                email.setText("");
                phone.setText("");
                address.setText("");
                password.setText("");
                profileImage.setImageResource(R.drawable.logo);
                CustomToast.showToast(NewProfileEdit.this, "Cleared");


            }
        });
    }
    private void showImageSourceDialog() {
        String[] options = {"Camera", "Gallery"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Image Source");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {
                    // Open camera
                    openCamera();

                } else if (which == 1) {
                    // Open gallery
                    openGallery();

                }
            }
        });
        builder.show();
    }
    private static final int PICK_IMAGE_REQUEST = 1; // Request code for gallery picker

    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            Uri imageUri = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                // Set the selected image to your ImageView
                profileImage.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK && data != null) {
            bitmap = (Bitmap) data.getExtras().get("data");
            // Set the captured image to your ImageView
            profileImage.setImageBitmap(bitmap);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

    private void openCamera() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);
        } else {
            launchCamera();
        }
    }

    private void launchCamera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CAMERA_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                launchCamera();
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////

}