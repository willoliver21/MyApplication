package com.example.willo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ExemploFragmentPrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exemplo_fragment_principal)

        val fr = supportFragmentManager
        val fragment1 = fr.findFragmentById(R.id.fragment1)
//        fragment1.nomMetodo

    }
}
