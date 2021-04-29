package com.example.getyoutour
import android.app.DatePickerDialog


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_main.*

import java.util.*

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener  {
    var year=0
    var month=0
    var day=0
    var savedDay=0
    var savedMonth=0
    var savedYear= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickDate()


    }
private fun getDateCalendar(){
    val cal :Calendar= Calendar.getInstance()
   year = cal.get(Calendar.YEAR)
     month=cal.get(Calendar.MONTH)
    day = cal.get(Calendar.DAY_OF_MONTH)
}
private fun pickDate(){

    button.setOnClickListener{
        getDateCalendar()
        DatePickerDialog(this, this, year, month, day).show()
    }
}
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        savedDay = dayOfMonth
        savedMonth = month
        savedYear = year

        textDate.text="$savedDay-$savedMonth-$savedYear"
    }
}