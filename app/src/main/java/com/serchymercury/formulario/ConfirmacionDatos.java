package com.serchymercury.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacionDatos extends AppCompatActivity {

    private TextView textNombre, textFecha, textTelefono, textEmail, textDescripcion;
    private Button miBoton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacion_datos);



        textNombre = (TextView) findViewById(R.id.textViewnombre2);
        textFecha = (TextView) findViewById(R.id.textViewcumpleaños2);
        textTelefono = (TextView) findViewById(R.id.textViewnumero2);
        textEmail = (TextView) findViewById(R.id.textViewemail2);
        textDescripcion = (TextView) findViewById(R.id.textViewdescrip2);




        String Nombre = getIntent().getStringExtra("Nombre");
        String Fecha = getIntent().getStringExtra("Fecha");
        String Telefono = getIntent().getStringExtra("Telefono");
        String Email = getIntent().getStringExtra("Email");
        String Descripcion = getIntent().getStringExtra("Descripcion");

        textNombre.setText(Nombre);
        textFecha.setText(Fecha);
        textTelefono.setText(Telefono);
        textEmail.setText(Email);
        textDescripcion.setText(Descripcion);

        miBoton2 = (Button) view.findViewById(R.id.miBoton2);
        edit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this, Tarea2_Formulario.class);
                startActivity(intent);
                finish();
            }
        });

        }


    }
