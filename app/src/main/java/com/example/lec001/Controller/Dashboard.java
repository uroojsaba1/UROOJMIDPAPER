package com.example.lec001.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lec001.Controller.Login.LoginActivity;
import com.example.lec001.R;

public class Dashboard extends AppCompatActivity {

    //int a; // class level variable // instance variable

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    // Mapping
    /*
        in Android Mapping:
        Connection between UI XML (Front END) with JAVA (Backend)
     */
    btn = findViewById(R.id.ShowMsg);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(Dashboard.this, "Logout", Toast.LENGTH_SHORT).show();
            Intent i;
            i = new Intent(Dashboard.this, LoginActivity.class);
            startActivity(i);
            finish();
        }
    });


    }
}