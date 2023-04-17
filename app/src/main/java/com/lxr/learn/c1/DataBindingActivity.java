package com.lxr.learn.c1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.lxr.learn.c1.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {
    private DataBindingModel dataBindingModel;
    private ActivityDataBindingBinding binding;
    /***第一个版本***/
    /**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding);
        dataBindingModel = new ViewModelProvider(this).get(DataBindingModel.class);
        dataBindingModel.getLikedNum().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer value) {
                binding.textView.setText(String.valueOf(value));
            }
        });
        binding.button.setOnClickListener((v)->{
            dataBindingModel.addValue(1);
        });
    }
    ***/
    /***第二个版本 结合xml中的data标签***/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding);
        dataBindingModel = new ViewModelProvider(this).get(DataBindingModel.class);
        binding.setData(dataBindingModel);
        binding.setLifecycleOwner(this);
    }
}