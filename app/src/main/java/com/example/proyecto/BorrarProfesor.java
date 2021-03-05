package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BorrarProfesor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrar_profesor);
    }

    public void Borrar(View view){
        Intent borrar = new Intent(this, PantallaProfesores.class);
        startActivity(borrar);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, PantallaProfesores.class);
        startActivity(cancelar);
    }
}