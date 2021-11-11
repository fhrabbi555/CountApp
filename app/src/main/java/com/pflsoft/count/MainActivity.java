package com.pflsoft.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView result;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.resultid);


    }


    public void increment (View view){
        count++;
        result.setText(""+ count);
    }

    public void decrement (View view){

        if (count > 0)
        {
            count--;
            result.setText(""+ count);
            result.setTextColor(R.color.purple_200);


        }else {
            result.setText("Not Possible");
        }

    }


    public void reset(View view){
        count = 0;
        result.setText(""+count);
        Toast.makeText(getApplicationContext(), "Your Value Now 0!", Toast.LENGTH_LONG).show();
        result.setTextColor(R.color.black);
    }
}