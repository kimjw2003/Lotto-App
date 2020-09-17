package com.example.lottoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lotteryNumbers = arrayListOf(num1, num2, num3, num4, num5, num6)

        val countDownTimer = object : CountDownTimer(3000, 100) {
            override fun onFinish() {
            }

            override fun onTick(millisUntilFinished: Long) {
                lotteryNumbers.forEach {
                    val randomNumber = (Math.random() * 45 + 1).toInt()
                    it.text = randomNumber.toString()
                }
            }
        }

        lotteryBtn.setOnClickListener {
            lotteryBtn.playAnimation()
            countDownTimer.start()

        }
    }
}