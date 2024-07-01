package com.example.calculadorasimples

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val TEXTO_APP_BAR:String = "Calculadora Simples";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById<Toolbar>(R.id.activity_toolbar);
        toolbar.setTitle(TEXTO_APP_BAR)






        val btnSomar : Button = findViewById(R.id.activity_main_btn_somar);

        btnSomar.setOnClickListener { v->
            val editText : EditText = findViewById(R.id.activity_numero1);
            val editText2 : EditText = findViewById(R.id.activity_numero2);

            var num1 = editText.text.toString().toFloat();
            var num2 = editText2.text.toString().toFloat();
            var result = num1 + num2;
            val txtResultado : TextView = findViewById(R.id.activity_main_txtview_resultado);
            txtResultado.text = result.toString();

        }

    }

}