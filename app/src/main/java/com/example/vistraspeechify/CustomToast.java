package com.example.vistraspeechify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast {
    public static void showToast(Context context, String message) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View layout = inflater.inflate(R.layout.toast_layout, null);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = layout.findViewById(R.id.imageView_icon);
        imageView.setImageResource(R.drawable.ic_launcher);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = layout.findViewById(R.id.textView_message);
        textView.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
