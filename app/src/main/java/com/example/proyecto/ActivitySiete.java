package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActivitySiete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siete);
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
                Intent anadirAsignatura = new Intent(ActivitySiete.this, AnadirAsignatura.class);
                startActivity(anadirAsignatura);
                return true;

            case R.id.menu_modificar_asignaturas:
                Intent modificarAsignatura = new Intent(ActivitySiete.this, ModificarAsignatura.class);
                startActivity(modificarAsignatura);
                return true;

            case R.id.menu_eliminar_asignaturas:
                Intent borrarAsignatura = new Intent(ActivitySiete.this, BorrarAsignatura.class);
                startActivity(borrarAsignatura);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}