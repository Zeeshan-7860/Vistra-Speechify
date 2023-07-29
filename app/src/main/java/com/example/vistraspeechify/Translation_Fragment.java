package com.example.vistraspeechify;



import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.nl.translate.TranslateLanguage;
import com.google.mlkit.nl.translate.Translation;
import com.google.mlkit.nl.translate.Translator;
import com.google.mlkit.nl.translate.TranslatorOptions;

import java.util.Arrays;
import java.util.List;


public class Translation_Fragment extends Fragment {
CardView cardView1,cardView2,cardView3,cardView4,cardView5;
Button btn1;
TextView textView;
ImageView loop,eraserii;
EditText editText;

    public Translation_Fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_translation_, container, false);
        Spinner spinner = view.findViewById(R.id.spinner3);
        Spinner spinner2 = view.findViewById(R.id.spinner4);
        editText = view.findViewById(R.id.et1);
        btn1 = view.findViewById(R.id.translate);
        textView = view.findViewById(R.id.tv1);



                List<String> items = Arrays.asList("English","Arabic", "Hindi", "Spanish", "French", "German", "Italian",
                "Japanese", "Korean", "Russian", "Chinese", "Bengali", "Bulgarian",
                "Croatian", "Czech", "Danish", "Finnish",  "Greek", "Gujarati",
                "Hungarian", "Irish", "Kannada",    "Maltese", "Marathi",
                "Norwegian", "Persian", "Polish", "Portuguese", "Romanian", "Slovak",  "Swedish",
                 "Tamil",  "Thai", "Turkish", "Ukrainian", "Urdu",  "welsh");
        List<Integer> pics = Arrays.asList(R.drawable.uk,R.drawable.saudia, R.drawable.india, R.drawable.spain, R.drawable.france, R.drawable.germany, R.drawable.italy, R.drawable.japan,
                R.drawable.korea, R.drawable.russia, R.drawable.china, R.drawable.bengali, R.drawable.bulgaria,  R.drawable.croatia,R.drawable.czech,R.drawable.denmark,R.drawable.finland,R.drawable.greece,R.drawable.india,R.drawable.hungary,R.drawable.ireland,R.drawable.kannada,R.drawable.malta,R.drawable.india,R.drawable.norway,R.drawable.persian,R.drawable.poland,R.drawable.portugal,R.drawable.romania,R.drawable.slovakia,R.drawable.sweden,R.drawable.india,R.drawable.thai,R.drawable.turkey,R.drawable.ukraine,R.drawable.urdu,R.drawable.wales);
        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(getContext(), items, pics);
        adapter.setDropDownViewResource(R.layout.custom_spinner_item);
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter );
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                String lang1 = spinner.getSelectedItem().toString();
                String lang2 = spinner2.getSelectedItem().toString();
                if(lang1.equals("English") && lang2.equals("English")){
                    textView.setText(text);
                }
                if(lang1.equals("English") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("English") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.HINDI);
                }
                if(lang1.equals("English") && lang2.equals("Spanish")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.SPANISH);
                }
                if(lang1.equals("English") && lang2.equals("French")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.FRENCH);
                }
                if(lang1.equals("English") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("English") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("English") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("English") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("English") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("English") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("English") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("English") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("English") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("English") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("English") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("English") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("English") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("English") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("English") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("English") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("English") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("English") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("English") && lang2.equals("Guajarati")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.GUJARATI);
                }
                if(lang1.equals("English") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("English") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("English") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("English") && lang2.equals("Lituanian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("English") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("English") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("English") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("English") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("English") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("English") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("English") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("English") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("English") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("English") && lang2.equals("swahili")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("English") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("English") && lang2.equals("Tagalog")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.TAGALOG);
                }
                if(lang1.equals("English") && lang2.equals("Tamil")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.TAMIL);
                }
                if(lang1.equals("English") && lang2.equals("Telugu")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.TELUGU);
                }
                if(lang1.equals("English") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("English") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("English") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("English") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("English") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("English") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.ENGLISH, TranslateLanguage.WELSH);
                }
                //////////////////////////////////////////////////////////////////////////////////
                if(lang1.equals("Arabic") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Arabic") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.HINDI);
                }
                if(lang1.equals("Arabic") && lang2.equals("Spanish")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.SPANISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("French")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.FRENCH);
                }
                if(lang1.equals("Arabic") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Arabic") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Arabic") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Arabic") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Guajarati")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.GUJARATI);
                }
                if(lang1.equals("Arabic") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Arabic") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Arabic") && lang2.equals("Lituanian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Arabic") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Arabic") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Arabic") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Arabic") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Arabic") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Arabic") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.THAI);
                }
                if(lang1.equals("Arabic") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Arabic") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.URDU);
                }
                if(lang1.equals("Arabic") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Arabic") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Arabic") && lang2.equals("Tagalog")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.TAGALOG);
                }
                if(lang1.equals("Arabic") && lang2.equals("Tamil")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.TAMIL);
                }
                if(lang1.equals("Arabic") && lang2.equals("Telugu")){
                    translateText(text, TranslateLanguage.ARABIC, TranslateLanguage.TELUGU);
                }
                /////////////////////////////////////////////////////////////////////////////////////////////
                if(lang1.equals("Hindi") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Hindi") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Hindi") && lang2.equals("Spanish")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.SPANISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("French")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.FRENCH);
                }
                if(lang1.equals("Hindi") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Hindi") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Hindi") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Hindi") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Hindi") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Hindi") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Hindi") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Hindi") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Hindi") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Hindi") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Hindi") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Hindi") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.THAI);
                }
                if(lang1.equals("Hindi") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Hindi") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.URDU);
                }
                if(lang1.equals("Hindi") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Hindi") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Hindi") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.HINDI, TranslateLanguage.HINDI);
                }
                //////////////////////////////////////////////////////////////////////////////////////////////
                //Now from Spanish to all other languages
                if(lang1.equals("Spanish") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Spanish") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Spanish") && lang2.equals("Spanish")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.SPANISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("French")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.FRENCH);
                }
                if(lang1.equals("Spanish") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Spanish") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Spanish") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Spanish") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Spanish") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.KANNADA);
                }



                if(lang1.equals("Spanish") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Spanish") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Spanish") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Spanish") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Spanish") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Spanish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Spanish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Spanish") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Spanish") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Spanish") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Spanish") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.SPANISH, TranslateLanguage.HINDI);
                }
                /////////////////////////////////////////////////////////////////////////////////
                //Now for the French Translations
                if(lang1.equals("French") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("French") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("French") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("French") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("French") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("French") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("French") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("French") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("French") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("French") && lang2.equals("Spanish")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.SPANISH);
                }
                if(lang1.equals("French") && lang2.equals("French")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.FRENCH);
                }
                if(lang1.equals("French") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("French") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("French") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("French") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("French") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("French") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("French") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("French") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("French") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("French") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("French") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("French") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("French") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("French") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("French") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("French") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("French") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("French") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("French") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("French") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("French") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("French") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("French") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("French") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("French") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("French") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("French") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("French") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("French") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.THAI);
                }
                if(lang1.equals("French") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("French") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("French") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.URDU);
                }
                if(lang1.equals("French") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("French") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("French") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.FRENCH, TranslateLanguage.HINDI);
                }
                /////////////////////////////////////////////////////////////////////////////////
                //Now for the German Translations
                ///
                ///
                ///

                if(lang1.equals("German") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("German") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("German") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("German") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("German") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("German") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("German") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("German") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("German") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("German") && lang2.equals("Spanish")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.SPANISH);
                }
                if(lang1.equals("German") && lang2.equals("French")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.FRENCH);
                }
                if(lang1.equals("German") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("German") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("German") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("German") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("German") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("German") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("German") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("German") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("German") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("German") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("German") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("German") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("German") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("German") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("German") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("German") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("German") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("German") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("German") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("German") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("German") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("German") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("German") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("German") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("German") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("German") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("German") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("German") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("German") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("German") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("German") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("German") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("German") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("German") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("German") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.GERMAN, TranslateLanguage.HINDI);
                }
                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Italian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Italian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Italian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Italian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Italian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Italian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Italian") && lang2.equals("ITALIAN")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Italian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Italian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Italian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Italian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Italian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Italian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Italian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Italian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Italian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Italian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Italian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Italian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Italian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Italian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Italian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Italian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Italian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Italian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Italian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Italian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Italian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.ITALIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Japanese Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Japanese") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Japanese") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Japanese") && lang2.equals("JAPANESE")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Japanese") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Japanese") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Japanese") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Japanese") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Japanese") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Japanese") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Japanese") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Japanese") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Japanese") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Japanese") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Japanese") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Japanese") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Japanese") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.THAI);
                }
                if(lang1.equals("Japanese") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Japanese") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.URDU);
                }
                if(lang1.equals("Japanese") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Japanese") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Japanese") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.JAPANESE, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Korean Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Korean") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Korean") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Korean") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Korean") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Korean") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Korean") && lang2.equals("KOREAN")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Korean") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Korean") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Korean") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Korean") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Korean") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Korean") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Korean") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Korean") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Korean") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Korean") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Korean") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Korean") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Korean") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Korean") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Korean") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Korean") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Korean") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Korean") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Korean") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Korean") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Korean") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Korean") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.KOREAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Russian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Russian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Russian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Russian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Russian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Russian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Russian") && lang2.equals("RUSSIAN")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Russian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Russian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Russian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Russian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Russian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Russian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Russian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Russian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Russian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Russian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Russian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Russian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Russian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Russian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Russian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Russian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Russian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Russian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Russian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Russian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Russian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.RUSSIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Chinese Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Chinese") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Chinese") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Chinese") && lang2.equals("CHINESE")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Chinese") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Chinese") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Chinese") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Chinese") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Chinese") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Chinese") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Chinese") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Chinese") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Chinese") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Chinese") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Chinese") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Chinese") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Chinese") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.THAI);
                }
                if(lang1.equals("Chinese") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Chinese") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.URDU);
                }
                if(lang1.equals("Chinese") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Chinese") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Chinese") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.CHINESE, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Belarusian Translations
                ///
                ///
                ///
                ///


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Benagali Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Bengali") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Bengali") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Bengali") && lang2.equals("BENGALI")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Bengali") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Bengali") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Bengali") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Bengali") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Bengali") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Bengali") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Bengali") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Bengali") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Bengali") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Bengali") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Bengali") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Bengali") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Bengali") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.THAI);
                }
                if(lang1.equals("Bengali") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Bengali") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.URDU);
                }
                if(lang1.equals("Bengali") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Bengali") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Bengali") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.BENGALI, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Bulgarian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Bulgarian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("BULGARIAN")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Bulgarian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.BULGARIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Catalan Translations
                ///
                ///
                ///
                ///

                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Croatian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Croatian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Croatian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Croatian") && lang2.equals("CROATIAN")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Croatian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Croatian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Croatian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Croatian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Croatian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Croatian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Croatian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Croatian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Croatian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Croatian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Croatian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Croatian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Croatian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Croatian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Croatian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Croatian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.CROATIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Czech Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Czech") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Czech") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Czech") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Czech") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Czech") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Czech") && lang2.equals("CZECH")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Czech") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Czech") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Czech") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Czech") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Czech") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Czech") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Czech") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Czech") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Czech") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Czech") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Czech") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Czech") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Czech") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Czech") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Czech") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Czech") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Czech") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Czech") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Czech") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Czech") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Czech") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Czech") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Czech") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.CZECH, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Danish Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Danish") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Danish") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Danish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Danish") && lang2.equals("DANISH")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Danish") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Danish") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Danish") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Danish") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Danish") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Danish") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Danish") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Danish") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Danish") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Danish") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Danish") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Danish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Danish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Danish") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Danish") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Danish") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Danish") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Danish") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.DANISH, TranslateLanguage.HINDI);
                }

                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Finnish Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Finnish") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Finnish") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Finnish") && lang2.equals("FINNISH")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Finnish") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Finnish") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Finnish") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Finnish") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Finnish") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Finnish") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Finnish") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Finnish") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Finnish") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Finnish") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Finnish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Finnish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Finnish") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Finnish") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Finnish") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Finnish") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.FINNISH, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Greek Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Greek") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Greek") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Greek") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Greek") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Greek") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Greek") && lang2.equals("GREEK")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Greek") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Greek") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Greek") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Greek") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Greek") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Greek") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Greek") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Greek") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Greek") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Greek") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Greek") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Greek") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Greek") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Greek") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Greek") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Greek") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Greek") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.THAI);
                }
                if(lang1.equals("Greek") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Greek") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Greek") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.URDU);
                }
                if(lang1.equals("Greek") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Greek") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Greek") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.GREEK, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Gujarati Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Gujarati") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Gujarati") && lang2.equals("GUJARATI")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.GUJARATI);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Gujarati")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.GUJARATI);
                }
                if(lang1.equals("Gujarati") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.THAI);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.URDU);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Gujarati") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.GUJARATI, TranslateLanguage.HINDI);
                }




                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Hungarian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Hungarian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Hungarian") && lang2.equals("HUNGARIAN")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Hungarian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.HUNGARIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Irish Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Irish") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Irish") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Irish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Irish") && lang2.equals("IRISH")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Irish") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Irish") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Irish") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Irish") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Irish") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Irish") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Irish") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Irish") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Irish") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Irish") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Irish") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Irish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Irish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Irish") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Irish") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Irish") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Irish") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Irish") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.IRISH, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Kannada Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Kannada") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Kannada") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Kannada") && lang2.equals("KANNADA")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Kannada") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Kannada") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Kannada") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Kannada") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Kannada") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Kannada") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Kannada") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Kannada") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Kannada") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Kannada") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Kannada") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Kannada") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Kannada") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.THAI);
                }
                if(lang1.equals("Kannada") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Kannada") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.URDU);
                }
                if(lang1.equals("Kannada") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Kannada") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Kannada") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.KANNADA, TranslateLanguage.HINDI);
                }

                /////////////////////////////////////////////////////////////////////////////////
                //Now for the MAcedonia Translations
                ///
                ///
                ///
                ///



                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Maltese Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Maltese") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Maltese") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Maltese") && lang2.equals("MALTESE")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Maltese") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Maltese") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Maltese") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Maltese") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Maltese") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Maltese") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Maltese") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Maltese") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Maltese") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Maltese") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Maltese") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Maltese") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Maltese") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.THAI);
                }
                if(lang1.equals("Maltese") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Maltese") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.URDU);
                }
                if(lang1.equals("Maltese") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Maltese") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Maltese") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.MALTESE, TranslateLanguage.HINDI);
                }

                /////////////////////////////////////////////////////////////////////////////////
                //Now for the MArathi Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Marathi") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Marathi") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Marathi") && lang2.equals("MARATHI")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Marathi") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Marathi") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Marathi") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Marathi") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Marathi") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Marathi") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Marathi") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Marathi") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Marathi") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Marathi") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Marathi") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Marathi") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Marathi") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.THAI);
                }
                if(lang1.equals("Marathi") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Marathi") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.URDU);
                }
                if(lang1.equals("Marathi") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Marathi") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Marathi") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.MARATHI, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Norwegian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Norwegian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Norwegian") && lang2.equals("NORWEGIAN")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Norwegian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.NORWEGIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Persian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Persian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Persian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Persian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Persian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Persian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Persian") && lang2.equals("PERSIAN")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Persian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Persian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Persian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Persian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Persian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Persian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Persian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Persian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Persian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Persian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Persian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Persian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Persian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Persian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Persian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Persian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Persian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Persian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Persian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Persian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Persian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.PERSIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Polish Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Polish") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Polish") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Polish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Polish") && lang2.equals("POLISH")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Polish") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Polish") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Polish") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Polish") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Polish") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Polish") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Polish") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Polish") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Polish") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Polish") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Polish") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Polish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Polish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Polish") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Polish") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Polish") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Polish") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Polish") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.POLISH, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Portuguese Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Portuguese") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Portuguese") && lang2.equals("PORTUGUESE")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.THAI);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.URDU);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Portuguese") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.PORTUGUESE, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the ROmanian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Romanian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Romanian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Romanian") && lang2.equals("ROMANIAN")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Romanian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Romanian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Romanian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Romanian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Romanian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Romanian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Romanian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Romanian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Romanian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Romanian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Romanian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Romanian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Romanian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Romanian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Romanian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Romanian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.ROMANIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Slovak Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Slovak") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Slovak") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Slovak") && lang2.equals("SLOVAK")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Slovak") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Slovak") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Slovak") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Slovak") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Slovak") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Slovak") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Slovak") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Slovak") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Slovak") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Slovak") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Slovak") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Slovak") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Slovak") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.THAI);
                }
                if(lang1.equals("Slovak") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Slovak") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.URDU);
                }
                if(lang1.equals("Slovak") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Slovak") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Slovak") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.SLOVAK, TranslateLanguage.HINDI);
                }

                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Swedish Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Swedish") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Swedish") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.ARABIC);
                }

                if(lang1.equals("Swedish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Swedish") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Swedish") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Swedish") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Swedish") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Swedish") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Swedish") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Swedish") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Swedish") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Swedish") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Swedish") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Swedish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Swedish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Swedish") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Swedish") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Swedish") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Swedish") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.SWEDISH, TranslateLanguage.HINDI);
                }



                /////////////////////////////////////////////////////////////////////////////////
                //Now for the TAmil Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Tamil") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Tamil") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Tamil") && lang2.equals("TAMIL")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.TAMIL);
                }
                if(lang1.equals("Tamil") && lang2.equals("Tamil")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.TAMIL);
                }
                if(lang1.equals("Tamil") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Tamil") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Tamil") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Tamil") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Tamil") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Tamil") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Tamil") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Tamil") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Tamil") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Tamil") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Tamil") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Tamil") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.THAI);
                }
                if(lang1.equals("Tamil") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Tamil") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.URDU);
                }
                if(lang1.equals("Tamil") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Tamil") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Tamil") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.TAMIL, TranslateLanguage.HINDI);
                }




                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Thai Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Thai") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Thai") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Thai") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Thai") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Thai") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Thai") && lang2.equals("THAI")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.THAI);
                }
                if(lang1.equals("Thai") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.THAI);
                }
                if(lang1.equals("Thai") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Thai") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Thai") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Thai") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Thai") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Thai") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Thai") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Thai") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Thai") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Thai") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Thai") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Thai") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Thai") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Thai") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Thai") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Thai") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.THAI);
                }
                if(lang1.equals("Thai") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Thai") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Thai") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.URDU);
                }
                if(lang1.equals("Thai") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Thai") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Thai") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.THAI, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Turkish Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Turkish") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Turkish") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Turkish") && lang2.equals("TURKISH")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Turkish") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Turkish") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Turkish") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Turkish") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Turkish") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Turkish") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Turkish") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Turkish") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Turkish") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Turkish") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Turkish") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Turkish") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Turkish") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Turkish") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Turkish") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Turkish") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.TURKISH, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Ukranian Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Ukranian") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Ukranian") && lang2.equals("UKRANIAN")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.UKRAINIAN);
                }

                if(lang1.equals("Ukranian") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.THAI);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.URDU);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Ukranian") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.UKRAINIAN, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the Urdu Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("Urdu") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Urdu") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Urdu") && lang2.equals("URDU")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.URDU);
                }
                if(lang1.equals("Urdu") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.URDU);
                }
                if(lang1.equals("Urdu") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Urdu") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Urdu") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Urdu") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Urdu") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Urdu") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Urdu") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Urdu") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Urdu") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Urdu") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Urdu") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Urdu") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.THAI);
                }
                if(lang1.equals("Urdu") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Urdu") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.URDU);
                }
                if(lang1.equals("Urdu") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Urdu") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Urdu") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.URDU, TranslateLanguage.HINDI);
                }


                /////////////////////////////////////////////////////////////////////////////////
                //Now for the WElsh Translations
                ///
                ///
                ///
                ///
                if(lang1.equals("welsh") && lang2.equals("English")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.ENGLISH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Belarusian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.BELARUSIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Bulgarian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.BULGARIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Catalan")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.CATALAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Chinese")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.CHINESE);
                }
                if(lang1.equals("Welsh") && lang2.equals("Croatian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.CROATIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Czech")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.CZECH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Danish")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.DANISH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Arabic")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.ARABIC);
                }
                if(lang1.equals("Welsh") && lang2.equals("WELSH")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Welsh") && lang2.equals("German")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.GERMAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Italian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.ITALIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Japanese")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.JAPANESE);
                }
                if(lang1.equals("Welsh") && lang2.equals("Korean")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.KOREAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Russian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.RUSSIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Bengali")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.BENGALI);
                }
                if(lang1.equals("Welsh") && lang2.equals("Estonian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.ESTONIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Finnish")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.FINNISH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Greek")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.GREEK);
                }
                if(lang1.equals("Welsh") && lang2.equals("Galician")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.GALICIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Haitian Creole")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.HAITIAN_CREOLE);
                }
                if(lang1.equals("Welsh") && lang2.equals("Hungarian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.HUNGARIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Irish")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.IRISH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Kannada")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.KANNADA);
                }
                if(lang1.equals("Welsh") && lang2.equals("Lithuanian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.LITHUANIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Latvian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.LATVIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Macedonian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.MACEDONIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Malay")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.MALAY);
                }
                if(lang1.equals("Welsh") && lang2.equals("Maltese")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.MALTESE);
                }
                if(lang1.equals("Welsh") && lang2.equals("Marathi")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.MARATHI);
                }
                if(lang1.equals("Welsh") && lang2.equals("Norwegian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.NORWEGIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Persian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.PERSIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Polish")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.POLISH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Portuguese")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.PORTUGUESE);
                }
                if(lang1.equals("Welsh") && lang2.equals("Romanian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.ROMANIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Slovak")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.SLOVAK);
                }
                if(lang1.equals("Welsh") && lang2.equals("Swahili")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.SWAHILI);
                }
                if(lang1.equals("Welsh") && lang2.equals("Swedish")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.SWEDISH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Thai")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.THAI);
                }
                if(lang1.equals("Welsh") && lang2.equals("Turkish")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.TURKISH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Ukrainian")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.UKRAINIAN);
                }
                if(lang1.equals("Welsh") && lang2.equals("Urdu")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.URDU);
                }
                if(lang1.equals("Welsh") && lang2.equals("Vietnamese")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.VIETNAMESE);
                }
                if(lang1.equals("Welsh") && lang2.equals("Welsh")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.WELSH);
                }
                if(lang1.equals("Welsh") && lang2.equals("Hindi")){
                    translateText(text, TranslateLanguage.WELSH, TranslateLanguage.HINDI);
                }















            }
        });


        cardView1 = view.findViewById(R.id.cardback1);
        cardView2 = view.findViewById(R.id.cardback2);
        cardView3 = view.findViewById(R.id.cardback3);
        cardView4 = view.findViewById(R.id.meracard1);
        cardView5 = view.findViewById(R.id.meracard2);
        eraserii=view.findViewById(R.id.eraser2);
        cardView4.setVisibility(View.INVISIBLE);
        cardView5.setVisibility(View.INVISIBLE);
        loop = view.findViewById(R.id.loop);
        loop.setVisibility(View.INVISIBLE);
        eraserii.setVisibility(View.INVISIBLE);


        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in);
        Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in);
        Animation animation2 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in_minus);
        cardView1.startAnimation(animation);
        cardView2.startAnimation(animation);
        cardView3.startAnimation(animation);
        btn1.startAnimation(animation);
        eraserii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cardView4.startAnimation(animation1);
                loop.startAnimation(animation);
                eraserii.setAnimation(animation2);
                eraserii.setVisibility(View.VISIBLE);
                loop.setVisibility(View.VISIBLE);
                cardView5.startAnimation(animation2);
                cardView4.setVisibility(View.VISIBLE);
                cardView5.setVisibility(View.VISIBLE);
            }
        }, 1500);
        return view;
    }
    private void translateText(String text, String sourceLanguage, String targetLanguage) {
        TranslatorOptions options = new TranslatorOptions.Builder()
                .setSourceLanguage(String.valueOf(sourceLanguage))
                .setTargetLanguage(String.valueOf(targetLanguage))
                .build();
        final Translator translator = Translation.getClient(options);

        translator.downloadModelIfNeeded()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        translator.translate(text)
                                .addOnSuccessListener(new OnSuccessListener<String>() {
                                    @Override
                                    public void onSuccess(String translatedText) {
                                        textView.setText(translatedText);
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        // Handle translation failure
                                    }
                                });
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Handle model download failure
                    }
                });
    }
    @Override
    public void onResume() {
        super.onResume();
        // Update the selected item of the BottomNavigationView
        ((MainActivity) requireActivity()).bottomNavigationView.setSelectedItemId(R.id.translate);
    }
}