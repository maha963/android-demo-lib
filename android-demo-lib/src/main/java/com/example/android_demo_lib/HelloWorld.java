package com.example.android_demo_lib;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class HelloWorld {
    Context context;
    public static void display(String message){
//        Toast.makeText(context, "Hello World", Toast.LENGTH_SHORT).show();
        Log.d("tag","Hello, Use this dependency "+ message);
    }

}
