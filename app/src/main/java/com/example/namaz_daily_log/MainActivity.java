package com.example.namaz_daily_log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button show_btn,add_btn;
CheckBox fajrcheck,fajrcheck2,dhurcheck,dhurcheck2,asarcheck,asarcheck2,maghribcheck,maghribcheck2,eshacheck,eshacheck2,tahajjudcheck;
EditText fajrrakat,dhurrakat,asarrakat,maghribrakat,esharakat,tahajjudrakat,Date;
DBHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DBHandler(this);

        show_btn = findViewById(R.id.show_btn);
        add_btn=findViewById(R.id.add_btn);

        fajrcheck=findViewById(R.id.fajarcheck);
        fajrcheck2=findViewById(R.id.fajarcheck2);
        fajrrakat=findViewById(R.id.fajarrakat);

        dhurcheck=findViewById(R.id.dhurcheck);
        dhurcheck2=findViewById(R.id.dhurcheck2);
        dhurrakat=findViewById(R.id.dhurrakat);

        asarcheck=findViewById(R.id.asarcheck);
        asarcheck2=findViewById(R.id.asarcheck2);
        asarrakat=findViewById(R.id.asarrakat);

        maghribcheck=findViewById(R.id.maghribcheck);
        maghribcheck2=findViewById(R.id.maghribcheck2);
        maghribrakat=findViewById(R.id.maghribrakat);

        eshacheck=findViewById(R.id.eshacheck);
        eshacheck2=findViewById(R.id.eshacheck2);
        esharakat=findViewById(R.id.esharakat);

        tahajjudcheck=findViewById(R.id.tahajjudcheck);
        tahajjudrakat=findViewById(R.id.tahajjudrakat);

        Date=findViewById(R.id.date_);

        int i=fajrcheck.isChecked()?1:0;

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Namaz n= new Namaz(fajrcheck.isChecked()?"1":"0",
                        fajrcheck2.isChecked()?"1":"0",
                        fajrrakat.getText().toString(),
                        dhurcheck.isChecked()?"1":"0",
                        dhurcheck2.isChecked()?"1":"0",
                        dhurrakat.getText().toString(),
                        asarcheck.isChecked()?"1":"0",
                        asarcheck2.isChecked()?"1":"0",
                        asarrakat.getText().toString(),
                        maghribcheck.isChecked()?"1":"0",
                        maghribcheck2.isChecked()?"1":"0",
                        maghribrakat.getText().toString(),
                        eshacheck.isChecked()?"1":"0",
                        eshacheck2.isChecked()?"1":"0",
                        esharakat.getText().toString(),
                        tahajjudcheck.isChecked()?"1":"0",
                        tahajjudrakat.getText().toString(),
                        Date.getText().toString());
                db.insertdata(n);
                Toast t=Toast.makeText(getApplicationContext(),"Added",Toast.LENGTH_SHORT);
                t.show();
            }
        });

        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ShowActivity.class);
                startActivity(intent);
            }
        });
    }

}