package com.example.costcal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cal(view: View) {

        var txt1=findViewById(R.id.txt1) as EditText
        var txt2=findViewById(R.id.txt2) as EditText
        var txt3=findViewById(R.id.txt3) as EditText
        var txt4=findViewById(R.id.txt4) as EditText
        var txt5=findViewById(R.id.txt5) as EditText
        var distance=txt1.text.toString().toInt();
        var avg=txt2.text.toString().toInt();
        var rate=txt3.text.toString().toInt();
        var p=distance/avg;
        var cost=p*rate;
        txt4.setText("Petrol="  +p)
        txt5.setText("COST="  +cost);

    }
}