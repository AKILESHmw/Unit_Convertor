package com.max.unitconvertor;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Gram_convertion extends AppCompatActivity {

    TextView gram,kilo,milli,pounds;
    EditText input_value;
    Button convertit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram_convertion);

        gram=findViewById(R.id.G);
        kilo=findViewById(R.id.KG);
        milli=findViewById(R.id.mG);
        pounds=findViewById(R.id.Pounds);
        input_value=findViewById(R.id.input);
        convertit=findViewById(R.id.Convert_it);
        //input always in kilogram

        convertit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=input_value.getText().toString();
                double in=Double.parseDouble(input);
                float in2=Float.parseFloat(input);
                double kg=in;
                double g=in/1000;
                double mg=in*1000000;
                float pound=(float) (in2/0.45);
                gram.setText(""+ g);
                kilo.setText(""+ kg);
                pounds.setText(""+ pound);
                milli.setText(""+ mg);

            }
        });
        };


    }