package com.example.diogo.appcomparacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public float v1;
    public float v2;
    public EditText EditTextGas;
    public EditText EditTextAlc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void go(View view) {


            EditText EditTextGas = findViewById(R.id.EditTextGas);
            EditTextGas.getText().toString();
            v1 = Float.parseFloat(EditTextGas.getText().toString());




            EditText EditTextAlc = findViewById(R.id.EditTextAlc);
            EditTextAlc.getText().toString();
            v2 = Float.parseFloat(EditTextAlc.getText().toString());


            if ((v2 / v1) <= 0.7) {
                Toast.makeText(MainActivity.this, "Melhor usar Alcool", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "Melhor usar Gasolina", Toast.LENGTH_LONG).show();
            }
        }

    }
