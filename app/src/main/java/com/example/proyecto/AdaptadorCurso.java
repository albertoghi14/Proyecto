package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorCurso extends BaseAdapter {

    private Context context;
    private ArrayList<Curso> listaCursos;

    public AdaptadorCurso(Context context, ArrayList<Curso> listaCursos) {
        this.context = context;
        this.listaCursos = listaCursos;
    }

    @Override
    public int getCount() {
        return listaCursos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaCursos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Curso curso = (Curso) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item_curso, null);
        TextView siglasCurso = (TextView) convertView.findViewById(R.id.textView_siglas_curso);
        TextView descripcionCurso = (TextView) convertView.findViewById(R.id.textView_descripcion_curso);

        siglasCurso.setText(curso.getSiglasCurso());
        descripcionCurso.setText(curso.getDescripcionCurso());

        return convertView;
    }
}
