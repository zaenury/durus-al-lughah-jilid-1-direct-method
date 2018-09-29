package com.durusallughah.pelajaran6;


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
public class Percakapan6 extends Fragment {

    public Percakapan6() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "اِمْلَإِ الْفَرَاغَ بِكَلِمَةٍ مُنَاسَبَةٍ بِاللَّفْظِ!", R.raw.ok));
        words.add(new Word("", "1) .......... دَرَّاجَةٌ .......... فِي الْبَيْتِ.", R.raw.ok));
        words.add(new Word("", "2) هٰذِهِ   الْمِبْرَاةُ .......... وَ تِلْكَ الْمَحْفَظَةُ .......... عَائِشَةَ.", R.raw.ok));
        words.add(new Word("", "3) هَلْ .......... بِئْرٌ أَمَامَ الْبَيْتِ يَا أَحْمَدُ؟", R.raw.ok));
        words.add(new Word("", "4( فِي الْحُجْرَةِ أُمٌّ, هَلْ هٰذِهِ   الْخِزَانَةُ .......... ؟", R.raw.ok));
        words.add(new Word("", "5 ذٰلِكَ الرَّجُلُ خَادِمٌ, هَلْ .......... مِبْرَاةٌ فِي الْجَيْبِ؟", R.raw.ok));
        words.add(new Word("", "6) .......... هٰذِهِ   الْحُجْرَةُ بَابٌ .......... قُفْلٌ وَ نَافِذَةٌ .......... فَاكُوْرَةٌ.", R.raw.ok));
        words.add(new Word("", "7) يَا مَرْيَمُ, أَذٰلِكَ الْكُوْبُ .......... ؟", R.raw.ok));
        words.add(new Word("", "8) أَنَا تِلْمِيْذٌ .......... مِنْقَلَةٌ فِي .......... , وَذٰلِكَ الْفِرْجَارُ .......... أَحْمَدَ.", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
