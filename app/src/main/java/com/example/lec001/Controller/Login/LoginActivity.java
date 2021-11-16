package com.example.lec001.Controller.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lec001.Controller.Dashboard;
import com.example.lec001.R;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Mapping Variable:

        login = findViewById(R.id.Login);
        email = (EditText) findViewById(R.id.Email);
        pass = (EditText) findViewById(R.id.Password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = "admin";
                String Password = "admin";

                if(
                        email.getText().toString().toLowerCase().trim().equals(UserName)
                        &&
                        pass.getText().toString().toLowerCase().trim().equals(Password)
                ){
                    Intent i;
                    i = new Intent(LoginActivity.this, Dashboard.class);
                    startActivity(i);
                    Toast.makeText(LoginActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

    }
}