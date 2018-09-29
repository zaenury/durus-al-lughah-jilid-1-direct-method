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
import com.durusallughah.WordAdapter5;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kalimat7 extends Fragment {

    public Kalimat7() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "لِي مَنْزِلٌ", R.drawable.liy, R.raw.ok));
        words.add(new Word("", "مَنْزِلِي فِي الْقَرْيَةِ", R.drawable.manziliiy, R.raw.ok));
        words.add(new Word("", "فِي مَنْزِلِي مِصْبَاحٌ كَهْرُبَائِيٌّ", R.drawable.manziliiy, R.raw.ok));
        words.add(new Word("", "يَا مُحَمَّدٌ هَلْ لَكَ مِصْبَاحٌ؟", R.drawable.laka, R.raw.ok));
        words.add(new Word("", "أَيْنَ مِصْبَاحُكَ؟", R.drawable.misbaahuka, R.raw.ok));
        words.add(new Word("", "أَهٰذَا مِصْبَاحُكَ؟", R.drawable.misbaahuka, R.raw.ok));
        words.add(new Word("", "هَلْ فِي مِصْبَاحِكَ زَيْتٌ؟", R.drawable.misbaahika, R.raw.ok));
        words.add(new Word("", "لَكِ كِتَابٌ وَ كُرَّاسَةٌ عَلَى مَكْتَبِكِ", R.drawable.laaki, R.raw.ok));
        words.add(new Word("", "أَذٰلِكَ قَلَمُكِ؟", R.drawable.kolamuki, R.raw.ok));
        words.add(new Word("", "هَلْ فِي مَحْفَظَتِكِ مِبْرَاةٌ؟", R.drawable.mahfadhotiki, R.raw.ok));
        words.add(new Word("", "حَلِيْمَةٌ خَادِمَةٌ فِي مَنْزِلِي", R.drawable.manziliiy, R.raw.ok));
        words.add(new Word("", "لَهَا مِنَشَّةٌ عَلَى الْحَائِطِ", R.drawable.lahaa, R.raw.ok));
        words.add(new Word("", "غُرْفَتُهَا بِجَانِبِ الْمَطْبَخ", R.drawable.gurfatuhaa, R.raw.ok));
        words.add(new Word("", "لَهَا سَرِيْرٌ وَصُنْدُوْقٌ فِي غُرْفَتِهَا", R.drawable.lahaagurfatihaa, R.raw.ok));
        words.add(new Word("", "هَلْ عَلَى الْحَائِطِ مِسْمَارٌ؟", R.drawable.alalhaaitimismaarun, R.raw.ok));
        words.add(new Word("", "نَعَمْ, عَلَيْهِ مِسْمَارٌ", R.drawable.alaihi, R.raw.ok));
        words.add(new Word("", "هَلِ التَّقْوِيْمُ مُعَلَقٌ عَلَى الْمِسْمَارِ؟", R.drawable.takwimmuallakalalmismar, R.raw.ok));
        words.add(new Word("", "نَعَمْ هُوَ مُعَلَّقٌ عَلَيْهِ", R.drawable.alaihi, R.raw.ok));

        // setting up the array adapter
        WordAdapter5 itemsAdapter= new WordAdapter5(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
