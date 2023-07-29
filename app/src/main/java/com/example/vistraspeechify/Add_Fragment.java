package com.example.vistraspeechify;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;


public class Add_Fragment extends Fragment  {
    CardView cardView1, cardView2, cardView3;
    EditText edit1;
    Context context;
    private TextToSpeech tts;
    private SeekBar seekBar;
    private int count = 0;
    private Handler handler;
    ImageView imageView2;
    AudioManager audioManager;
    public static Spinner spinner;




    public Add_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_, container, false);
        spinner = view.findViewById(R.id.spinner6);
        seekBar = view.findViewById(R.id.seekBar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            audioManager = (AudioManager) getContext().getSystemService(getContext().AUDIO_SERVICE);
        }
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Not needed for volume control
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Not needed for volume control
            }
        });


        cardView1 = view.findViewById(R.id.cardbackadd1);
        cardView2 = view.findViewById(R.id.cardbackadd2);
        cardView3 = view.findViewById(R.id.cardbackadd3);

        edit1 = view.findViewById(R.id.et1);
        imageView2 = view.findViewById(R.id.play);
        List<String> items = Arrays.asList("English", "Arabic", "Hindi", "Spanish", "French", "German", "Italian",
                "Japanese", "Korean", "Russian", "Chinese",  "Bengali", "Bulgarian",
                "Croatian", "Czech", "danish",  "Finnish",  "Greek", "Gujarati",
                "Hungarian", "Irish", "Kannada",  "Maltese", "Marathi",
                "Norwegian", "Persian", "Polish", "Portuguese", "Romanian", "Slovak",  "Swedish",
                 "Tamil",  "Thai", "Turkish", "Ukrainian", "Urdu",  "Welsh");
        List<Integer> pics = Arrays.asList(R.drawable.uk, R.drawable.saudia, R.drawable.india, R.drawable.spain, R.drawable.france, R.drawable.germany, R.drawable.italy, R.drawable.japan,
                R.drawable.korea, R.drawable.russia, R.drawable.china,  R.drawable.bengali, R.drawable.bulgaria,  R.drawable.croatia, R.drawable.czech, R.drawable.denmark, R.drawable.finland,  R.drawable.greece, R.drawable.india, R.drawable.hungary, R.drawable.ireland, R.drawable.kannada,  R.drawable.malta, R.drawable.india, R.drawable.norway, R.drawable.persian, R.drawable.poland, R.drawable.portugal, R.drawable.romania, R.drawable.slovakia,  R.drawable.sweden, R.drawable.india, R.drawable.thai, R.drawable.turkey, R.drawable.ukraine, R.drawable.urdu,  R.drawable.wales);
        CustomNewAdapter adapter = new CustomNewAdapter(getContext(), items, pics);
        adapter.setDropDownViewResource(R.layout.custom_spinner_new);
        spinner.setAdapter(adapter);
        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in);

        imageView2.startAnimation(animation);

        cardView1.startAnimation(animation);
        cardView2.startAnimation(animation);
        cardView3.startAnimation(animation);


        tts = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    // TextToSpeech initialization successful
                } else {
                    // Handle initialization error
                    CustomToast.showToast(getActivity(), "Error while initializing TextToSpeech engine");
                }
            }
        });
        tts.setOnUtteranceProgressListener(new UtteranceProgressListener() {
            @Override
            public void onStart(String utteranceId) {
                // Utterance started
            }

            @Override
            public void onDone(String utteranceId) {
                // Utterance completed, stop the TTS here
                tts.stop();
                tts.shutdown();

            }

            @Override
            public void onError(String utteranceId) {
                // Error occurred
            }
        });
         imageView2.setOnClickListener(v ->
         {
             count++;
             String text = edit1.getText().toString();
             HashMap<String, String> params = new HashMap<>();
             params.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "utteranceId");
             if (count % 2 == 0) {
                 tts.speak(text, TextToSpeech.QUEUE_FLUSH, params);
                 count = 0;
             }
                else {
                 CustomToast.showToast(getActivity(), "Your Voice is Ready!! \n Press Again To Speak");
                }

             tts = new TextToSpeech(getContext(), status -> {
                 if (status != TextToSpeech.ERROR) {
                     String lang1 = spinner.getSelectedItem().toString();

                     if (lang1.equals("English")) {
                         tts.setLanguage(Locale.forLanguageTag("en"));
                     } else if (lang1.equals("Urdu")) {
                         tts.setLanguage(Locale.forLanguageTag("ur"));
                     } else if (lang1.equals("Arabic")) {
                         tts.setLanguage(new Locale("ar"));

                     } else if (lang1.equals("Hindi")) {
                         tts.setLanguage(new Locale("hi"));

                     } else if (lang1.equals("Spanish")) {
                         tts.setLanguage(new Locale("es"));

                     } else if (lang1.equals("French")) {
                         tts.setLanguage(Locale.forLanguageTag("fr"));

                     } else if (lang1.equals("German")) {
                         tts.setLanguage(Locale.forLanguageTag("de"));

                     } else if (lang1.equals("Italian")) {
                         tts.setLanguage(Locale.forLanguageTag("it"));

                     } else if (lang1.equals("Japanese")) {
                         tts.setLanguage(Locale.forLanguageTag("ja"));

                     } else if (lang1.equals("Korean")) {
                         tts.setLanguage(Locale.forLanguageTag("ko"));

                     } else if (lang1.equals("Russian")) {
                         tts.setLanguage(new Locale("ru"));

                     } else if (lang1.equals("Chinese")) {
                         tts.setLanguage(Locale.forLanguageTag("zh"));

                     } else if (lang1.equals("Bengali")) {
                         tts.setLanguage(new Locale("bn"));
                     } else if (lang1.equals("Bulgarian")) {
                         tts.setLanguage(new Locale("bg"));

                     } else if (lang1.equals("Croatian")) {
                         tts.setLanguage(new Locale("hr"));
                     } else if (lang1.equals("Czech")) {
                         tts.setLanguage(new Locale("cs"));
                     } else if (lang1.equals("danish")) {
                         tts.setLanguage(new Locale("da"));
                     } else if (lang1.equals("Finnish")) {
                         tts.setLanguage(new Locale("fi"));
                     } else if (lang1.equals("Greek")) {
                         tts.setLanguage(new Locale("el"));
                     } else if (lang1.equals("Gujarati")) {
                         tts.setLanguage(new Locale("gu"));
                     } else if (lang1.equals("Hungarian")) {
                         tts.setLanguage(new Locale("hu"));
                     } else if (lang1.equals("Irish")) {
                         tts.setLanguage(new Locale("ga"));
                     } else if (lang1.equals("Kannada")) {
                         tts.setLanguage(new Locale("kn"));
                     } else if (lang1.equals("Maltese")) {
                         tts.setLanguage(new Locale("mt"));
                     } else if (lang1.equals("Marathi")) {
                         tts.setLanguage(new Locale("mr"));
                     } else if (lang1.equals("Norwegian")) {
                         tts.setLanguage(new Locale("no"));
                     } else if (lang1.equals("Persian")) {
                         tts.setLanguage(new Locale("fa"));
                     } else if (lang1.equals("Polish")) {
                         tts.setLanguage(new Locale("pl"));
                     } else if (lang1.equals("Portuguese")) {
                         tts.setLanguage(new Locale("pt"));
                     } else if (lang1.equals("Romanian")) {
                         tts.setLanguage(new Locale("ro"));
                     } else if (lang1.equals("Slovak")) {
                         tts.setLanguage(new Locale("sk"));
                     } else if (lang1.equals("Swedish")) {
                         tts.setLanguage(new Locale("sv"));
                     } else if (lang1.equals("Tamil")) {
                         tts.setLanguage(new Locale("ta"));
                     } else if (lang1.equals("Thai")) {
                         tts.setLanguage(new Locale("th"));
                     } else if (lang1.equals("Turkish")) {
                         tts.setLanguage(new Locale("tr"));
                     } else if (lang1.equals("Ukrainian")) {
                         tts.setLanguage(new Locale("uk"));
                     } else if (lang1.equals("Welsh")) {
                         tts.setLanguage(new Locale("cy"));
                     } else {
                         tts.setLanguage(Locale.ENGLISH);
                     }
                 }
             });

         });
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        // Update the selected item of the BottomNavigationView
        ((MainActivity) requireActivity()).bottomNavigationView.setSelectedItemId(R.id.add);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
    }
}






