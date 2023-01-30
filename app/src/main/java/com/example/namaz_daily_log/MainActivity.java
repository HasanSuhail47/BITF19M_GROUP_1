package com.example.namaz_daily_log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button show_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_btn = findViewById(R.id.show_btn);

        findViewById(R.id.add_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity_intent = new Intent(MainActivity.this,ShowActivity.class);
                startActivity((activity_intent));
            }
        });
        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity_intent = new Intent(MainActivity.this,ShowActivity.class);
                startActivity((activity_intent));
            }
        });
    }

}