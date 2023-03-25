package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var mWeigthEditText: EditText
    private lateinit var mHeigthEditText: EditText
    private lateinit var mBMITextView: TextView
    private lateinit var mClasificationTextView: TextView
    private lateinit var mDesciptionTextView: TextView
    private lateinit var mCalculateButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        mBMITextView.text="";
        mDesciptionTextView.text="";
        mClasificationTextView.text="";

        val height = mHeigthEditText.text.toString()
        val weight = mWeigthEditText.text.toString()

        fun BMICalculator() {

            val BMI = weight.toFloat()/(height.toFloat()*2)


        }

    }

    fun bind() {
        mCalculateButton = findViewById(R.id.calculate_button)
        mHeigthEditText = findViewById(R.id.editTextHeight)
        mWeigthEditText = findViewById(R.id.editTextWeight)
        mClasificationTextView = findViewById(R.id.weight_clasification)
        mDesciptionTextView = findViewById(R.id.weight_description)
        mBMITextView = findViewById(R.id.bmi_show)
    }
}