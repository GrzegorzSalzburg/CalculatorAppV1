package com.example.calculator_version_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var equationtv: TextView
    private lateinit var resulttv: TextView
    private var canAddOperation = false
    private var canAddDecimal = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        equationtv = findViewById(R.id.equationtv)
        resulttv = findViewById(R.id.resulttv)
    }

    fun allClearAction(view: View) {
        equationtv.text = ""
        resulttv.text = ""
    }

    fun backSpaceAction(view: View) {
        val length = equationtv.length()
        if (length > 0)
            equationtv.text = equationtv.text.subSequence(0, length - 1)
    }

    fun numberAction(view: View) {
        if (view is Button) {
            if (view.text == ".") {
                if (canAddDecimal)
                    equationtv.append(view.text)

                canAddDecimal = false
            } else
                equationtv.append(view.text)

            canAddOperation = true
        }
    }

    fun operationAction(view: View){
        if(view is Button && canAddOperation)
        {
            equationtv.append(view.text)
            canAddOperation = false
            canAddDecimal = true
        }
    }

    fun equalsAction(view: View) {

    }
}