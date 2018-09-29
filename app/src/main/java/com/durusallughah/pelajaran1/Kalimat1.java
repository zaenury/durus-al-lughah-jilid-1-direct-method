package com.durusallughah.pelajaran1;


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
public class Kalimat1 extends Fragment {

    public Kalimat1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "س : مَاهٰذَا؟", R.drawable.maahadzaa1, R.raw.ok));
        words.add(new Word("", "ج : هٰذَا كِتَابٌ", R.drawable.hadzaakitaabun,  R.raw.ok));
        words.add(new Word("", "ج : ذٰلِكَ كِتَابٌ", R.drawable.dzaalikakitaabun, R.raw.ok));
        words.add(new Word("", "س : أَهٰذَا  مَكْتَبٌ؟", R.drawable.ahadzaamaktabun, R.raw.ok));
        words.add(new Word("", "ج : نَعَمْ, هٰذَا مَكْتَبٌ", R.drawable.naamhadzaamaktabun, R.raw.ok));
        words.add(new Word("", "ج : نَعَمْ, ذٰلِكَ مَكْتَبٌ", R.drawable.naamdzaalikamaktabun, R.raw.ok));
        words.add(new Word("", "ج : لَا, ذٰلِكَ قَلَمُ رَصَاصٍ", R.drawable.laadzaalikakolamurosoosin, R.raw.ok));

        // setting up the array adapter
        WordAdapter3 itemsAdapter= new WordAdapter3(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
