package com.example.a3101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myText;
    private CheckBox myCheckBox;
    private Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        myText = findViewById(R.id.tvMyText);
        myCheckBox = findViewById(R.id.cbMyCheckBox);
        myBtn = findViewById(R.id.btnMyButton);
        myText.setText("New text in TextView");
        myCheckBox.setChecked(true);
        myBtn.setEnabled(false);

    }
}