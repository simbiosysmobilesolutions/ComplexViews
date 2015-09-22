package com.simbiosyscorp.tutorials.complexviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Function to start the TimePicker activity on Button Click
    public void toTimePicker(View view) {
        startActivity(new Intent(getApplicationContext(), TimePicker.class));
    }

    //Function to start the DatePicker activity on Button Click
    public void toDatePicker(View view) {
        startActivity(new Intent(getApplicationContext(), DatePicker.class));
    }
}
