package com.example.damep_abm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        // Configuración del botón "Ingresar"
        Button btn1 = findViewById(R.id.button_primero);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Se envió los datos", Toast.LENGTH_SHORT).show());

        // Configuración del texto "Crear Cuenta"
        TextView tv2 = findViewById(R.id.textView_segundo);
        tv2.setOnClickListener(view -> Toast.makeText(this, "Crear Cuenta", Toast.LENGTH_SHORT).show());



    }
}

