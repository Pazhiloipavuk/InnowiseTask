package com.example.innowisetask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_odd.*

class OddActivity : AppCompatActivity() {

    private lateinit var sequence : ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.odd_activity_title)
        setContentView(R.layout.activity_odd)

        initCalculateOddSequenceButton()
    }

    private fun initCalculateOddSequenceButton() {
        btnCalculateSequenceOdd.setOnClickListener {
            val n = edtInputOdd.text.toString().toInt()
            sequence = ArrayList()
            calculateOddSequence(n)
        }
    }

    private fun calculateOddSequence(n: Int) {
        for (i in 0..n) {
            if (i % 2 != 0) sequence.add(i * i)
        }

        showOddSequence()
    }

    private fun showOddSequence() {
        val sequenceString = StringBuilder()

        sequence.forEach {
            sequenceString.append(it)
            sequenceString.append(" ")
        }

        txtSequenceOdd.text = sequenceString
    }
}
