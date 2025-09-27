package com.example.paymentapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.paymentapp.R;

public class BankLoginActivity extends AppCompatActivity {
    Button btnBank, btnWallet, btnStore, btnCash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_login); // <-- phải đúng tên file xml

        btnBank = findViewById(R.id.btnBank);
        btnWallet = findViewById(R.id.btnWallet);
        btnStore = findViewById(R.id.btnStore);
        btnCash = findViewById(R.id.btnCash);

        btnBank.setOnClickListener(v ->
                Toast.makeText(this, "Bank selected", Toast.LENGTH_SHORT).show());

        btnWallet.setOnClickListener(v ->
                Toast.makeText(this, "Wallet selected", Toast.LENGTH_SHORT).show());

        btnStore.setOnClickListener(v ->
                Toast.makeText(this, "Store selected", Toast.LENGTH_SHORT).show());

        btnCash.setOnClickListener(v ->
                Toast.makeText(this, "Cash selected", Toast.LENGTH_SHORT).show());
    }
}