package com.example.innowisetask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.main_activity_title)
        setContentView(R.layout.activity_main)

        initAllListeners()
    }

    private fun initAllListeners() {
        btnFibonacci.setOnClickListener {
            val intent = Intent(this, FibonacciActivity::class.java)
            startActivity(intent)
        }

        btnOdd.setOnClickListener {
            val intent = Intent(this, OddActivity::class.java)
            startActivity(intent)
        }

        btnPalindrome.setOnClickListener {
            val intent = Intent(this, PalindromeActivity::class.java)
            startActivity(intent)
        }
    }
}
