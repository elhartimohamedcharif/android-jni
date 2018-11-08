package com.example.hellojnicallback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tickView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onResume (){
        super.onResume();
        ((TextView)findViewById(R.id.hellojniMsg)).setText(stringFromJNI());
    }

    @Override
    public void onPause (){
        super.onPause();
    }


    static {
        System.loadLibrary("hello-jnicallback");
    }
    public native  String stringFromJNI();

}
