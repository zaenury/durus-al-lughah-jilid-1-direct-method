package com.durusallughah.pelajaran3;


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
import com.durusallughah.WordAdapter3;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kalimat3 extends Fragment {

    public Kalimat3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "س : مَا هٰذَا؟",R.drawable.maahadzaa31, R.raw.ok));
        words.add(new Word("", "ج : هٰذَا مُثَلَّثٌ",R.drawable.haadzaamutsallatsun, R.raw.ok));
        words.add(new Word("", "ج : ذٰلِكَ مُثَلَّثٌ",R.drawable.dzaalikamutsallatsun, R.raw.ok));
        words.add(new Word("", "س : مَا تِلْكَ؟",R.drawable.maatilka, R.raw.ok));
        words.add(new Word("", "ج : تِلْكَ مِكْنَسَةٌ",R.drawable.tilkamiknasatun, R.raw.ok));
        words.add(new Word("", "ج : هٰذِهِ مِكْنَسَةٌ",R.drawable.haadzihimiknasatun, R.raw.ok));
        words.add(new Word("", "س : مَا هٰذِهِ؟",R.drawable.maahaadzihi31, R.raw.ok));
        words.add(new Word("", "ج : هٰذِهِ مِبْرَاةٌ",R.drawable.haadzihimibrootun, R.raw.ok));
        words.add(new Word("", "ج : تِلْكَ مِبْرَاةٌ",R.drawable.tilkamibrootun, R.raw.ok));
        words.add(new Word("", "س : مَا ذٰلك؟",R.drawable.maadzaalika, R.raw.ok));
        words.add(new Word("", "ج : ذٰلِكَ قَلَمُ حِبْرٍ",R.drawable.dzaalikakolamuhibrin, R.raw.ok));
        words.add(new Word("", "ج : هٰذَا قَلَمُ حِبْرٍ",R.drawable.haadzakolamuhibrin, R.raw.ok));
        words.add(new Word("", "س : مَا تِلْكَ؟",R.drawable.maatilka31, R.raw.ok));
        words.add(new Word("", "ج : تِلْكَ خَرِيْطَةٌ",R.drawable.tilkaqoriitotun, R.raw.ok));
        words.add(new Word("", "ج : هٰذِهِ خَرِيْطَةٌ",R.drawable.haadzihiqoriitotun, R.raw.ok));

        // setting up the array adapter
        WordAdapter3 itemsAdapter= new WordAdapter3(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
