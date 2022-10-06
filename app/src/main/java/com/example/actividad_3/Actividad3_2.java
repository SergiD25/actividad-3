package com.example.actividad_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad3_2 extends AppCompatActivity implements View.OnClickListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad32);

        TextView texto1 = (TextView) findViewById(R.id.texto1);
        TextView texto2 = (TextView) findViewById(R.id.texto2);
        TextView texto3 = (TextView) findViewById(R.id.texto3);
        TextView texto4 = (TextView) findViewById(R.id.texto4);
        TextView texto5 = (TextView) findViewById(R.id.texto5);
        Button  boton2 = (Button) findViewById(R.id.boton2);

        boton2.setOnClickListener(this);


    }


    public void Anterior(View view)
    {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    @Override
    public void onClick(View view) {

        int txt1;
        int txt2;
        int txt3;
        int txt4;
        int txt5;
        String traer;


        txt1.setText(Integer.toString(Carro.ca));

    }
}