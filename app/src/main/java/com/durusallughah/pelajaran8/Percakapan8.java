package com.durusallughah.pelajaran8;


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
public class Percakapan8 extends Fragment {

    public Percakapan8() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "بَدِّلْ كُلَّ رَقْمٍ فِيْمَا يَأْتِي بِكَلِمَةٍ تَدُلُّ عَلَى الْعَدَدَ بِاللَّفْظِ!", R.raw.ok));
        words.add(new Word("", "1 ) عَلَى الْمَقْعَدِ 4 أَوْلَادٍ", R.raw.ok));
        words.add(new Word("", "2 ) لِلتِّلْمِيْذِ مُثَلَّثَانِ 2", R.raw.ok));
        words.add(new Word("", "3 ) فِي الْمَطْبَخِ 9 أَكْوَابٍ", R.raw.ok));
        words.add(new Word("", "4 ) بَيْنَ الْمَدْرَسَةِ وَالْمَنْزِلِ 7 أَشْجَارٍ", R.raw.ok));
        words.add(new Word("", "5 ) فِي الْمَدِيْنَةِ مَيْدَانٌ 1", R.raw.ok));
        words.add(new Word("", "6 ) لِلْقَمِيْصِ 5 أَزْرَارٍ", R.raw.ok));
        words.add(new Word("", "7 ) هُنَاكَ 3 أَنْهَارٍ", R.raw.ok));
        words.add(new Word("", "8 ) فِي هٰذِهِ الْغُرْفَةِ  10 أَشْخَاصٍ", R.raw.ok));
        words.add(new Word("", "9 ) لِهٰذِهِ الْمَدْرَسَةِ 8 أَبْوَابٍ", R.raw.ok));
        words.add(new Word("", "10 ) فِي الزَّرِيْبَةِ 6 أَحْمَالٍ وَ نَعْجَتَانِ", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
