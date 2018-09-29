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
import com.durusallughah.WordAdapter1;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Keterangan2 extends Fragment {


    public Keterangan2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Mu'annats (The feminine)", "الْمُؤَنَّثُ", R.raw.ok));
        words.add(new Word("users are able to use the mu'annats noun(The feminine)", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِيْ اسْتِعْمَالِ الْأَسْمَاءِ الْمُؤَنَّثَةِ", R.raw.ok));
        words.add(new Word("users are able to use the appropriate pointing words for mu'annats nouns ( هٰذِهِ / تِلْكَ )", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِيْ اسْتِعْمَالِ الضَّمَائِرِ الْمُنَاسِبَةِ لِلْمُؤَنَّثِ ( هٰذِهِ / تِلْكَ )", R.raw.ok));
        words.add(new Word("users are able to answer questions about mu'annats nouns", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِيْ الْإِجَابَةِ عَنِ الْأَسْئِلَةِ حَوْلَ الْمُؤَنَّثِ", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_numbers);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
