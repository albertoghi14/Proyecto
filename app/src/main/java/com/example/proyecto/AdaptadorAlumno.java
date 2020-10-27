package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorAlumno extends BaseAdapter {
    private Context context;
    private ArrayList<Alumno> listaAlumnos;

    public AdaptadorAlumno(Context context, ArrayList<Alumno> listaAlumnos) {
        this.context = context;
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public int getCount() {
        return listaAlumnos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaAlumnos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Alumno alumno = (Alumno) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item_alumno,null);
        ImageView foto = (ImageView) convertView.findViewById(R.id.imageView_foto_item_alumno);
        TextView nombre = (TextView) convertView.findViewById(R.id.textView_nombre_item_alumno);
        TextView edad = (TextView) convertView.findViewById(R.id.textView_edad_item_alumno);
        TextView email = (TextView) convertView.findViewById(R.id.textView_email_item_alumno);
        TextView direccion = (TextView) convertView.findViewById(R.id.textView_direccion_item_alumno);
        TextView domicilio = (TextView) convertView.findViewById(R.id.textView_domicilio_item_alumno);
        TextView telefono = (TextView) convertView.findViewById(R.id.textView_telefono_item_alumno);

        foto.setImageResource(alumno.getFoto());
        nombre.setText(alumno.getNombre());
        edad.setText(alumno.getEdad());
        email.setText(alumno.getEmail());
        direccion.setText(alumno.getDireccion());
        domicilio.setText(alumno.getDomicilio());
        telefono.setText(alumno.getTelefono());

        return convertView;
    }
}
