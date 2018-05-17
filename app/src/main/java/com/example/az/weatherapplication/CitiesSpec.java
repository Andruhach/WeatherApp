package com.example.az.weatherapplication;

import android.content.Context;

/**
 * Created by Az on 17.05.2018.
 */

public class CitiesSpec {
    static String getEffect(Context context, int position) {
        String[] strings = context.getResources().getStringArray(R.array.effect);
        String effect = strings[position];
        return effect;
    }

}
