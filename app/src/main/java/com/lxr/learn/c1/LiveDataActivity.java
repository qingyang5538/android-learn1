package com.lxr.learn.c1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class LiveDataActivity extends AppCompatActivity {
    private TextView textView;
    private ViewModelWithLiveData viewModelWithLiveData;

    private ImageButton likeBtoon;
    private ImageButton disLikeBtoon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);
        textView = findViewById(R.id.textView);
        likeBtoon = findViewById(R.id.likeImageButton);
        disLikeBtoon = findViewById(R.id.disLiekImageButton);
        viewModelWithLiveData = new ViewModelProvider(this).get(ViewModelWithLiveData.class);
        viewModelWithLiveData.getLikedNum().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer value) {
                textView.setText(String.valueOf(value));
            }
        });
        likeBtoon.setOnClickListener((v)->{
            viewModelWithLiveData.addValue(1);
        });
        disLikeBtoon.setOnClickListener((v)->{
            viewModelWithLiveData.addValue(-1);
        });
    }
}