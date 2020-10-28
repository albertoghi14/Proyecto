package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, MainActivity.class);
        startActivity(cancelar);

        Toast toastCancelar =
                Toast.makeText(getApplicationContext(),
                        "Regreso al inicio", Toast.LENGTH_LONG);

        toastCancelar.show();
    }

    public void Entrar(View view){
        Intent entrar = new Intent(this, ActivityDos.class);
        startActivity(entrar);

        Toast toastCrear =
                Toast.makeText(getApplicationContext(),
                        "Cuenta creada correctamente", Toast.LENGTH_LONG);

        toastCrear.show();
    }
}