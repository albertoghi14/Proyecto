package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityUno extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);

        Spinner listaPaises;
        Spinner listaDias;
        Spinner listaMeses;
        Spinner listaAnos;

        String[] paises = getResources().getStringArray(R.array.array_paises);
        String[] dias = getResources().getStringArray(R.array.array_dias);
        String[] meses = getResources().getStringArray(R.array.array_meses);
        String[] anos = getResources().getStringArray(R.array.array_anos);

        listaPaises = (Spinner) findViewById(R.id.spinner_pais);
        listaDias = (Spinner) findViewById(R.id.spinner_dia);
        listaMeses = (Spinner) findViewById(R.id.spinner_mes);
        listaAnos = (Spinner) findViewById(R.id.spinner_ano);

        ArrayAdapter<String> adapterPais = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, paises);
        listaPaises.setAdapter(adapterPais);
        ArrayAdapter<String> adapterDia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dias);
        listaDias.setAdapter(adapterDia);
        ArrayAdapter<String> adapterMes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, meses);
        listaMeses.setAdapter(adapterMes);
        ArrayAdapter<String> adapterAno = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, anos);
        listaAnos.setAdapter(adapterAno);



        //listaDias = (Spinner) findViewById(R.id.spinner_dia);
        //ArrayAdapter<String> adapterDia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dias);
        //listaPaises.setAdapter(adapterDia);
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