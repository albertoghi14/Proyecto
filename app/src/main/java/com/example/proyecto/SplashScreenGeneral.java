package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

public class SplashScreenGeneral extends AppCompatActivity {

    private ImageView logoCarga;

    //ObjectAnimator -> Proporciona soporte para animar los objetos
    private ObjectAnimator animatorLogoCarga;
    private long animationDuration = 1000;

    //AnimatorSet ->
    private AnimationSet animationSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_general);

        logoCarga = findViewById(R.id.imageView_logo_splash_screen_general);
        animacion();
    }

    private void animacion() {
        animatorLogoCarga = ObjectAnimator.ofFloat(logoCarga, "y", 500f);
        animatorLogoCarga.setDuration(animationDuration);
        AnimatorSet animationSetY = new AnimatorSet();
        animationSetY.play(animatorLogoCarga);
        animationSetY.start();


    }


}