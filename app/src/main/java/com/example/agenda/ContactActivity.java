package com.example.agenda;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    ArrayList<String> ListDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        recycler=(RecyclerView) findViewById(R.id.reclyid);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        ListDatos=new ArrayList<String>();
        for(int i=0;i<50; i++){
            ListDatos.add("Datos"+i+"Ploa");
        }

    }
}
