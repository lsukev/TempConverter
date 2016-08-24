package com.lsukev.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
    Formulas from wikipedia
    C = (F-32)x 5/9 ------> From Fahrenheit to Celsius
    F = C x 9/5 + 32 -----> From Celsius to Fahrenheit

 */

public class MainActivity extends AppCompatActivity {

    private EditText txtTemp;
    private Button btnF;
    private Button btnCelsius;
    private TextView lblTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTemp = (EditText)findViewById(R.id.txtTemp);
        btnF = (Button)findViewById(R.id.btnF);
        btnCelsius = (Button)findViewById(R.id.btnCelsius);
        lblTemp = (TextView) findViewById(R.id.lblTemp);

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call convertToFahrenheit()
                String editTextVal = txtTemp.getText().toString();

                if (editTextVal.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter a value", Toast.LENGTH_LONG).show();
                }else{
                    int intEditText = Integer.parseInt(editTextVal);
                    convertToFahrenheit(intEditText);
                }
            }
        });

        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call convertToCelsius
                String editTextVal = txtTemp.getText().toString();

                if (editTextVal.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter a value", Toast.LENGTH_LONG).show();
                }else{
                    //we are good
                    int intEditText = Integer.parseInt(editTextVal);
                    convertToCelsius(intEditText);
                }

            }
        });

    }

    public int convertToCelsius(int farVal){
        return 0;
    }

    public int convertToFahrenheit(int celVal){
        return 0;
    }
}
