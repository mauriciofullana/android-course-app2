package com.example.formcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        EditText editText = findViewById(R.id.edt1);

        editText.setText("EditText 1");

        TextInputEditText textInputEditText = findViewById(R.id.edt_name);
        textInputEditText.setText("Preloaded text");

        Toast.makeText(this, textInputEditText.getText(), Toast.LENGTH_SHORT).show();
    }
}