package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenCierreSesion extends AppCompatActivity {
    private ImageView logoInicio;
    private TextView textoInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_cierre_sesion);

        //Agregar Animaciones
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.rotacion);

        logoInicio = findViewById(R.id.imageView_logo_splash_screen_inicio);
        textoInicio = findViewById(R.id.textView_splash_screen_cerrar_sesion);


        logoInicio.setAnimation(animacion1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenCierreSesion.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 8000);
    }
}