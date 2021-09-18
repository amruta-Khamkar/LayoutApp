package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button button;
    private TextView textView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editText1=findViewById(R.id.editTextTextPersonName);
        editText2=findViewById(R.id.editTextTextPersonName2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                String s2=editText2.getText().toString();
                int age=Integer.parseInt(s2);

                if(age>=18){
                textView.setText("Hello "+ s +" You are eligible to go for pub Welcome !");
                }
                else{
                    textView.setText("Sorry Not Eligible!");
                }

            }
        });
    }
}