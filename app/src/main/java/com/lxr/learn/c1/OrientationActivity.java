package com.lxr.learn.c1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OrientationActivity extends AppCompatActivity {
    private TextView textView;
    private static final String TAG = "OrientationActivity";
    private static final String KEY = "MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
        textView = findViewById(R.id.textView);
        if(savedInstanceState!=null){
            String msg = savedInstanceState.getString(KEY);
            textView.setText(msg);
        }
        findViewById(R.id.button1).setOnClickListener((bt)->{
            textView.setText(System.currentTimeMillis()+"");
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY,textView.getText().toString());
    }
    //使用onSaveInstanceState临时保存界面数据，比如屏幕翻转的时候会导致界面数据丢失
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}