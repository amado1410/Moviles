package com.example.debug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int A[]=new int[10];
        for(int j = 0; j<9; j++){
        A[j]=(int)(Math.random()*15+5);
        System.out.println("Arreglo:"+" "+j+"--> "+A[j]);
        }

    }
}
