package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.proyecto.entidades.Asignatura;
import java.util.ArrayList;

public class AdaptadorAsignatura extends BaseAdapter {

    private Context context;
    private ArrayList<Asignatura> listaAsignaturas;

    public AdaptadorAsignatura(Context context, ArrayList<Asignatura> listaAsignaturas) {
        this.context = context;
        this.listaAsignaturas = listaAsignaturas;
    }

    @Override
    public int getCount() {
        return listaAsignaturas.size();
    }

    @Override
    public Object getItem(int position) {
        return listaAsignaturas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Asignatura asignatura = (Asignatura) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item_asignatura, null);
        TextView siglasAsignatura = convertView.findViewById(R.id.textView_siglas_asignatura);
        TextView descripcionAsignatura = convertView.findViewById(R.id.textView_descripcion_asignatura);
        TextView aulaAsignatura = convertView.findViewById(R.id.textView_aula_asignatura);

        siglasAsignatura.setText(asignatura.getSiglasAsignatura());
        descripcionAsignatura.setText(asignatura.getDescripcionAsignatura());
        aulaAsignatura.setText(asignatura.getAulaAsignatura());

        return convertView;
    }
    }

