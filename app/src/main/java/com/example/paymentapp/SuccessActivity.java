package com.example.paymentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        TextView tvSuccessMessage = findViewById(R.id.tvSuccessMessage);
        tvSuccessMessage.setText("✅ Transfer Completed Successfully!");
    }
}
