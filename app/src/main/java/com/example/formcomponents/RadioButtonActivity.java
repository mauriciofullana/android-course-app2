package com.example.formcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3;
    Button btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        rb1 = findViewById(R.id.rb_1);
        rb2 = findViewById(R.id.rb_2);
        rb3 = findViewById(R.id.rb_3);
        btnAccept = findViewById(R.id.btn_accept);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1.isChecked()) {
                    Toast.makeText(RadioButtonActivity.this, rb1.getText(), Toast.LENGTH_SHORT).show();
                } else if (rb2.isChecked()) {
                    Toast.makeText(RadioButtonActivity.this, rb2.getText(), Toast.LENGTH_SHORT).show();
                } else if (rb3.isChecked()) {
                    Toast.makeText(RadioButtonActivity.this, rb3.getText(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RadioButtonActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}