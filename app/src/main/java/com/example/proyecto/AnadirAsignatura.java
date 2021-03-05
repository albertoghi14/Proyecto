package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnadirAsignatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_asignatura);
    }

    public void Anadir(View view){
        Intent anadir = new Intent(this, PantallaAsignaturas.class);
        startActivity(anadir);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, PantallaAsignaturas.class);
        startActivity(cancelar);
    }
}