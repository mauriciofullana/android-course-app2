package com.example.formcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTextView, btnEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTextView = findViewById(R.id.btn_TextView);
        btnTextView.setOnClickListener(this);

        btnEditText = findViewById(R.id.btn_EditText);
        btnEditText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_TextView:
                startActivity(new Intent(MainActivity.this, TextViewActivity.class));
                break;
            case R.id.btn_EditText:
                startActivity(new Intent(MainActivity.this, EditTextActivity.class));
                break;
        }
    }
}