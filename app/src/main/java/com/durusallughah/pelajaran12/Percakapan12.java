package com.durusallughah.pelajaran12;


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
public class Percakapan12 extends Fragment {

    public Percakapan12() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "اِقْرَأْ الْعَدَدَ الْآتِيَ بِمَا يُنَاسِبُ لِلْمَعْدُوْدِ!", R.raw.ok));
        words.add(new Word("", "1 ) 11 صَحْنًا", R.raw.ok));
        words.add(new Word("", "2 ) 12 صَحْنًا", R.raw.ok));
        words.add(new Word("", "3 ) 13 صَحْنًا", R.raw.ok));
        words.add(new Word("", "4 ) 14 صَحْنًا", R.raw.ok));
        words.add(new Word("", "5 ) 15 صَحْنًا", R.raw.ok));
        words.add(new Word("", "6 ) 16 صَحْنًا", R.raw.ok));
        words.add(new Word("", "7 ) 17 صَحْنًا", R.raw.ok));
        words.add(new Word("", "8 ) 18 صَحْنًا", R.raw.ok));
        words.add(new Word("", "9 ) 19 صَحْنًا", R.raw.ok));
        words.add(new Word("", "10 ) 20 صَحْنًا", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
