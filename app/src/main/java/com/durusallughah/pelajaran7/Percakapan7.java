package com.durusallughah.pelajaran7;


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
public class Percakapan7 extends Fragment {

    public Percakapan7() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "لَفِّظْ سُؤَالًا لِكُلِّ جَوَابٍ فِيمَا يَأْتِي!", R.raw.ok));
        words.add(new Word("", "1 ) .......... ؟ دَرَّاجَتِي فِي الْبَيْتِ", R.raw.ok));
        words.add(new Word("", "2 ) .......... ؟ فِي جَيْبِكَ قَلَمُ حِبْرٍ", R.raw.ok));
        words.add(new Word("", "3 ) .......... ؟ نَعَمْ, لِي بُسْتَانٌ", R.raw.ok));
        words.add(new Word("", "4 ) .......... ؟ هُوَ لِلتِّلْمِيذِ", R.raw.ok));
        words.add(new Word("", "5 ) .......... ؟ نَعَمْ, لَهُ سُورٌ", R.raw.ok));
        words.add(new Word("", "6 ) .......... ؟ لَا, هُوَ تِلْمِيذٌ", R.raw.ok));
        words.add(new Word("", "7 ) .......... ؟ بَيْنَ السَّاحَةِ وَالْبُسْتَانِ سُوْرٌ", R.raw.ok));
        words.add(new Word("", "8 ) .......... ؟ صَاحِبُهُ فِي الْحُجْرَةِ", R.raw.ok));
        words.add(new Word("", "9 ) .......... ؟ لَا, بَلْ عَلَيْهَا قِرْطَاسٌ", R.raw.ok));
        words.add(new Word("", "10 ) .......... ؟ بِجَانِبِهِ بِئْرٌ وَ حَمَامٌ", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_phrases);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
