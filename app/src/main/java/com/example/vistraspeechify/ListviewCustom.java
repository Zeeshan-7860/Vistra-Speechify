package com.example.vistraspeechify;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


class CustomAdapter extends BaseAdapter {
    private ArrayList<String> mData;
    private ArrayList<String> mTranslatedData;
    private LayoutInflater mInflater;

    private SharedPreferences mPrefs;

    public CustomAdapter(Context context, ArrayList<String> data, ArrayList<String> translatedData) {
        mData = data;
        mInflater = LayoutInflater.from(context);
        mTranslatedData = translatedData;
        mPrefs = context.getSharedPreferences("Favourite", Context.MODE_PRIVATE);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public String getItem(int position) {
        return mData.get(position);
    }

    public String getTranslatedItem(int position) {
        return mTranslatedData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.customlist, null);
            holder = new ViewHolder();
            holder.textView1 = convertView.findViewById(R.id.TextView1);
            holder.textView2 = convertView.findViewById(R.id.TextView2);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String data = getItem(position);
        String translatedData = getTranslatedItem(position);

        holder.textView1.setText(data);
        holder.textView2.setText(translatedData);

        return convertView;
    }

    private static class ViewHolder {
        TextView textView1;
        TextView textView2;
    }
    public void saveData() {
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("data", TextUtils.join(",", mData));
        editor.putString("translatedData", TextUtils.join(",", mTranslatedData));
        editor.apply();
    }

    public void loadData() {
        String data = mPrefs.getString("data", "");
        String translatedData = mPrefs.getString("translatedData", "");

        mData.clear();
        mTranslatedData.clear();

        if (!TextUtils.isEmpty(data)) {
            mData.addAll(Arrays.asList(data.split(",")));
        }

        if (!TextUtils.isEmpty(translatedData)) {
            mTranslatedData.addAll(Arrays.asList(translatedData.split(",")));
        }
    }
}
