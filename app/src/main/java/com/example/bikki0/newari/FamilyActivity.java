package com.example.bikki0.newari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Grand Father", "Baa-jyaa", R.drawable.family_grandfather));
        words.add(new Word("Grand Mother", "a-ji", R.drawable.family_grandmother));
        words.add(new Word("Father", "Baa", R.drawable.family_father));
        words.add(new Word("Mother", "Maa", R.drawable.family_mother));
        words.add(new Word("Older Sister", "Ta-taa", R.drawable.family_older_sister));
        words.add(new Word("Older Brother", "Daa-i", R.drawable.family_older_brother));
        words.add(new Word("Younger Brother", "Ki-jaa", R.drawable.family_younger_brother));
        words.add(new Word("Younger Sister", "Ke-henn", R.drawable.family_younger_sister));
        words.add(new Word("Daughter", "Mayāhaḥ", R.drawable.family_daughter));
        words.add(new Word("Son", "Kāyaḥ", R.drawable.family_son));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
