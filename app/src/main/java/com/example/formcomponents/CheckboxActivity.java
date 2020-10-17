package com.example.formcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    private CheckBox chOpt1, chOpt2, chOpt3, chMoreOpts, chMoreOpt1, chMoreOpt2, chMoreOpt3;
    private LinearLayout wrapper;
    private Button btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        chOpt1 = findViewById(R.id.ch_option1);
        chOpt2 = findViewById(R.id.ch_option2);
        chOpt3 = findViewById(R.id.ch_option3);

        chMoreOpt1 = findViewById(R.id.ch_more_option1);
        chMoreOpt2 = findViewById(R.id.ch_more_option2);
        chMoreOpt3 = findViewById(R.id.ch_more_option3);

        chMoreOpts = findViewById(R.id.ch_moreOptions);

        wrapper = findViewById(R.id.wrapper_moreOptions);

        btnAccept = findViewById(R.id.btn_accept);

        chMoreOpts.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wrapper.setVisibility(View.VISIBLE);
                } else {
                    wrapper.setVisibility(View.GONE);
                }
            }
        });

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if (chOpt1.isChecked()) {
                    stringBuilder.append("Option 1");
                }
                if (chOpt2.isChecked()) {
                    stringBuilder.append("\nOption 2");
                }
                if (chOpt3.isChecked()) {
                    stringBuilder.append("\nOption 3");
                }

                if (chMoreOpts.isChecked()) {
                    if (chMoreOpt1.isChecked()) {
                        stringBuilder.append("\nMore Option 1");
                    }
                    if (chMoreOpt2.isChecked()) {
                        stringBuilder.append("\nMore Option 2");
                    }
                    if (chMoreOpt3.isChecked()) {
                        stringBuilder.append("\nMore Option 3");
                    }
                }

                if (stringBuilder.length() != 0) {
                    Toast.makeText(CheckboxActivity.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckboxActivity.this, "Select an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}