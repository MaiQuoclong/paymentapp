package com.example.paymentapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {
    EditText edtName, edtEmail, edtPassword;
    Button btnRegisterConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnRegisterConfirm = findViewById(R.id.btnRegisterConfirm);

        btnRegisterConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String email = edtEmail.getText().toString();
                String pass = edtPassword.getText().toString();

                if (name.isEmpty() || email.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(CreateAccountActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CreateAccountActivity.this, "Register successfully", Toast.LENGTH_SHORT).show();
                    finish(); // Quay về MainActivity
                }
            }
        });
    }
}