package com.ajs.simplemvvm.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getResourceLayoutId();
    }

    protected abstract int getResourceLayoutId();

    protected void startLoading(){

    }

    protected void stopLoading(){

    }



}
