package com.example.dynamiclv;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> Movies;
    ListView Movies_ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movies_ListView = (ListView)findViewById(R.id.List01);

        Movies = new ArrayList<String>();
        Movies.add("Sultan Farooq");
        Movies.add("Sherlock Holmes");
        Movies.add("The Green Mile");
        Movies.add("Shawshank Redemptions");
        Movies.add("500 days of Summer");
        Movies.add("Joker");

        ArrayAdapter<String> Movies_Array;
        Movies_Array = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, android.R.id.text2, Movies);
        Movies_ListView.setAdapter(Movies_Array);

        Movies_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = (String)Movies_ListView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, name + "" + "#" + position , Toast.LENGTH_SHORT).show();
            }
        });


    }
}