package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Entrar(View view){
        Intent entrar = new Intent(this, ActivityDos.class);
        startActivity(entrar);
    }

    public void Registrar(View view){
        Intent registrar = new Intent(this, ActivityUno.class);
        startActivity(registrar);
    }
}