package com.example.mathforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathforall.specializations.MathAndComputerScience;
import com.example.mathforall.specializations.NaturalScience;
import com.example.mathforall.specializations.Technological;



/*ToDo:
Refactor this class
 */

public class MainActivity extends AppCompatActivity {

    private Button M1;
    private Button M2;
    private Button M3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M1 = findViewById(R.id.M1);
        M1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openM1();
            }
        });

        M2 = findViewById(R.id.M2);
        M2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openM2();
            }
        });

        M3 = findViewById(R.id.M3);
        M3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openM3();
            }
        });
    }

    public void openM1() {
        Intent intent = new Intent(this, MathAndComputerScience.class);
        startActivity(intent);
    }

    public void openM2() {
        Intent intent = new Intent(this, NaturalScience.class);
        startActivity(intent);
    }

    public void openM3() {
        Intent intent = new Intent(this, Technological.class);
        startActivity(intent);
    }
}
