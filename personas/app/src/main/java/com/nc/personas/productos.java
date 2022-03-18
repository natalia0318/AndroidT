package com.nc.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class productos extends AppCompatActivity {
    public ImageView Imagen4;
    public TextView NombreP;
    public TextView ColorP;
    public TextView Capacidad;
    public TextView TamañoP;
    public TextView Pantalla;
    public TextView Chip;
    public TextView Camara;
    public Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        setContentAttributes();

    }
    private void setContentAttributes(){
       Imagen4 = findViewById(R.id.Imagen4);
       NombreP = findViewById(R.id.NombreP);
       ColorP = findViewById(R.id.ColorP);
       Capacidad = findViewById(R.id.Capacidad);
       TamañoP = findViewById(R.id.TamañoP);
       Pantalla = findViewById(R.id.pantalla);
       Chip = findViewById(R.id.Chip);
       Camara = findViewById(R.id.Camara);
       button5 = findViewById(R.id.button5);



    }
}