package com.durusallughah.pelajaran5;


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
public class Percakapan5 extends Fragment {

    public Percakapan5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "لَفِّظْ جَوَابًا لِكُلِّ سُؤَالٍ فِيْمَا يَأْتِيْ !", R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ الْكُرَّاسَةُ؟", R.drawable.alkurroosatualalmaktabi, R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ الْمَكْتَبُ وَالْكُرْسِيُّ؟",R.drawable.almaktabuwalkursiyyualalardi, R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ السَّقْفُ؟",R.drawable.assakfufaukolmaktabi, R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ الْمَكْتَبُ؟",R.drawable.almaktabutahtassakfi, R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ الْأَرْضُ؟",R.drawable.alardutahtassakfi, R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ الْأُسْتَاذُ؟",R.drawable.alustaadzuamaamattilmiidzi, R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ التِّلْمِيْذُ؟",R.drawable.attilmiidzuamaamalustaadzi, R.raw.ok));
        words.add(new Word("ج : ..........", "س : أَيْنَ السَّبُّوْرَةُ؟",R.drawable.assabburotuwarooalustaadzi, R.raw.ok));

        // setting up the array adapter
        WordAdapter4 itemsAdapter= new WordAdapter4(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
