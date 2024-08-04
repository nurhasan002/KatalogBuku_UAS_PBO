package com.unsia.katalogbuku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.unsia.katalogbuku.cores.BaseActivity;

public class LoginActivity extends BaseActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loadLayout();
    }

    @Override
    protected void loadLayout() {
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.equals("nurhasan") && password.equals("nurhasan")) {
                    Log.d("LoginActivity", "Credentials are correct. Navigating to DashboardActivity.");
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    Toast.makeText(LoginActivity.this, "Selamat datang!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Maaf, Username dan Password yang anda masukan salah! mohon ulangi kembali", Toast.LENGTH_SHORT).show();
                    Log.d("LoginActivity", "Invalid credentials.");
                }
            }
        });
    }
}