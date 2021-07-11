package jp.techacademy.yokoyama.atsushi.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                if (hourOfDay >= 2 && minute >= 0) {
                    textView.setText("おはようございます");
                }; if (hourOfDay >= 10 && minute >= 0) {
                textView.setText("こんにちわ");
            }; if (hourOfDay >= 18 && minute >= 0) {
                textView.setText("こんばんは");
            }
            },
            13, 0, true)
        timePickerDialog.show()
    }
}

