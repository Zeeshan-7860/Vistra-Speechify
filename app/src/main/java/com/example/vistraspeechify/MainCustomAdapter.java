package com.example.vistraspeechify;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class MainCustomAdapter extends ArrayAdapter<String> {
    private final Context mContext;
    private final List<String> mItems;
    private final List<Integer> pics;

    public MainCustomAdapter(Context context, List<String> items,List<Integer> pics) {
        super(context, android.R.layout.simple_spinner_item, items);
        mContext = context;
        mItems = items;
        this.pics = pics;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.custom_spinner_item, parent, false);
        }
        TextView textView = view.findViewById(R.id.spinner_item_text);
        ImageView imageView = view.findViewById(R.id.imaggeee);
        String item = mItems.get(position);
        int pic = pics.get(position);
        imageView.setImageResource(pic);
        textView.setText(item);

        return view;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.custom_spinner_item, parent, false);
        }
        TextView textView = view.findViewById(R.id.spinner_item_text);
        ImageView imageView = view.findViewById(R.id.imaggeee);
        String item = mItems.get(position);
        int pic = pics.get(position);
        imageView.setImageResource(pic);
        textView.setText(item);
        return view;
    }
}

