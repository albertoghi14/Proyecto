package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorProfesor extends BaseAdapter {

    private Context context;
    private ArrayList<Profesor> listaProfesores;

    public AdaptadorProfesor(Context context, ArrayList<Profesor> listaProfesores) {
        this.context = context;
        this.listaProfesores = listaProfesores;
    }

    @Override
    public int getCount() {
        return listaProfesores.size();
    }

    @Override
    public Object getItem(int position) {
        return listaProfesores.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Profesor profesor = (Profesor) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item_profesor,null);
        ImageView foto = (ImageView) convertView.findViewById(R.id.imageView_foto_item_profesor);
        TextView nombre = (TextView) convertView.findViewById(R.id.textView_nombre_item_profesor);
        TextView asignaturas = (TextView) convertView.findViewById(R.id.textView_asignaturas_profesor);
        TextView email = (TextView) convertView.findViewById(R.id.textView_email_item_profesor);
        TextView telefono = (TextView) convertView.findViewById(R.id.textView_telefono_item_profesor);

        foto.setImageResource(profesor.getFoto());
        nombre.setText(profesor.getNombre());
        asignaturas.setText(profesor.getAsignaturas());
        email.setText(profesor.getEmail());
        telefono.setText(profesor.getTelefono());

        return convertView;
    }
    }
