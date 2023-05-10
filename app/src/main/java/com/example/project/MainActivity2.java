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
    EditText editView;
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;
    Button knapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editView = findViewById(R.id.editView);
        TextView prefTextRef = findViewById(R.id.prefText);
        button2 = findViewById(R.id.button2);
        myPreferenceRef = getPreferences(MODE_PRIVATE);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Back button pressed");
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }


        });

        knapp = findViewById(R.id.knapp);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TextView prefTextRef;
                String prefString = editView.getText().toString();
                myPreferenceEditor.putString("save", prefString);
                myPreferenceEditor.apply();
                finish();
            }
        });
    }
}
/*
button2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity2.this, MainActivity.class));
        });

        TextView prefTextRef;
        TextView prefTextRef = new TextView(this);
        prefTextRef=(TextView)findViewById(R.id.prefText);

 */