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
import com.durusallughah.WordAdapter4;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Percakapan2 extends Fragment {

    public Percakapan2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "لَفِّظْ جَوَابًا لِكُلِّ سُؤَالٍ فِيْمَا يَأْتِيْ !", R.raw.ok));
        words.add(new Word("س : أَ هٰذِهِ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.sabbuurotun, R.raw.ok));
        words.add(new Word("س : أَ تِلْكَ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.tollaasatun, R.raw.ok));
        words.add(new Word("س : أَ هٰذِهِ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.mistorotun, R.raw.ok));
        words.add(new Word("س : أَ تِلْكَ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.minassatun, R.raw.ok));
        words.add(new Word("س : أَ هٰذِهِ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.kurroosatun, R.raw.ok));
        words.add(new Word("س : أَ تِلْكَ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.mimhaatun, R.raw.ok));
        words.add(new Word("س : أَ هٰذِهِ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.naafidzatun, R.raw.ok));
        words.add(new Word("س : أَ تِلْكَ .......؟    ج : .......", "س : مَا هٰذِهِ؟    ج : .......", R.drawable.miknasatun, R.raw.ok));
        // setting up the array adapter
        WordAdapter4 itemsAdapter= new WordAdapter4(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
