package com.example.hm_2;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class SplashActivity extends AppCompatActivity {
    private TextView textView;
    private TextView input2;
    private TextView ans;
    private TextView expl1;
    private TextView input1;
    private Button button5;
    private TextView expl2;


    private EditText yourans;
    private Button button1;
    private Button applyBtn;
    private Button PlayBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView = findViewById(R.id.textView);
        input2 = findViewById(R.id.input2);
        ans = findViewById(R.id.ans);
        expl1 = findViewById(R.id.expl1);
        input1 = findViewById(R.id.input1);
        button5 = findViewById(R.id.button5);
        expl2 = findViewById(R.id.expl2);
        yourans = findViewById(R.id.yourans);
        yourans = findViewById(R.id.yourans);


        button1 = findViewById(R.id.button1);


    }


    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("n1", "");
        int a = sh.getInt("n2", 0);


        ans.setText(s1);
        input1.setText(String.valueOf(a));
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();


        myEdit.putString("n1", ans.getText().toString());
        myEdit.putInt("n2", Integer.parseInt(input1.getText().toString()));
        myEdit.apply();
    }

    public void applyMethod(View view) {


        if (Integer.parseInt((String) input1.getText()) * (Integer.parseInt((String) ans.getText())) == Integer.parseInt(yourans.getText().toString())) {
            Toast.makeText(this, "Correct !!! ", Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(this, "Wrong answer , please try again !!! ", Toast.LENGTH_LONG).show();
        }
    }

    public void playMethod(View view) {
        Random r = new Random();
        String e = "" + r.nextInt(10);
        String d = "" + r.nextInt(10);
        ans.setText(e);
        input1.setText(d);


    }
}




