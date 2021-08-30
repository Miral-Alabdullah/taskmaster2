package com.example.taskmaster;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycleActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: called");
    }
}
