package com.example.stringnumbersplit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String num="";
    String letter="";
    String others="";

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*  Start String Value Split Char Letter Other */
         Button No1 = findViewById(R.id.No1);
         Button No2 = findViewById(R.id.No2);
         Button No3 = findViewById(R.id.No3);
         No1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String chartxt = "gokul@3245^&*90nathan?!";

                 for(int i = 0;i<chartxt.length();i++){

                     if(Character.isDigit(chartxt.charAt(i))){
                          num+=chartxt.charAt(i);
                     }else if(Character.isAlphabetic(chartxt.charAt(i))){
                          letter+=chartxt.charAt(i);
                     }else{
                          others+=chartxt.charAt(i);
                     }

                 }

                 System.out.println("Split Number : " + num);
                 System.out.println("Split Letter : " + letter);
                 System.out.println("Split Others : " + others);
             }
         });

        /*  End String Value Split Char Letter Other */

        No2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String originalStr = "Hello";
                String reversedStr = "";
                System.out.println("Original string: " + originalStr);

                for (int i = 0; i < originalStr.length(); i++) {
                    reversedStr = originalStr.charAt(i) + reversedStr;
                }

                System.out.println("Reversed string: "+ reversedStr);

            }
        });


        No3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str;
                int i, counter[] = new int[256];


                 str = "Gokulnathan";

                for (i = 0; i < str.length(); i++) {
                    counter[(int) str.charAt(i)]++;
                }

                for (i = 0; i < 256; i++) {
                    if (counter[i] != 0) {
                        System.out.println((char) i + " --> " + counter[i]);
                    }
                }
            }
        });


    }
}