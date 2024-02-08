package com.example.imageview;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=(ImageView)findViewById(R.id.image);
        im.setImageResource(R.drawable.image1);
    }
}
