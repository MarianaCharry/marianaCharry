package com.example.saludo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //definición de los objetos
        var boton: Button
        var txtNombre: TextView
        //asignación del valor

        boton=findViewById(R.id.boton)
        txtNombre=findViewById(R.id.txtNombre)
        //configurar la acción al presionar el botón ingresar
        boton.setOnClickListener {
            var nombre=txtNombre.text
            //se utiliza el mensaje Toast para mostrar el saludo
            Toast.makeText(applicationContext, "Hola ${nombre}",
                Toast.LENGTH_LONG //duración del texto

            ).show()
        }

    }
}