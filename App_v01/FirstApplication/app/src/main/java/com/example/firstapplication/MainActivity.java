package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;

    public void resetCount(View view){
         i = 0;
        String c =    i.toString();
        TextView count = (TextView) findViewById(R.id.textView2);
        count.setText(c);
    }

    public void countTasbeeh(View view){
       // Toast.makeText(this, "w", Toast.LENGTH_SHORT).show();
        i++;
        String c =    i.toString();
        TextView count = (TextView) findViewById(R.id.textView2);
        count.setText(c);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}