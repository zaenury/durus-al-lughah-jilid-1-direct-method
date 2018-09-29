package com.durusallughah.pelajaran11;


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
public class Percakapan11 extends Fragment {

    public Percakapan11() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "بَدِّلْ كَلِمَةَ (أَحْمَدُ) فِي الْجُمَلِ الْآتِيَةِ بِكَلِمَةٍ وَاقْرَأْهَا!", R.raw.ok));
        words.add(new Word("", "أَحْمَدٌ طَالِبٌ نَشِيْطٌ فِي تَعَلُّمِهِ وَلَيْسَ غاَفِلًا عَنْ أَدَاءِ وَاجِبِهِ", R.raw.ok));
        words.add(new Word("", "1 ) مَرْيَمُ ....................", R.raw.ok));
        words.add(new Word("", "2 ) أَنَا ....................", R.raw.ok));
        words.add(new Word("", "3 ) أَنْتَ ....................", R.raw.ok));
        words.add(new Word("", "4 ) نَحْنُ ....................", R.raw.ok));
        words.add(new Word("", "5 ) أَنْتِ ....................", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
