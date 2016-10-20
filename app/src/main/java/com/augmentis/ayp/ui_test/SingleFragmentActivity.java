package com.augmentis.ayp.ui_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Noppharat on 10/20/2016.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.single_fragment_activity);

        if(fragment == null){
            fragment = onCreateFragment();
            fragmentManager.beginTransaction().add(R.id.single_fragment_activity, fragment).commit();
        }
    }

    protected abstract Fragment onCreateFragment();
}
