package com.example.navigation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	         
	        Button button1, button2;
	        final RelativeLayout relativeLayout;
	         
	        // set button 1 with its id
	        button1 = (Button) findViewById(R.id.btVar1);
	         
	        // set button 2 with its id
	        button2 = (Button) findViewById(R.id.btVar2);
	         
	        // set relative layout with its id
	        relativeLayout = (RelativeLayout) findViewById(R.id.rlVar1);
	         
	        // onClick function for button 1
	        button1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					relativeLayout.setBackgroundResource(R.color.cool);
				}
	        	
	        });
	         
	        // onClick function for button 2
	        button2.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View view) {
	                // set the color to relative layout
	                relativeLayout.setBackgroundResource(R.color.warm);
	            }
	        });
	    }
	}
