package com.example.innowisetask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_palindrome.*

class PalindromeActivity : AppCompatActivity() {

    private lateinit var sequence : ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.palindrome_activity_title)
        setContentView(R.layout.activity_palindrome)

        initCalculatePalindromeSequenceButton()
    }

    private fun initCalculatePalindromeSequenceButton() {
        btnCalculateSequencePalindrome.setOnClickListener {
            val n = edtInputPalindrome.text.toString().toInt()
            sequence = ArrayList()
            calculatePalindromeSequence(n)
        }
    }

    private fun calculatePalindromeSequence(n: Int) {

        for (i in 0..n) {
            var number = i
            var reverseNumber = 0
            while(number > 0) {
                val digit = number % 10
                reverseNumber = reverseNumber * 10 + digit
                number /= 10
            }
            if (i == reverseNumber) sequence.add(i)
        }
        showPalindromeSequence()
    }

    private fun showPalindromeSequence() {
        val sequenceString = StringBuilder()

        sequence.forEach {
            sequenceString.append(it)
            sequenceString.append(" ")
        }

        txtSequencePalindrome.text = sequenceString
    }

}
