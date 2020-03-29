package com.david.stefan.lab6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    public MySharedPreference (Context context) {
        //TODO
        settings = context.getSharedPreferences("preference1", 0);
        editor = settings.edit();
    }

    public void save(String text){
        //TODO
        editor.putString("text", text);
        editor.commit(); // commit changes
    }

    public String getValue(){
        //TODO
        return  settings.getString("text", null);
    }

    public void clearSharedPreferences(){
        //TODO
        editor.clear();
        editor.commit();
    }
}