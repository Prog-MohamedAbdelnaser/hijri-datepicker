package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.R
import com.github.msarhan.ummalqura.calendar.UmmalquraCalendar
import com.softartch_lib.hijridatepicker.date.hijri.HijriDatePickerDialog
import java.util.*

class MainActivity : AppCompatActivity(), HijriDatePickerDialog.OnDateSetListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val now = UmmalquraCalendar()
        val dpd = HijriDatePickerDialog.newInstance(
                this@MainActivity,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        )
        dpd.minDate = UmmalquraCalendar(1300, 0, 1)


        //Change the language to any of supported language
        //Change the language to any of supported language
        dpd.locale = Locale.getDefault()
        dpd.show(supportFragmentManager, "Datepickerdialog")
    }

    override fun onDateSet(view: HijriDatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {

    }
}