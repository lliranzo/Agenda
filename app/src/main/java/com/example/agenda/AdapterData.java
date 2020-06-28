package com.example.agenda;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.ViewHolderDatos> {


    ArrayList<DataVO> ListDatos;
    public AdapterData(ArrayList<DataVO> listDatos) {
        ListDatos = listDatos;
    }


    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
       holder.nombre.setText(ListDatos.get(position).getName());
       holder.foto.setImageResource(ListDatos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return ListDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nombre,sexo,carrera, fnacimiento;
        ImageView foto;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.idnombre);
            foto =(ImageView)itemView.findViewById(R.id.idimagen);
        }
    }
}
