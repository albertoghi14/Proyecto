package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BorrarAsignatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrar_asignatura);
    }

    public void Borrar(View view){
        Intent borrar = new Intent(this, PantallaAsignaturas.class);
        startActivity(borrar);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, PantallaAsignaturas.class);
        startActivity(cancelar);
    }
}