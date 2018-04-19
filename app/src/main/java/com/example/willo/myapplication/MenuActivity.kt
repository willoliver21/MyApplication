package com.example.willo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logar.*
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_registrar.*

class MenuActivity : AppCompatActivity() {

    lateinit var handler:DatabaseHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

//        handler=DatabaseHelper(this)

        val btnLogar = findViewById<Button>(R.id.btnLogar)
        btnLogar.setOnClickListener{
            setContentView(R.layout.activity_logar)
        }

        val btnReg = findViewById<Button>(R.id.btnRegistrar)
        btnReg.setOnClickListener{
            setContentView(R.layout.activity_registrar)
        }

//        val btnSave = findViewById<Button>(R.id.btnSave)
//        btnSave.setOnClickListener{
//            handler.insertUserData(name.text.toString(),email.text.toString(),password.text.toString())
//            setContentView(R.layout.activity_menu)
//        }
//
//        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
//        btnEntrar.setOnClickListener{
//            if( handler.userPresent(loginEmail.text.toString(),loginPassword.text.toString())){
//                Toast.makeText(this,"Logado",Toast.LENGTH_SHORT).show()
//            }else{
//                Toast.makeText(this,"Email ou Senha Errados",Toast.LENGTH_SHORT).show()
//            }
//        }


    }
}
