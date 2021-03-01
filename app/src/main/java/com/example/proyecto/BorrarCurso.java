package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BorrarCurso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrar_curso);
    }

    public void Borrar(View view){
        Intent borrar = new Intent(this, ActivityDiez.class);
        startActivity(borrar);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, ActivityDiez.class);
        startActivity(cancelar);
    }
}