package com.example.multiplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;;

public class MainActivity extends Activity {

    Button get;
    TextView out;
    EditText inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get=(Button)findViewById(R.id.submit);
        inp=(EditText)findViewById(R.id.Input);
        out=(TextView)findViewById(R.id.out);
        get.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                int num=Integer.parseInt(inp.getText().toString());
                String finalRes="";
                for(int i=1;i<=10;i++){
                    int res=i*num;
                    String mul=i+"X"+num+"="+res+"\n";
                    finalRes=finalRes+mul;
                }
                out.setText(finalRes);
            }
        });
    }
}
