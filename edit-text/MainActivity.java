package com.example.edit_text;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText editName;
    TextView result;
    Button buttonSubmit, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editName  = (EditText) findViewById(R.id.editName);
        
        result = (TextView) findViewById(R.id.tvResult);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        
        buttonSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 // get text from EditText name view
		        String name = editName.getText().toString();
		        // get text from EditText password view
		       
		        
		        result.setText("Name:\t" + name );
			}
        });
        
        buttonReset.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // clearing out all the values
                editName.setText("");
                
                result.setText("");
                editName.requestFocus();
            }
        });
    
    }


 
}
