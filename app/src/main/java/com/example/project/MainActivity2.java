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

    Button knapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // myPreferenceEditor = myPreferenceRef.edit();
        TextView prefTextRef = findViewById(R.id.prefText);
        button2 = findViewById(R.id.button2);
        myPreferenceRef = getSharedPreferences("editView", MODE_PRIVATE);
        button2.setOnClickListener((v)-> {finish();} );

        editView = findViewById(R.id.editView);
        knapp = findViewById(R.id.knapp);
        myPreferenceRef = getPreferences(MODE_PRIVATE);


        knapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = myPreferenceRef.edit();
              //  String prefString = editView.getText().toString();
                editor.putString("editView", editView.getText().toString());
               // prefTextRef.setText(myPreferenceRef.getString("namn", "No preference found."));
                editor.apply();

            }
        });
    }
}
/*
@Override
            public void onClick(View view) {
                Log.d("==>", "Back button pressed");
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
button2.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity2.this, MainActivity.class));
        });

        TextView prefTextRef;
        TextView prefTextRef = new TextView(this);
        prefTextRef=(TextView)findViewById(R.id.prefText);

 */