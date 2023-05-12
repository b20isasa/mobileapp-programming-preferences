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
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;
    private RecyclerView recyclerView;
    private TextView textView;
    Button button_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myPreferenceRef = getSharedPreferences("MypreferencesRef", MODE_PRIVATE);
        textView = findViewById(R.id.textView);
        recyclerView = findViewById(R.id.recyclerView);
        button_main = findViewById(R.id.button_main);


        button_main.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        String name = myPreferenceRef.getString("preferences", "No preference found.");
        textView.setText(name);
    }
}


/*
 prefTextRef=(TextView)findViewById(R.id.prefText);
        prefTextRef.setText(myPreferenceRef.getString("namn", "No preference found."));
        //textView.setText(namn);
  myPreferenceRef = getPreferences(MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();
@Override
        public void OnClick(View view){
            startActivity(new Intent((MainActivity.this,MainActivity2.class));
        }*/