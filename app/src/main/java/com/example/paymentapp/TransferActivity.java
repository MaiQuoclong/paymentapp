package com.example.paymentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TransferActivity extends AppCompatActivity {

    EditText edtReceiver, edtAmount;
    Button btnConfirmTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        edtReceiver = findViewById(R.id.edtReceiver);
        edtAmount = findViewById(R.id.edtAmount);
        btnConfirmTransfer = findViewById(R.id.btnConfirmTransfer);

        btnConfirmTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String receiver = edtReceiver.getText().toString().trim();
                String amount = edtAmount.getText().toString().trim();

                if (receiver.isEmpty() || amount.isEmpty()) {
                    Toast.makeText(TransferActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Gửi dữ liệu sang ConfirmTransferActivity
                    Intent intent = new Intent(TransferActivity.this, ConfirmTransferActivity.class);
                    intent.putExtra("receiver", receiver);
                    intent.putExtra("amount", amount);
                    startActivity(intent);
                }
            }
        });
    }
}
