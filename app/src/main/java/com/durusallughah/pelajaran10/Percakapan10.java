package com.durusallughah.pelajaran10;


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
public class Percakapan10 extends Fragment {

    public Percakapan10() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "اِقْرَأْ كُلَّ عَدَدٍ فِي الْجُمَلِ الْآتِيَةِ بِمَا يُنِاسِبُ الْمَعْدُوْدَ!", R.raw.ok));
        words.add(new Word("", "1 ) بِجَانِبِ الْمَطْبَخِ حَمَّامٌ 1 فِيْهِ 3 حَنَفِيَّاتٍ.", R.raw.ok));
        words.add(new Word("", "2 ) لِلسَّيَّارَةِ 4 عَجَلَاتٍ. وَ لِلْعَرَبَةِ عَجَلَتَانِ وَ 3 مَقَاعِدَ.", R.raw.ok));
        words.add(new Word("", "3 ) فِي قَرْيَتِيْ مَصْنَعٌ فِيْهِ 9 عُمَّالٍ وَ 3 خَادِمَاتٍ.", R.raw.ok));
        words.add(new Word("", "4 ) لِتِلْكَ السُّتْرَةِ كُمَّانِ 2 وَ 4 جُيُوْبٍ وَ 3 عُرًى.", R.raw.ok));
        words.add(new Word("", "5 ) فِي هٰذِهِ الْغُرْفَةِ مِنْضَدَةٌ 1 فِي دُرْجِهَا 9 رَسَائِلَ.", R.raw.ok));
        words.add(new Word("", "6 ) أَمَامَ الْمَدْرَسَةِ لَوْحَانِ 2 عَلَى كُلِّ لَوْحٍ 4 إِعْلَانَاتِ", R.raw.ok));
        words.add(new Word("", "7 ) لِأُمِّي خِزَانَتَانِ 2, وَلِكُلِّ خِزَانَةٍ 4 رِفَافٍ", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
