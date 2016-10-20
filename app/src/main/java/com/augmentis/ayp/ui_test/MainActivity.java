package com.augmentis.ayp.ui_test;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends SingleFragmentActivity{

    @Override
    protected Fragment onCreateFragment() {
        return MainFragment.newInstance();
    }

    public static Intent newIntent(Context context){
        return new Intent(context, MainActivity.class);
    }
}
