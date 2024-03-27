package com.example.a02021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myBtn;
    TextView myTextView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn = findViewById(R.id.button);
        myTextView = findViewById(R.id.tvCount);
        count = 0;
        myBtn.setOnClickListener(oclBtn);
    }

    View.OnClickListener oclBtn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            count++;
            myTextView.setText(Integer.toString(count));
        }
    };
}