package com.example.willo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_exemplo_fragment2.*
import kotlinx.android.synthetic.main.activity_exemplo_fragment2.*
import kotlinx.android.synthetic.main.fragment_caixas_soma.*


class ExemploFragment2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exemplo_fragment2)

        if(savedInstanceState == null){
            val fm = supportFragmentManager.beginTransaction()
            val fragment1 = CaixasSomaFragment()
            val fragment2 = SomarFragment()
            val fragment3 = SubtrairFragment()
            fm.add(R.id.layoutCaixas, fragment1, "Caixas")
            fm.add(R.id.layoutSomar, fragment2, "Somar")
            fm.add(R.id.layoutSubtrair, fragment3, "Subtrair")
            fm.commit()
        }



//        val btnSomar = findViewById<Button>(R.id.btnSomar)
//        btnSomar.setOnClickListener{
//            val n1 = cx1.text.toString().toInt()
//            val n2 = cx2.text.toString().toInt()
//            resultadoConta.text = ":" + n1+n2
////            resultadoConta.setText(n1+n2)
//        }

//        fun Soma() {
//            val n1 = R.id.cx1
//            val n2 = R.id.cx2
//            val resul = n1 + n2
//            resultadoConta.text = ":$resul"
//        }



    }
}
