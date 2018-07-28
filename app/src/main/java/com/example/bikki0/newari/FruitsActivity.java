package com.example.bikki0.newari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Cabbage", "Bandaa"));
        words.add(new Word("Mushroom", "Mhu-kaa-cha"));
        words.add(new Word("Potato", "aa-lu"));
        words.add(new Word("Spinach", "Paa-law"));
        words.add(new Word("Tomato", "Gol-bhe-raa"));
        words.add(new Word("Apple", "Syaa-u"));
        words.add(new Word("Banana", "Ke-raa"));
        words.add(new Word("Cucumber", "Tu-si"));
        words.add(new Word("Lime", "Kaa-ga-ti"));
        words.add(new Word("Orange", "San-tra-si"));
        words.add(new Word("Pomegranate", "Dhaa-le"));
        words.add(new Word("Raspberry", "i-si"));
        words.add(new Word("Lettuce", "Ji-saah"));
        words.add(new Word("Pepper grass", "Cha-suu"));
        words.add(new Word("Sweet potato", "Chaa-ku-hi"));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_fruits);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}