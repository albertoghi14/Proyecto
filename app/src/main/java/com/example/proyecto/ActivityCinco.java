package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityCinco extends AppCompatActivity {
    private ListView alumnos;
    private AdaptadorAlumno adaptadorAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco);

        alumnos = (ListView) findViewById(R.id.listView_alumnos);
        adaptadorAlumnos = new AdaptadorAlumno(this,GetArrayItems());
        alumnos.setAdapter(adaptadorAlumnos);
    }

    private ArrayList<Alumno> GetArrayItems(){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alberto González Hierro", "20 años", "agonzalezhierro@gmail.com", "C/ el Carmen 8", "Colindres, Cantabria", "606885762"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Carlos Pérez Ruiz", "23 años", "carlosRuiz@hotmail.com", "C/ las Ferias 11", "Laredo, Cantabria", "606885761"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Alba Lopez Orejana", "19 años", "albLopez68@gmail.com", "C/ Santander 25", "Bilbao, País Vasco", "606885763"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Hector Brigido Fernández", "20 años", "brigHector@gmail.com", "C/ Santa Justa 18", "Santoña, Cantabria", "606885764"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Jonathan Riego Ruiz", "20 años", "jonyriego11@hotmail.com", "C/ los Pinos 2", "Castro-Urdiales, Cantabria", "606885765"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Sandra González Sainz", "21 años", "sanxyg@hotmail.com", "C/ El Encinar", "Castro-Urdiales, Cantabria", "606885766"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Carla Velasco Santos", "32 años", "carlavelasc8@hotmail.com", "C/ Los Tornos", "Castro-Urdiales, Cantabria", "606885767"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Ivan Gutierrez Gutierrez", "26 años", "ivigu@gmail.com", "C/ La esquina", "Laredo, Cantabria", "606885768"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Maider Lopez Gonzalez", "26 años", "maidergonlo@gmail.com", "C/ del Sol", "Colindres, Cantabria", "606885769"));
        listaAlumnos.add(new Alumno(R.drawable.avatar, "Jorge Alvarado Zancada", "21 años", "jorgeAZ@gmail.com", "C/ la Alameda", "Santander, Cantabria", "606885760"));

        return listaAlumnos;
    }
}