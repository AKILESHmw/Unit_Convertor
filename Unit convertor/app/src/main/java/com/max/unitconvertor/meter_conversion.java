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

public class meter_conversion extends AppCompatActivity {
    TextView meter,centimeter,kilometer,millimeter;
    Button convertit;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_conversion);
        meter=findViewById(R.id.m);
        kilometer=findViewById(R.id.Km);
        millimeter=findViewById(R.id.mm);
        centimeter=findViewById(R.id.cm);
        input=findViewById(R.id.input);
        convertit=findViewById(R.id.Convert_it);
        convertit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputvalue=input.getText().toString();
                double in=Double.parseDouble(inputvalue);
                double km=in;
                double m=in/1000;
                double mm=in*1000000;
                double cm=in*100000;
                meter.setText(""+ m);
                millimeter.setText(""+ mm);
                centimeter.setText(""+ cm);
                kilometer.setText(""+ km);

            }
        });
    };
}