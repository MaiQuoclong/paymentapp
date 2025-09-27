package com.example.paymentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BankLoginScreenActivity extends AppCompatActivity {
    EditText edtBankUsername, edtBankPassword;
    Button btnBankLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_login_screen);

        edtBankUsername = findViewById(R.id.edtBankUsername);
        edtBankPassword = findViewById(R.id.edtBankPassword);
        btnBankLogin = findViewById(R.id.btnBankLogin);

        btnBankLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtBankUsername.getText().toString().trim();
                String password = edtBankPassword.getText().toString().trim();

                if (username.equals("MaiQuocLong") && password.equals("123456")) {
                    Intent intent = new Intent(BankLoginScreenActivity.this, BankDashboardActivity.class);
                    intent.putExtra("bankUsername", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(BankLoginScreenActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
