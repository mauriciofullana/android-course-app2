package com.example.formcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTextView, btnEditText, btnRadioButton, btnToggle, btnSwitch, btnCheckbok, btnSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTextView = findViewById(R.id.btn_TextView);
        btnTextView.setOnClickListener(this);

        btnEditText = findViewById(R.id.btn_EditText);
        btnEditText.setOnClickListener(this);

        btnRadioButton = findViewById(R.id.btn_RadioButton);
        btnRadioButton.setOnClickListener(this);

        btnToggle = findViewById(R.id.btn_ToggleButton);
        btnToggle.setOnClickListener(this);

        btnSwitch = findViewById(R.id.btn_Switch);
        btnSwitch.setOnClickListener(this);

        btnCheckbok = findViewById(R.id.btn_Checkbox);
        btnCheckbok.setOnClickListener(this);

        btnSpinner = findViewById(R.id.btn_spinner);
        btnSpinner.setOnClickListener(this);
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
            case R.id.btn_RadioButton:
                startActivity(new Intent(MainActivity.this, RadioButtonActivity.class));
                break;
            case R.id.btn_ToggleButton:
                startActivity(new Intent(MainActivity.this, ToggleActivity.class));
                break;
            case R.id.btn_Switch:
                startActivity(new Intent(MainActivity.this, SwitchActivity.class));
                break;
            case R.id.btn_Checkbox:
                startActivity(new Intent(MainActivity.this, CheckboxActivity.class));
                break;
            case R.id.btn_spinner:
                startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
                break;
        }
    }
}