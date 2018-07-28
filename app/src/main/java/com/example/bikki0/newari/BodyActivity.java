package com.example.bikki0.newari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Body", "Mah"));
        words.add(new Word("Ear", "Nhaay-paa"));
        words.add(new Word("Elbow", "Chu-lyaa"));
        words.add(new Word("Eye", "mi-khaa"));
        words.add(new Word("Hand", "Lhaah"));
        words.add(new Word("Mouth", "Mhu-tu"));
        words.add(new Word("Head", "Chhyaa"));
        words.add(new Word("Nail", "Lu-si"));
        words.add(new Word("Neck", "Ka-ku"));
        words.add(new Word("Nose", "Njaay"));
        words.add(new Word("Shoulder", "Bwa-hah"));
        words.add(new Word("Stomach", "Pwaah"));
        words.add(new Word("Thigh", "Kham-paa"));
        words.add(new Word("Tounge", "Mea"));
        words.add(new Word("Tooth", "Waa"));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_body);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}