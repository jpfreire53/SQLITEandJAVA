package com.example.javaesqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {


    EditText title, author, pages;
    Button add_button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        title = findViewById(R.id.editTextText);
        author = findViewById(R.id.editTextText2);
        pages = findViewById(R.id.editTextNumber);
        add_button = findViewById(R.id.button);


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(title.getText().toString().trim(), author.getText().toString().trim(), Integer.valueOf(pages.getText().toString().trim()));
            }
        });



    }
}