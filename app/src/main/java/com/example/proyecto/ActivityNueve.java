package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityNueve extends AppCompatActivity {

    ListView lista;
    AdaptadorProfesor adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueve);

        lista = (ListView) findViewById(R.id.listView_profesores);
        adaptador = new AdaptadorProfesor(this, GetArrayItems());
        lista.setAdapter(adaptador);
    }

    private ArrayList<Profesor> GetArrayItems(){
        ArrayList<Profesor> listaProfesores = new ArrayList<>();

        listaProfesores.add(new Profesor(R.drawable.avatar, "Profesor 1", "Asignatura 1", "prof1@gmail.com", "606881651"));
        listaProfesores.add(new Profesor(R.drawable.avatar, "Profesor 2", "Asignatura 3", "prof2@gmail.com", "606881652"));
        listaProfesores.add(new Profesor(R.drawable.avatar, "Profesor 3", "Asignatura 2", "prof3@gmail.com", "606881653"));
        listaProfesores.add(new Profesor(R.drawable.avatar, "Profesor 4", "Asignatura 4", "prof4@gmail.com", "606881654"));
        listaProfesores.add(new Profesor(R.drawable.avatar, "Profesor 5", "Asignatura 6", "prof5@gmail.com", "606881655"));
        listaProfesores.add(new Profesor(R.drawable.avatar, "Profesor 6", "Asignatura 5", "prof6@gmail.com", "606881656"));

        return listaProfesores;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones_profesores, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_anadir_profesores:
                return true;

            case R.id.menu_modificar_profesor:

                return true;

            case R.id.menu_eliminar_profesor:

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}