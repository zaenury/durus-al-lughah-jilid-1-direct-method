package com.durusallughah.pelajaran2;


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
public class Kalimat2 extends Fragment {

    public Kalimat2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "س : مَا هٰذِهِ؟" , R.drawable.maahaadzihi1, R.raw.ok));
        words.add(new Word("", "ج : هٰذِهِ طَلاَّسَةٌ" , R.drawable.haadzihitollasatun, R.raw.ok));
        words.add(new Word("", "ج : تِلْكَ طَلاَّسَةٌ" , R.drawable.tilkatollaasatun, R.raw.ok));
        words.add(new Word("", "س : أَهٰذِهِ كُرَّاسَةٌ؟" , R.drawable.ahaadzihikurroosatun, R.raw.ok));
        words.add(new Word("", "ج : نَعَمْ, هٰذِهِ كُرَّاسَةٌ" , R.drawable.naamhaadzihikurroosatun, R.raw.ok));
        words.add(new Word("", "ج : نَعَمْ, تِلْكَ كُرَّاسَةٌ" , R.drawable.naamtilkakurroosatun, R.raw.ok));
        words.add(new Word("", "ج : لَا, تِلْكَ مِسْطَرَةٌ" , R.drawable.laatilkamistorotun, R.raw.ok));

        // setting up the array adapter
        WordAdapter3 itemsAdapter= new WordAdapter3(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }


}
