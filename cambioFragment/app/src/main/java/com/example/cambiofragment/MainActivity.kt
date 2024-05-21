package com.example.cambiofragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

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
        var btnCambioFragment1=
            findViewById<Button>(R.id.btnCambioFragment1)

        var btnCambioFragment2=
            findViewById<Button>(R.id.btnCambioFragment2)

        var btnCambioFragment3=
            findViewById<Button>(R.id.btnCambioFragment3)

        btnCambioFragment1.setOnClickListener{
            cambioFragment(1)
        }

        btnCambioFragment2.setOnClickListener{
            cambioFragment(2)
        }

        btnCambioFragment3.setOnClickListener{
            cambioFragment(3)
        }

    }
    //método que gestiona el cambio de framentos
    fun cambioFragment(position:Int){
        //position:indica el fragmento deseado
        //fragment: indica el fragmento a cambiar
        var fragment:Fragment
        when(position){
            //segun el valor de position
            //se va a cambiar el fragmento
            1->fragment=FirstFragment()
            2->fragment=SecondFragment()
            3->fragment=ThirdFragment()
            else-> fragment=FirstFragment()
        }
        //supportFragmentManager es el que gestiona el cambio de fragmentos
        val fragmentManager=supportFragmentManager

        //se crea el objeto de la transicin del fragmento
        val fragmentTransition=fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.FCV,fragment)

        fragmentTransition.commit()
    }
}