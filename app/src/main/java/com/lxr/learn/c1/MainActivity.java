package com.lxr.learn.c1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.hello_world_activity_button).setOnClickListener((view)->{
            Intent intent = new Intent(this,HelloWorldActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.orientation_activity_button).setOnClickListener((view)->{
            Intent intent = new Intent(this,OrientationActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.view_model_activity_button).setOnClickListener((view)->{
            Intent intent = new Intent(this,ViewModelActivity.class);
            startActivity(intent);
        });
    }
}