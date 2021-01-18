package com.example.testsub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("testSub", "onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mypid = android.os.Process.myPid();
        Log.v("testSub", "pid:"+mypid);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("testSub", "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("testSub", "onStart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("testSub", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("testSub", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("testSub", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("testSub", "onDestroy()");
    }
}