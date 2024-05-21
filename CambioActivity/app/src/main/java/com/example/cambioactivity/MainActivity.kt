package com.example.cambioactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
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

        //version larga
        //definir boton
        /*
    var btnactivity2 : Button

        //asignar
        btnactivity2=findViewById<Button>(R.id.btnCambioActivity2)

        //acciion de click
        btnactivity2.setOnClickListener{
            //para hacer un cambio de activity

            Se configura el intent. es el intenti de ejecutar
            una actividad
             se asigna cual es la actividad que se va ajecutar  ejemeplo activity

            var intent=Intent(application,activity2::class.java)

            //se ejecuta la activity
            startActivity(intent)
        }

         */
    }
        //version corta
        fun cambioActivity1(view: View){
            var intent=Intent(application,activity2::class.java)
            startActivity(intent)
        }

        //segundo boton
        fun cambioActivity2(view: View){
            var intent=Intent(application,activity3::class.java)
            //PARA ENVIAR INFORMACIÓN ENTRE DOS ACTIVITY

            var txtNombre=findViewById<EditText>(R.id.txtNombre)
            //se crea un put extra por cada dato que se requiere
            intent.putExtra("nombre", txtNombre.text.toString())
            startActivity(intent)
        }
}