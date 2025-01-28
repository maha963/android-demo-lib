package com.example.hw1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_demo_lib.HelloWorld;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        HelloWorld helloWorld=new HelloWorld();
        HelloWorld.display("message");

    }
}