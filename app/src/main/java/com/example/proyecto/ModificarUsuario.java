package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ModificarUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_usuario);
    }

    public void Modificar(View view){
        Intent modificar = new Intent(this, ActivityDoce.class);
        startActivity(modificar);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, ActivityDoce.class);
        startActivity(cancelar);
    }
}