package com.example.formcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        TextView txt1 = findViewById(R.id.txt_1);

        txt1.setText("Mauricio");
        txt1.setBackgroundColor(Color.BLUE);
        txt1.setTextColor(Color.BLACK);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TextViewActivity.this, "Testing!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}