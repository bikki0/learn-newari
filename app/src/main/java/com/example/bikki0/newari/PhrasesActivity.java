package com.example.bikki0.newari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Yes/no.", "Maah/mwah."));
        words.add(new Word("Can I take a picture?", "Tas-bir kaa-ye jii laa?"));
        words.add(new Word("I feel unwell.", "Ji-tah mha-su-ku ma-du."));
        words.add(new Word("I have a cold.", "Ji-tah se-khaa chaah."));
        words.add(new Word("He has a fever.", "Wa-yaa jwar wah."));
        words.add(new Word("My friend’s leg is broken.", "Ji-mi paa-saa-yaa tu-ti twa-dhu-la."));
        words.add(new Word("It is difficult to breathe.", "Saa-sah ihaa-ye thaa-ku."));
        words.add(new Word("My finger is swollen.", "Ji-gu pa-tii ma-naa wa-la."));
        words.add(new Word("It burns", "Hi-yu"));
        words.add(new Word("It itches", "Cha-su"));
        words.add(new Word("It tickles", "Ku-vhu"));
        words.add(new Word("The sun is out.", "Ni-bhaah twa-la."));
        words.add(new Word("I cut my hand.", "Ji-gu lhaa-tay ghaah ju-la."));
        words.add(new Word("I feel dizzy.", "Ji-tah i-ki-se chwa-na."));
        words.add(new Word("I feel nauseous.", "Ji-tah lhwa-ye wa-yi thee ju-la."));
        words.add(new Word("My knee hurts.", "Ji-gu pu-li syaah."));
        words.add(new Word("Where does it hurt?", "Ga-na syaah?"));
        words.add(new Word("Don’t move.", "Sa-ne ma-jiu."));
        words.add(new Word("Don’t worry.", "Dhandaa ka-yaa di-I mwah."));
        words.add(new Word("You will be OK.", "Chhi-tah tik jui."));
        words.add(new Word("I can’t hear you.", "Taa-ye man-ta."));

        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
