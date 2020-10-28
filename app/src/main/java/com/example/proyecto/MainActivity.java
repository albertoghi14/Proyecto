package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Entrar(View view){
        Intent entrar = new Intent(this, ActivityDos.class);
        startActivity(entrar);

        Toast toastEntrar =
                Toast.makeText(getApplicationContext(),
                        "Inicio de sesión correcto", Toast.LENGTH_LONG);

        toastEntrar.show();
    }

    public void Registrar(View view){
        Intent registrar = new Intent(this, ActivityUno.class);
        startActivity(registrar);

        Toast toastCrear =
                Toast.makeText(getApplicationContext(),
                        "Creación de cuenta nueva", Toast.LENGTH_LONG);

        toastCrear.show();
    }
}