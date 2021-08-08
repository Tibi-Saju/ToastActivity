package com.example.toastactivity;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toastbtn, countbtn;
    TextView counttxt;
    private int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastbtn = findViewById(R.id.toast_btn);
        countbtn = findViewById(R.id.count_btn);
        counttxt = findViewById(R.id.count_txt);

        countbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counttxt.setText(Integer.toString(counter));
            }
        });

    }toastbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast toast=Toast.makeText(getApplicationContext(),"Hello Toast!",Toast.LENGTH_LONG);
            View view=toast.getView();
            TextView view1=(TextView)view.findViewById(android.R.id.message);
            view1.setTextColor(Color.WHITE);
            view.setBackgroundResource(R.color.black);
            toast.show();

        }
    });
}