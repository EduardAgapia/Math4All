package com.example.mathforall.specializations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mathforall.MainActivity;
import com.example.mathforall.R;


/*
ToDo:
Refactor
 */
public class Technological extends AppCompatActivity {

    private ImageView calculus;
    private ImageView algebra;
    private ImageView geometry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technological);

        calculus = findViewById(R.id.calculusM3);
        calculus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openM1();
            }
        });

        algebra = findViewById(R.id.algebraM3);
        algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openM2();
            }
        });

        geometry = findViewById(R.id.geometryM3);
        geometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openM3();
            }
        });
    }

    public void openM1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openM2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openM3() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
