package com.example.bikki0.newari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dusty Yellow", "Mhasu'n", R.drawable.color_dusty_yellow));
        words.add(new Word("Black", "Haku", R.drawable.color_black));
        words.add(new Word("White", "tuyu", R.drawable.color_white));
        words.add(new Word("Brown", "Siyugu", R.drawable.color_brown));
        words.add(new Word("Gray", "--", R.drawable.color_gray));
        words.add(new Word("Green", "Wau'n", R.drawable.color_green));
        words.add(new Word("Mustard Yellow", "Mhasu'n", R.drawable.color_mustard_yellow));
        words.add(new Word("Red", "Hyau'n", R.drawable.color_red));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
