package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityOcho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocho);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cursos_profesores, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_anadir_cursos_profesores:

                return true;

            case R.id.menu_modificar_cursos_profesores:

                return true;

            case R.id.menu_eliminar_cursos_profesores:

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}