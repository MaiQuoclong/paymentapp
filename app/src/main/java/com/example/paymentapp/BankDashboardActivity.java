package com.example.paymentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BankDashboardActivity extends AppCompatActivity {
    TextView tvWelcomeBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_dashboard);

        tvWelcomeBank = findViewById(R.id.tvWelcomeBank);

        // Nhận dữ liệu username từ màn hình 4
        String username = getIntent().getStringExtra("bankUsername");
        tvWelcomeBank.setText("Welcome, " + username + "!");
    }
}
