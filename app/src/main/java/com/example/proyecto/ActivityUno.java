package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, MainActivity.class);
        startActivity(cancelar);
    }

    public void Entrar(View view){
        Intent entrar = new Intent(this, ActivityDos.class);
        startActivity(entrar);
    }
}