package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModificarProfesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_profesor);
    }

    public void Modificar(View view){
        Intent modificar = new Intent(this, ActivityNueve.class);
        startActivity(modificar);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, ActivityNueve.class);
        startActivity(cancelar);
    }
}