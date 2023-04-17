package com.lxr.learn.c1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataBindingModel extends ViewModel {
    private MutableLiveData<Integer> likedNum;

    public MutableLiveData<Integer> getLikedNum() {
        if(likedNum == null){
            likedNum = new MutableLiveData<>();
            likedNum.setValue(0);
        }
        return likedNum;
    }
    public void addValue(int value){
        likedNum.setValue(likedNum.getValue()+value);
    }
}
