package com.simbiosyscorp.tutorials.complexviews;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DatePicker extends Activity {
    DatePickerDialog datePickerDialog;
    Calendar defaultDate, datePicked;
    TextView mainTextView, textLabel;
    SimpleDateFormat dateFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        mainTextView = (TextView) findViewById(R.id.textView);
        textLabel = (TextView) findViewById(R.id.textView2);

        //SimpleDateFormat formats the date object to given format
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        defaultDate = Calendar.getInstance();
        datePicked = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                //Getting the new Date selected
                datePicked.set(year, monthOfYear, dayOfMonth);
                //Making labels visible
                textLabel.setVisibility(View.VISIBLE);
                mainTextView.setVisibility(View.VISIBLE);
                //Setting the new Date in the TextView
                mainTextView.setText(dateFormatter.format(datePicked.getTime()));
            }
        }, defaultDate.YEAR, defaultDate.MONTH, defaultDate.DAY_OF_MONTH);
    }

    public void getDate(View view) {
        datePickerDialog.show();
    }
}
