package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnadirCurso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_curso);
    }

    public void Anadir(View view){
        Intent anadir = new Intent(this, PantallaCursosHorario.class);
        startActivity(anadir);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, PantallaCursosHorario.class);
        startActivity(cancelar);
    }
}