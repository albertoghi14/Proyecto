package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModificarCurso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_curso);
    }

    public void Modificar(View view){
        Intent modificar = new Intent(this, PantallaCursosHorario.class);
        startActivity(modificar);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, PantallaCursosHorario.class);
        startActivity(cancelar);
    }
}