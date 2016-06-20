package com.serchymercury.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tarea2_Formulario extends AppCompatActivity {

private EditText campoNombre, campoFecha, campoTelefono, campoEmail, campoDescripcion;
    private Button miBoton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarea2__formulario);

        campoNombre = (EditText) findViewById(R.id.Nombre);
        campoFecha = (EditText) findViewById(R.id.Fecha);
        campoTelefono = (EditText) findViewById(R.id.Telefono);
        campoEmail = (EditText) findViewById(R.id.Correo);
        campoDescripcion = (EditText) findViewById(R.id.Descripcion);
        miBoton = (Button) findViewById(R.id.btn1);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tarea2_Formulario.this, ConfirmacionDatos.class);
                i.putExtra("Nombre", campoNombre.getText()+"");
                i.putExtra("Fecha", campoFecha.getText()+"");
                i.putExtra("Telefono", campoTelefono.getText()+"");
                i.putExtra("Email", campoEmail.getText()+"");
                i.putExtra("Descripcion", campoDescripcion.getText()+"");
                startActivity(i);
            }
        });






    }
}
