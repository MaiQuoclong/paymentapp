package com.example.paymentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BankDashboardActivity extends AppCompatActivity {
    Button btnCheckBalance, btnTransferMoney, btnLogoutBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_dashboard);

        btnCheckBalance = findViewById(R.id.btnCheckBalance);
        btnTransferMoney = findViewById(R.id.btnTransferMoney);
        btnLogoutBank = findViewById(R.id.btnLogoutBank);

        // Check Balance → sang màn hình 9 (HistoryActivity)
        btnCheckBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankDashboardActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        // Transfer Money → sang màn hình 6
        btnTransferMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankDashboardActivity.this, TransferActivity.class);
                startActivity(intent);
            }
        });

        // Logout về màn hình trước
        btnLogoutBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
