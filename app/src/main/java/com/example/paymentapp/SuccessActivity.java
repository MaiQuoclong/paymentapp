package com.example.paymentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        TextView tvSuccessMessage = findViewById(R.id.tvSuccessMessage);
        tvSuccessMessage.setText("✅ Transfer Completed Successfully!");

        Button btnViewHistory = findViewById(R.id.btnViewHistory);
        btnViewHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Nhảy sang màn hình 9 (HistoryActivity)
                Intent intent = new Intent(SuccessActivity.this, HistoryActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
