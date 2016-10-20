package com.augmentis.ayp.ui_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Noppharat on 10/20/2016.
 */

public class MainFragment extends Fragment {

    private ImageView backgroundImage;
    private ImageView welcomeText;
    private Button gettingStartButton;

    public static MainFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);
        backgroundImage = (ImageView) v.findViewById(R.id.background_image);
        welcomeText = (ImageView) v.findViewById(R.id.welcome_text);
        gettingStartButton = (Button) v.findViewById(R.id.getting_start_button);

        backgroundImage.setBackground(getResources().getDrawable(R.drawable.slidein));
        welcomeText.setBackground(getResources().getDrawable(R.drawable.welcome));
        gettingStartButton.setBackground(getResources().getDrawable(R.drawable.gettingstartbutton));
        gettingStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                welcomeAnimate(welcomeText);

            }
        });

//        welcomeAnimate(welcomeText);



        return v;
    }

    private void welcomeAnimate(ImageView textview){
        Animation anim = new TranslateAnimation(0,0,-700, 0);
        anim.setDuration(1000);
        anim.setFillAfter(true);
        textview.startAnimation(anim);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        welcomeText.animate().translationY(0).setDuration(3000).start();
    }
}
