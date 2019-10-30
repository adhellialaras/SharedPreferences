package com.amikom.sharedpreferences.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    private static SharedPref INSTANCE;
    private SharedPreferences sharedPreferences;

    private SharedPref(Context context){
    sharedPreferences =context
}
}
