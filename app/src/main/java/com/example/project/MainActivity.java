package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;
    private RecyclerView recyclerView;
    private TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.textView);
        myPreferenceRef = getSharedPreferences("preferences", MODE_PRIVATE);
        recyclerView = findViewById(R.id.recyclerView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("==>", "tillbaka");
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        String name = myPreferenceRef.getString("preferences", "No preference found.");
        textView.setText(name);
    }
}


