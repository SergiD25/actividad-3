package com.example.actividad_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carro carrito = new Carro(10000,4,"verde",8,1000);
    }

    public void Siguiente(View view)
    {
        Intent siguiente = new Intent(this, Actividad3_2.class);
        startActivity(siguiente);
    }
}