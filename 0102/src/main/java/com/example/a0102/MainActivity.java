package com.example.a0102;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOut;
    Button btnOk, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "найдем все View-элементы");
        tvOut = findViewById(R.id.tbOut);
        btnOk = findViewById(R.id.btnOK);
        btnCancel = findViewById(R.id.btnCancel);

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnOK)
            tvOut.setText("Нажата кнопка ОК");
        if (v.getId() == R.id.btnCancel)
        tvOut.setText("Нажата кнопка Cancel");
        }
}