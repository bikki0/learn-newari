package com.example.bikki0.newari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "Chha", R.drawable.number_one));
        words.add(new Word("Two", "Ni", R.drawable.number_two));
        words.add(new Word("Three", "Swa", R.drawable.number_three));
        words.add(new Word("Four", "Pe", R.drawable.number_four));
        words.add(new Word("Five", "Nyaa", R.drawable.number_five));
        words.add(new Word("Six", "Khu", R.drawable.number_six));
        words.add(new Word("Seven", "Nhay", R.drawable.number_seven));
        words.add(new Word("Eight", "Chyaa", R.drawable.number_eight));
        words.add(new Word("Nine", "Gu", R.drawable.number_nine));
        words.add(new Word("Ten", "Jhi", R.drawable.number_ten));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
