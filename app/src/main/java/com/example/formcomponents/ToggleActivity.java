package com.example.formcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        final ImageView iv = findViewById(R.id.iv_bulb);
        final ToggleButton tb = findViewById(R.id.toggle_bulb);
        final LinearLayout linearLayout = findViewById(R.id.wrapper);

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (tb.isChecked()) {
                    linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    iv.setImageResource(R.drawable.icon_bulb_on);
                } else  {
                    linearLayout.setBackgroundColor(Color.parseColor("#333333"));
                    iv.setImageResource(R.drawable.icon_bulb_off);
                }
            }
        });
    }
}