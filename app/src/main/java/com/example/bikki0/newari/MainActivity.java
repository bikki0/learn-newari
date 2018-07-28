package com.example.bikki0.newari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);

            }
        });

        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);

            }
        });
        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);

            }
        });

        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);

            }
        });

        TextView bodyparts = (TextView)findViewById(R.id.body);
        bodyparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bodyIntent = new Intent(MainActivity.this, BodyActivity.class);
                startActivity(bodyIntent);

            }
        });

        TextView fruits = (TextView)findViewById(R.id.fruits);
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fruitsIntent = new Intent(MainActivity.this, FruitsActivity.class);
                startActivity(fruitsIntent);
            }
        });

    }

}
