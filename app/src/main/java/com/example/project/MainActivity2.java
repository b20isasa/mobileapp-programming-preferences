package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button button2;
    EditText name;
    private SharedPreferences myPreferenceRef;
    Button knapp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences.Editor myPreferenceEditor = myPreferenceRef.edit();
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("==>", "Back button pressed");
                Intent intent = new Intent (MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        name = findViewById(R.id.name);
        knapp = findViewById(R.id.knapp);
        myPreferenceRef = getSharedPreferences("preferences", MODE_PRIVATE);
        knapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = myPreferenceRef.edit();
                editor.putString("name", name.getText().toString());
                editor.apply();
            }
        });
    }
}
