package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaLocalizacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_localizacion);
    }

    public void Entrar(View view){
        Intent entrar = new Intent(this, PantallaMapa.class);
        startActivity(entrar);
    }
}