package com.example.ejercicio

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var texto : EditText = findViewById(R.id.eT)
        var boton : Button = findViewById(R.id.button)
        var img : ImageView = findViewById(R.id.imageView)
        var fondo : ConstraintLayout = findViewById(R.id.fondo)




        boton.setOnClickListener(){
            boton.setText("Finalizar")
            visibleInvisible(texto, boton)
        }

        texto.setOnClickListener(){
                texto.setText(null)
        }

        texto.setOnFocusChangeListener(){view, focus ->
            if(!focus){
                capturaNombre(texto, img, boton,fondo )
            }
        }
    }


    fun visibleInvisible(texto : EditText, boton : Button){
        if(texto.getVisibility() == View.VISIBLE){
            texto.setVisibility(View.INVISIBLE)
            boton.setText("Comenzar")
            }
        else{
            texto.setVisibility(View.VISIBLE);
        }
    }

    fun capturaNombre(texto: EditText, img : ImageView, boton: Button, fondo : ConstraintLayout){
            if(texto.text.toString().equals("")){
                texto.setText("Introduce tu nombre")
            }
            if(texto.text.toString().equals("Wayne")){
                img.setVisibility(View.VISIBLE)
            }else{
                img.setVisibility(View.INVISIBLE)
            }
        if (texto.text.toString().equals("Joker")){
            boton.setBackgroundColor(Color.parseColor("#18ad13"))
            boton.setTextColor(Color.parseColor("#7e15a1"))
            fondo.setBackgroundColor(Color.parseColor("#7e15a1"))
            //texto.setBackgroundColor(Color.parseColor("#18ad13"))
            texto.setTextColor(Color.parseColor("#18ad13"))
        }else{
            boton.setBackgroundColor(Color.parseColor("#FF6200EE"))
            boton.setTextColor(Color.parseColor("#FF000000"))
            fondo.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
           //texto.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            texto.setTextColor(Color.parseColor("#FF000000"))
        }
    }


}
