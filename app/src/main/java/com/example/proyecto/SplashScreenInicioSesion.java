package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenInicioSesion extends AppCompatActivity {
    private ProgressBar progressBar;

    private Timer tarea;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_inicio_sesion);

        progressBar = findViewById(R.id.progressBar_splash_screen_inicio_sesion);

        tarea = new Timer();
        tarea.schedule(new TimerTask() {
            @Override
            public void run() {
                if (i < 100) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });
                    progressBar.setProgress(i);
                    i++;
                } else {
                    tarea.cancel();
                    Intent intent = new Intent(SplashScreenInicioSesion.this, ActivityDos.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 0, 50);
    }
}