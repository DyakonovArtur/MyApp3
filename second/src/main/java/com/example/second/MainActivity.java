package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName; // объявили переменную текстовую
    private EditText edName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.textView);
        edName = findViewById(R.id.edName);
    }

    public void onClick(View v) {
        if (edName.getText().length() == 0) {
            tvName.setText("Hello my Kitty!");
        } else {
            tvName.setText("Hello, " + edName.getText());
        }


    }
}