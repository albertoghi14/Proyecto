package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class ModificarUsuario extends AppCompatActivity {
    private final static String CHANNEL_ID = "NOTIFICACION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_usuario);
    }

    public void Modificar(View view){
        Intent modificar = new Intent(this, PantallaInformacionCuenta.class);
        startActivity(modificar);
        createNotificationChannel();
        createNotification();
    }

    public void Cancelar(View view){
        Intent cancelar = new Intent(this, PantallaInformacionCuenta.class);
        startActivity(cancelar);
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "NOTIFICACION";
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, name, NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void createNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID);
        builder.setSmallIcon(R.drawable.ic_icono_notificacion);
        builder.setContentTitle("Modificación de usuario");
        builder.setContentText("Hey! Un cambio de look?" +
                "" +
                "Vemos que has cmabiado información relacionada con tus datos personales." +
                "Sea cual sea el motivo estamos encantandos de que sigas confiando en nuestro trabajo.");
        builder.setColor(Color.BLUE);
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setDefaults(Notification.DEFAULT_SOUND);

        builder.setContentIntent(PendingIntent.getActivity(ModificarUsuario.this, (int) System.currentTimeMillis(), new Intent(ModificarUsuario.this, PantallaPrincipal.class), 0));

        NotificationManager nmanager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nmanager.notify(0, builder.build());

    }


}