package com.example.uczniowie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Uczen> uczniowie = new ArrayList<>();
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.obListview);
        uczniowie.add(new Uczen("Jaś","Nowak"));
        uczniowie.add(new Uczen("Basia","Ruda"));
        uczniowie.add(new Uczen("Kasia","Buda"));
        uczniowie.add(new Uczen("Staś","Buda"));


    }
}