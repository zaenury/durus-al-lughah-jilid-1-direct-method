package com.durusallughah.pelajaran9;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.durusallughah.R;
import com.durusallughah.Word;
import com.durusallughah.WordAdapter1;
import com.durusallughah.WordAdapter4;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Percakapan9 extends Fragment {

    public Percakapan9() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "بَدِّلْ كُلَّ رَقْمٍ فِيْمَا يَأْتِي بِكَلِمَةٍ تَدُلُّ عَلَى الْعَدَدَ بِاللَّفْظِ!", R.raw.ok));
        words.add(new Word("", "1 ) فِي الْمَنْزِلِ كُرَّاسَةٌ 1 عَلَيْهَا مِمْحَتَانِ 2", R.raw.ok));
        words.add(new Word("", "2 ) لِيْ 6 مَجَلَّاتٍ وَلِصَاحِبِيْ 9 مَجَلَّاتٍ", R.raw.ok));
        words.add(new Word("", "3 ) كَمْ شَجَرَتًا بِجَانِبِ الشَّارِعِ؟ هُنَاكَ 10 شَجَرَاتٍ", R.raw.ok));
        words.add(new Word("", "4 ) فِي الْيَوْمِ وَاللَّيْلَةِ 5 صَلَوَاتٍ", R.raw.ok));
        words.add(new Word("", "5 ) صَلَاةُ الْعِشَاءِ 4 رَكَعَاتٍ وَصَلَاةُ الصُّبْحِ رَكْعَتَانِ 2", R.raw.ok));
        words.add(new Word("", "6 ) سُوْرَةُ الْفَاتِحَةِ 7 آيَاتٍ", R.raw.ok));
        words.add(new Word("", "7 ) عُمْرُ أَخِي الصَّغِيْرِ 3 سَنَوَاتٍ وَ 8 أَشْهُرٍ", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
