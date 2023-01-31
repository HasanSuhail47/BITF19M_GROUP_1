package com.example.namaz_daily_log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShowActivity extends AppCompatActivity {
ListView lw;
DBHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        lw=findViewById(R.id.listview);
        db=new DBHandler(this);
        List<Namaz> namazlist=db.getallnamaz();
        List<String>nl=new ArrayList<String>();

        for(int i=0;i<namazlist.size();i++)
        {
            nl.add(namazlist.get(i).tostring());
        }

        ArrayAdapter<String> adp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nl);
        lw.setAdapter(adp);
    }
}