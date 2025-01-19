package com.example.mentalhealth;

import static com.example.mentalhealth.R.id.btnstart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //hun bt3rfe el editText w buttons..
private Button start;
    SQLiteDatabase myDb;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(btnstart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MentalHealthCare.class);
                startActivity(i);
            }
        });
        //create a new database named productsDB
        //myDb hye object mn class SQLdatabase
        //myDb = openOrCreateDatabase("productsDb", MODE_PRIVATE, null);
        //myDb.execSQL("CREATE TABLE IF NOT EXISTS products(id VARCHAR, name VARCHAR," +
          //      " price Varchar, quantity VARCHAR)");
    }
}