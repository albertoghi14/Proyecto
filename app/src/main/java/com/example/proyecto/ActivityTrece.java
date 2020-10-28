package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityTrece extends AppCompatActivity {

    ListView lista;
    AdaptadorAsignatura adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trece);

        lista = (ListView) findViewById(R.id.listView_cursos);
        adaptador = new AdaptadorAsignatura(this, GetArrayItems());
        lista.setAdapter(adaptador);
    }

    private ArrayList<Asignatura> GetArrayItems(){
        ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();

        listaAsignaturas.add(new Asignatura("A1", "Asignatura 1", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A2", "Asignatura 2", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A3", "Asignatura 3", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A4", "Asignatura 4", "Aula B6"));
        listaAsignaturas.add(new Asignatura("A5", "Asignatura 5", "Aula B8"));
        listaAsignaturas.add(new Asignatura("A6", "Asignatura 6", "Aula B8"));

        return listaAsignaturas;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones_asignaturas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_anadir_asignaturas:
                return true;

            case R.id.menu_modificar_asignaturas:

                return true;

            case R.id.menu_eliminar_asignaturas:

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
