package com.example.michi.taschenrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button1, button2;
    TextView tv_ausgabe, tv_ausgabe2;

    double num1, num2, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        tv_ausgabe = (TextView) findViewById(R.id.tv_ausgabe);
        tv_ausgabe2 = (TextView) findViewById(R.id.tv_ausgabe2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(editText1.getText().toString());
                if(Double.parseDouble(editText2.getText().toString())==0){
                    tv_ausgabe.setText("Fehler");
                    tv_ausgabe2.setText("Nicht durch 0 dividieren!");
                } else {
                    num2 = Double.parseDouble(editText2.getText().toString());
                    result = num1/num2;
                    tv_ausgabe2.setText(""+result);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText1.setText("");
                editText2.setText("");
                tv_ausgabe2.setText("");
                tv_ausgabe.setText("Ausgabe");

            }
        });
    }
}
