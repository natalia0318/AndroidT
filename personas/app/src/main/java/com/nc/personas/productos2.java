package com.nc.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class productos2 extends AppCompatActivity {
    public ImageView FotoC;
    public TextView NombreC;
    public TextView ColorC;
    public TextView CapacidadC;
    public TextView TamañoC;
    public TextView pantallaC;
    public TextView ChipC;
    public TextView CamaraC;
    public Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos2);
        setContentAttributes();

    }
    private void setContentAttributes(){
        FotoC = findViewById(R.id.FotoC);
        NombreC = findViewById(R.id.NombreC);
        ColorC = findViewById(R.id.ColorC);
        CapacidadC = findViewById(R.id.CapacidadC);
        TamañoC = findViewById(R.id.TamañoC);
        pantallaC = findViewById(R.id.pantallaC);
        ChipC = findViewById(R.id.ChipC);
        CamaraC = findViewById(R.id.CamaraC);
        button6 = findViewById(R.id.button6);




    }
}