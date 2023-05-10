package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    Button button_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recyclerView);
        button_main = findViewById(R.id.button_main);

        button_main.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}


/* @Override
        public void OnClick(View view){
            startActivity(new Intent((MainActivity.this,MainActivity2.class));
        }*/