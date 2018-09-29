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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Keterangan12 extends Fragment {

    public Keterangan12() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Number for mudzakkar", "الْعَدَدُ الْمُذَكَّرُ ( 11 – 20)", R.raw.ok));
        words.add(new Word("Users are able to use mudzakkar calculations (11 - 20) in sentences", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِيْ ذِكْرِ الْعَدَدِ مِنْ 11 – 20 لِلْمُذَكَّرِ", R.raw.ok));
        words.add(new Word("Users are able to answer the question (ليس) in this chapter", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِي الْإِجَابَةِ عَنِ الْأَسْئِلَةِ", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_numbers);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
