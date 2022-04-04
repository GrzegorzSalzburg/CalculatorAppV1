package com.example.calculator_version_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var worktv: TextView
    private lateinit var resulttv: TextView
    private var canAddOperation = false
    private var canAddDecimal = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        worktv = findViewById(R.id.worktv)
        resulttv = findViewById(R.id.resulttv)
    }

    fun allClearAction(view: View) {
        worktv.text=""
        resulttv.text=""
    }
    fun backSpaceAction(view: View) {
        val length = worktv.length()
        if(length > 0)
            worktv.text = worktv.text.subSequence(0, length - 1)
    }
    fun equalsAction(view: View) {

    }
}