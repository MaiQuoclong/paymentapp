package com.example.paymentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmTransferActivity extends AppCompatActivity {

    TextView tvTransferDetails;
    Button btnConfirm, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_transfer);

        tvTransferDetails = findViewById(R.id.tvTransferDetails);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnCancel = findViewById(R.id.btnCancel);

        // Nhận dữ liệu từ màn hình 6
        Intent intent = getIntent();
        String receiver = intent.getStringExtra("receiver");
        String amount = intent.getStringExtra("amount");

        // Hiển thị chi tiết giao dịch
        tvTransferDetails.setText("Transfer $" + amount + "\nTo: " + receiver);



        // Cancel → quay lại màn 6
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
