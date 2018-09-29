package com.durusallughah.pelajaran4;


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
public class Kalimat4 extends Fragment {

    public Kalimat4() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "س : مَاذَاهُنَا؟",R.drawable.maadzaahunaa, R.raw.ok));
        words.add(new Word("", "ج : هُنَا مَدْرَسَةٌ",R.drawable.hunaamadrosatun, R.raw.ok));
        words.add(new Word("", "ج : هُنَاكَ مَدْرَسَةٌ",R.drawable.hunaakamadrosatun, R.raw.ok));
        words.add(new Word("", "س : أَيْنَ الْمَدْرَسَةُ؟",R.drawable.ainalmadrosatu, R.raw.ok));
        words.add(new Word("", "ج : الْمَدْرَسَةُ هُنَا",R.drawable.hunaamadrosatun, R.raw.ok));
        words.add(new Word("", "ج : الْمَدْرَسَةُ هُنَاكَ",R.drawable.hunaakamadrosatun, R.raw.ok));
        words.add(new Word("", "ج : هَلْ هُنَا مَدْرَسَةٌ؟",R.drawable.halhunaamadrosatun, R.raw.ok));
        words.add(new Word("", "ج : نَعَمْ, هُنَا مَدْرَسَةٌ",R.drawable.naamhunaamadrosatun, R.raw.ok));
        words.add(new Word("", "ج : نَعَمْ, هُنَاكَ مَدْرَسَةٌ",R.drawable.naamhunaakamadrosatun, R.raw.ok));
        words.add(new Word("", "ح : لَا, هُنَاكَ مَسْجِدٌ",R.drawable.laahunaakamasjidun, R.raw.ok));

        // setting up the array adapter
        WordAdapter3 itemsAdapter= new WordAdapter3(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
