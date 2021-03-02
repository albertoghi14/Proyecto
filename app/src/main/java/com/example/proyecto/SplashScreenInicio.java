package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenInicio extends AppCompatActivity {
    private ImageView logoInicio;
    private TextView textoInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen_inicio);

        //Agregar Animaciones
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        logoInicio = findViewById(R.id.imageView_logo_splash_screen_inicio);
        textoInicio = findViewById(R.id.textView_splash_screen_inicio_texto);


        logoInicio.setAnimation(animacion1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenInicio.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 8000);
    }

    }

