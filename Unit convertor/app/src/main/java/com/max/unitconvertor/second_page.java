package com.max.unitconvertor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class second_page extends AppCompatActivity {

    Button gramconvert,meterconvert,tempconvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        gramconvert=findViewById(R.id.Gram_convertion);
        meterconvert=findViewById(R.id.meter_convertion);
        tempconvert=findViewById(R.id.Temperature_convertion);

        gramconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(second_page.this, Gram_convertion.class);
                startActivity(intent);
            }
        });
        meterconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(second_page.this, meter_conversion.class);
                startActivity(intent);
            }
        });
        tempconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(second_page.this, temperature_convertion.class);
                startActivity(intent);
            }
        });

    }
    }