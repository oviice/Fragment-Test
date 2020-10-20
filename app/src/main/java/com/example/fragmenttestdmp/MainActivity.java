package com.example.fragmenttestdmp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=getSupportFragmentManager();
        Button oneFragmentBtn=findViewById(R.id.oneBtn);
        Button secondFragmentBtn=findViewById(R.id.secondBtn);
        oneFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction=manager.beginTransaction();
                OneFragment oneFragment=new OneFragment();
                transaction.add(R.id.framelayout,oneFragment,"One").commit();
            }
        });
        secondFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction=manager.beginTransaction();
                SecondFragment secondFragment=new SecondFragment();
                transaction.replace(R.id.framelayout,secondFragment,"Second").commit();
            }
        });
    }
}