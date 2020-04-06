package com.example.innowisetask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fibonacci.*
import java.lang.StringBuilder


class FibonacciActivity : AppCompatActivity() {

    private lateinit var sequence : ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.fibonacci_activity_title)
        setContentView(R.layout.activity_fibonacci)

        initCalculateFibonacciSequenceButton()
    }

    private fun initCalculateFibonacciSequenceButton() {
        btnCalculateSequenceFibonacci.setOnClickListener {
            val n = edtInputFibonacci.text.toString().toInt()
            sequence = ArrayList()
            calculateFibonacciSequence(n)
        }
    }

    private fun calculateFibonacciSequence(n: Int) {
        var n0 = 1
        var n1 = 1
        var n2: Int

        sequence.add(n0)
        sequence.add(n1)

        for (i in 3..n) {
            n2 = n0 + n1
            n0 = n1
            n1 = n2
            sequence.add(n2 * n2)
        }

        showFibonacciSequence()
    }

    private fun showFibonacciSequence() {
        val sequenceString = StringBuilder()

        sequence.forEach {
            sequenceString.append(it)
            sequenceString.append(" ")
        }

        txtSequenceFibonacci.text = sequenceString
    }
}
