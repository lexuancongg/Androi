package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loggin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView signup= findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogginActivity.this, RegisterEntity.class));
            }
        });
        TextView loggin = findViewById(R.id.buttonLoggin);
        EditText input_username = findViewById(R.id.inputUsername);
        EditText input_password = findViewById(R.id.inputPassword);

        loggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ip_userName = input_username.getText().toString().trim();
                String ip_pass = input_password.getText().toString().trim();
                if(!ip_userName.isEmpty() && !ip_pass.isEmpty()){
                    Toast.makeText(LogginActivity.this,"Xin chao ban "+ip_userName,Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(LogginActivity.this,"Ban chua nhap thong tin ",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}