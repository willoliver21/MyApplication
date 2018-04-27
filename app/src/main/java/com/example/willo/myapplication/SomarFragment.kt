package com.example.willo.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.activity_exemplo_fragment2.*
import kotlinx.android.synthetic.main.fragment_caixas_soma.*

class SomarFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_somar, container, false)


    }

    fun FunSomar(view: View){


            val n1 = cx1.text.toString().toInt()
            val n2 = cx2.text.toString().toInt()
            resultadoConta.text = ":" + n1+n2
//            resultadoConta.setText(n1+n2)

    }





}
