package com.example.practisinglayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), OnClickListener {
    internal lateinit var button1: Button
    internal lateinit var button2: Button
    internal lateinit var button3: Button
    internal lateinit var button4: Button
    internal lateinit var button5: Button
    internal lateinit var button6: Button
    internal lateinit var button7: Button
    internal lateinit var button8: Button
    internal lateinit var button9: Button
    internal lateinit var button0: Button
    internal lateinit var button_minus: Button
    internal lateinit var button_addition: Button
    internal lateinit var button_division: Button
    internal lateinit var button_Multiplication: Button
    internal lateinit var button_decimal: Button
    internal lateinit var button_brackets: Button
    internal lateinit var button_percent: Button
    internal lateinit var button_pos_neg: Button
    internal lateinit var button_Clear: Button
    internal lateinit var button_equals: Button
    internal lateinit var displayTextView: TextView
    internal var result = 0



    private var inputValues: MutableList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button0 = findViewById(R.id.numberZero)
        button1 = findViewById(R.id.number1)
        button2 = findViewById(R.id.number2)
        button3 = findViewById(R.id.number3)
        button4 = findViewById(R.id.number4)
        button5 = findViewById(R.id.number5)
        button6 = findViewById(R.id.number6)
        button7 = findViewById(R.id.number7)
        button8 = findViewById(R.id.number8)
        button9 = findViewById(R.id.number9)
        button_minus = findViewById(R.id.subtractionButton)
        button_addition = findViewById(R.id.additionButton)
        button_division = findViewById(R.id.divisionButton)
        button_Multiplication = findViewById(R.id.multiplicationButton)
        button_decimal = findViewById(R.id.decimal)
        button_brackets = findViewById(R.id.bracketButton)
        button_percent = findViewById(R.id.percentButton)
        button_pos_neg = findViewById(R.id.positive_negative)
        button_Clear = findViewById(R.id.erase_button)
        button_equals = findViewById(R.id.equalsButton)
        displayTextView = findViewById(R.id.textDisplay1)


        button0.setOnClickListener (this)

        button1.setOnClickListener (this)
        button2.setOnClickListener (this)
        button3.setOnClickListener (this)
        button4.setOnClickListener (this)
        button5.setOnClickListener (this)
        button6.setOnClickListener (this)
        button7.setOnClickListener (this)
        button8.setOnClickListener (this)
        button9.setOnClickListener (this)
        button_Clear.setOnClickListener (this)
        button_addition.setOnClickListener(this)
        button_minus.setOnClickListener(this)
        button_division.setOnClickListener(this)
        button_Multiplication.setOnClickListener(this)
        button_equals.setOnClickListener(this)






    }
    private fun displayButtonText () : Unit{
        var data = ""
        if (!inputValues.isEmpty()) {
            for (i in inputValues){
                data+= i
            }
        }
        displayTextView.text = data
    }
    private fun addInput (input: String) : Unit {
        inputValues.add(input)
    }
    private fun eraseCalculator(): Unit {
        inputValues.clear()
        displayButtonText()

    }
    private fun calculate(operator: String ){
         var sum = 0
        when(operator){
            "+" -> {
                inputValues
            }
        }
    }

     override fun onClick(p0: View?) {
         when(p0?.id){
             R.id.numberZero -> {
                 addInput("0")
                 displayButtonText()
             }
             R.id.number1 -> {
                 addInput("1")
                 displayButtonText()
             }
             R.id.number2 -> {
                 addInput("2")
                 displayButtonText()
             }
             R.id.number3 -> {
                 addInput("3")
                 displayButtonText()
             }
             R.id.number4 -> {
                 addInput("4")
                 displayButtonText()
             }
             R.id.number5 -> {
                 addInput("5")
                 displayButtonText()
             }
             R.id.number6 -> {
                 addInput("6")
                 displayButtonText()
             }
             R.id.number7 -> {
                 addInput("7")
                 displayButtonText()
             }
             R.id.number8 -> {
                 addInput("8")
                 displayButtonText()
             } R.id.number9 -> {
             addInput("9")
             displayButtonText()
         }
             R.id.erase_button -> {
                 eraseCalculator()
             }
             R.id.additionButton ->{
                 addInput("+")
                 displayButtonText()
             }
             R.id.subtractionButton -> {
                 addInput("-")
                 displayButtonText()
             }
             R.id.multiplicationButton -> {
                 addInput("x")
                 displayButtonText()
             }
             R.id.divisionButton -> {
                 addInput("/")
                 displayButtonText()
             }
             R.id.equalsButton -> {}
         }
    }
}