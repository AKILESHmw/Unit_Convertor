package com.max.unitconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class temperature_convertion extends AppCompatActivity {
    TextView kelvin,celsius,fahrenheit;
    Button convertit;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_convertion);
        kelvin=findViewById(R.id.k);
        celsius=findViewById(R.id.c);
        fahrenheit=findViewById(R.id.f);
        input=findViewById(R.id.input);
        convertit=findViewById(R.id.Convert_it);
        convertit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputvalue=input.getText().toString();
                float in=Float.parseFloat(inputvalue);
                float cel=in;
                float kel=(float) (in+273.15);
                float far=(float) ((1.8)*in)+32;
                celsius.setText(""+ cel);
                kelvin.setText(""+ kel);
                fahrenheit.setText(""+ far);
            }
        });
    };
        }

