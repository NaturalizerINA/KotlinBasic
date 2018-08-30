package com.mukminullah.kotlinbasic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var mynumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val for final value that already contain value
        val me = "Me Kotlin"
        val bil1 = 0
        val bil2 = 1

        //var for dynamic value
        //this is initialization in kotlin, you did not set the value like var result = 0, but var result: "type"
        var result: Int

        //this is action for onClick with initialization too,
        findViewById<Button>(R.id.click_btn).setOnClickListener {

            //1.a. Selection Structure (when)
            //In kotlin, switch case replaced by when, and after the case like 0 in the bottom,
            //you can adding "->" and giving the command what to do if the value of case match with the expression
            when (mynumber) {
                0 -> hello_tv.text = "I'M KOTLIN!!!"
                1 -> {
                    result = bil1 + bil2
                    hello_tv.text = result.toString()
                }
                2 -> hello_tv.text = me
                else -> {
                    hello_tv.text = "Hello World!"
                    mynumber = -1
                }
            }
            mynumber++

            while_tv.text = doingDoWhile()

            do_while_tv.text = doingWhile()

            for_tv.text = doingFor()

        }

        //1.b. Selection Structure (if)
        if (mynumber == -1) {
            Toast.makeText(this, "Clear all to beginning", Toast.LENGTH_SHORT)
        } else {
            Toast.makeText(this, "You did it!, click Again", Toast.LENGTH_SHORT)
        }

    }

    fun doingWhile(): String {
        //2.a. Looping Structure (while)
        var i = 1
        var text = ""
        while (i <= 10) {
            text += i.toString()

            if (i != 10) {
                text += ", "
            }

            i++
        }

        return text
    }

    fun doingDoWhile(): String {
        //2.b. Looping Structure (do while)
        var i = 1
        var text = ""
        do {
            text += i.toString()

            if (i != 10) {
                text += ", "
            }

            i++
        } while (i <= 10)

        return text
    }

    fun doingFor(): String {
        //2.c. Looping Structure (for)
        var text = ""
        for (i in 1..10) {
            text += i.toString()

            if (i != 10) text += ", "
        }

        return text
    }
}
