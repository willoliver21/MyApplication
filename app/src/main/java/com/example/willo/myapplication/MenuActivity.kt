package com.example.willo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.example.willo.myapplication.R.id.resultadoConta
import kotlinx.android.synthetic.main.activity_exemplo_fragment2.*
import kotlinx.android.synthetic.main.activity_listar.*
import kotlinx.android.synthetic.main.activity_logar.*
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_registrar.*

class MenuActivity : AppCompatActivity() {

    lateinit var usersDBHelper : UsersDBHelper



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        usersDBHelper = UsersDBHelper(this)

        val btnLogar = findViewById<Button>(R.id.btnLogar)
        btnLogar.setOnClickListener{
            setContentView(R.layout.activity_logar)
        }

        val btnReg = findViewById<Button>(R.id.btnRegistrar)
        btnReg.setOnClickListener{
            setContentView(R.layout.activity_registrar)
        }

        val btnList = findViewById<Button>(R.id.btnListar)
        btnList.setOnClickListener{
            setContentView(R.layout.activity_listar)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item1 -> {
                setContentView(R.layout.activity_menu)
                return super.onOptionsItemSelected(item)

            }

            R.id.item2 -> {
                setContentView(R.layout.activity_logar)
                return super.onOptionsItemSelected(item)
            }

            R.id.item3 -> {
                setContentView(R.layout.activity_registrar)
                return super.onOptionsItemSelected(item)
            }

            R.id.item4 -> {
                setContentView(R.layout.activity_listar)
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)
            }
        }



    fun addUser(v: View){
        var name = this.Iname.text.toString()
        var email = this.Iemail.text.toString()
        var password = this.Ipassword.text.toString()
        var result = usersDBHelper.insertUser(UserModel(email = email,password = password,name = name))
        setContentView(R.layout.activity_menu)
        //clear all edittext s
//        this.edittext_age.setText("")
//        this.edittext_name.setText("")
//        this.edittext_userid.setText("")
//        this.textview_result.text = "Added user : "+result
//        this.ll_entries.removeAllViews()
    }

    fun deleteUser(v: View){
        var email = this.Iemail.text.toString()
        val result = usersDBHelper.deleteUser(email)
//        this.textview_result.text = "Deleted user : "+result
//        this.ll_entries.removeAllViews()
    }

    fun showAllUsers(v:View){
        var users = usersDBHelper.readAllUsers()
        this.ll_entries.removeAllViews()
        users.forEach {
            var tv_user = TextView(this)
            tv_user.textSize = 30F
            tv_user.text = it.name.toString()
            this.ll_entries.addView(tv_user)
        }
        this.textview_result.text = "Usuarios Cadastrados: " + users.size
    }


//
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

