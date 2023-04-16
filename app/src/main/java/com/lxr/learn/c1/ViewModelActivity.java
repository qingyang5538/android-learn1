package com.lxr.learn.c1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "ViewModelActivity test";
    private TextView textView;
    private Button button1;
    private Button button2;

    private TestViewModel testViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);
        //testViewModel = new ViewModelProvider(this).get(TestViewModel.class);
        testViewModel = new ViewModelProvider(this).get(TestViewModel.class);

        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textView.setText(String.valueOf(testViewModel.num));
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        testViewModel.num =  (view.getId() == R.id.button1) ? testViewModel.num+1:testViewModel.num+2;
        System.out.print(testViewModel.num);
        textView.setText(String.valueOf(testViewModel.num));
    }
}