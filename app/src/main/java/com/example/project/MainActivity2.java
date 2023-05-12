package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button button2;
    EditText name;
    private SharedPreferences myPreferenceRef;

    Button knapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // myPreferenceEditor = myPreferenceRef.edit();
       //TextView prefTextRef = findViewById(R.id.prefText);
        name = findViewById(R.id.editView);
        myPreferenceRef = getSharedPreferences("MypreferencesRef", MODE_PRIVATE);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener((v)-> {finish();} );
        //myPreferenceRef = getPreferences(MODE_PRIVATE);

        knapp = findViewById(R.id.knapp);
        knapp.setOnClickListener((v)->  {
                SharedPreferences.Editor editor = myPreferenceRef.edit();
              //  String prefString = editView.getText().toString();
                editor.putString("name", name.getText().toString());
               // prefTextRef.setText(myPreferenceRef.getString("name", "No preference found."));
                editor.apply();
        });
    }
}
