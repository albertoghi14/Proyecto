package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModificarAsignatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_asignatura);
    }

    public void Modificar(View view){
        Intent modificar = new Intent(this, PantallaAsignaturas.class);
        startActivity(modificar);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, PantallaAsignaturas.class);
        startActivity(cancelar);
    }
}