package com.durusallughah.pelajaran9;


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
public class Kalimat9 extends Fragment {

    public Kalimat9() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "طَلَّاسَةٌ (1), طَلَّاسَتَانِ (2), طَلَّاسَاتٌ (3-10)", R.drawable.tollasatunn, R.raw.ok));
        words.add(new Word("", "طَلَّاسَةٌ وَاحِدَةٌ", R.drawable.tollaasatunwaahidatun, R.raw.ok));
        words.add(new Word("", "طَلَّاسَتَانِ اثْنَتَانِ", R.drawable.tollaasataanisnataani, R.raw.ok));
        words.add(new Word("", "ثَلَاثُ طَلَّاسَاتٍ", R.drawable.tsalaatsutollatsaatin, R.raw.ok));
        words.add(new Word("", "أَرْبَعُ طَلَّاسَاتٍ", R.drawable.arbautollatsaatin, R.raw.ok));
        words.add(new Word("", "خَمْسُ طَلَّاسَاتٍ", R.drawable.qomsutollaatsaatin, R.raw.ok));
        words.add(new Word("", "سِتُّ طَلَّاسَاتٍ", R.drawable.sittutollaatsaatin, R.raw.ok));
        words.add(new Word("", "سَبْعُ طَلَّاسَاتٍ", R.drawable.sabutollaatsaatin, R.raw.ok));
        words.add(new Word("", "ثَمَانِيْ طَلَّاسَاتٍ", R.drawable.tsamaaniytollaatsaatin, R.raw.ok));
        words.add(new Word("", "تِسْعُ طَلَّاسَاتٍ", R.drawable.tisutollaatsaatin, R.raw.ok));
        words.add(new Word("", "عَشْرُ طَلَّاسَاتٍ", R.drawable.asrutollaatsaatin, R.raw.ok));
        words.add(new Word("", "سَبُّوْرَةٌ (1), سَبُّوْرَتَانِ (2), سَبُّوْرَاتٌ (3-10)", R.drawable.sabbuurotun, R.raw.ok));
        words.add(new Word("", "مِنَشَّةٌ (1), مِنَشَّتَانِ (2), مِنَشَّاتٌ (3-10)", R.drawable.minassatun, R.raw.ok));
        words.add(new Word("", "بِنْتٌ (1), بِنْتَانِ (2), بَنَاتٌ (3-10)", R.drawable.bintun, R.raw.ok));
        words.add(new Word("", "حُجْرَةٌ (1), حُجْرَتَانِ (2), حُجُرَاتٌ", R.drawable.hujrotun, R.raw.ok));
        words.add(new Word("", "لُغَةٌ (1), لُغَتَانِ (2), لُغَاتٌ (3-10)", R.drawable.lugotun, R.raw.ok));
        words.add(new Word("", "مِمْحَاةٌ (1), مِمْحَاتَانِ (2), مِمْحَوَاتٌ (3-10)", R.drawable.mimhaatun, R.raw.ok));
        words.add(new Word("", "صَلَاةٌ (1), صَلَاتَانِ (2), صَلَوَاتٌ (3-10)", R.drawable.solat, R.raw.ok));
        words.add(new Word("", "قَنَاةٌ (1), قَنَتَانِ (2), قَنَوَاتٌ (3-10)", R.drawable.konaatun, R.raw.ok));
        words.add(new Word("", "سَمَاءٌ (1), سَمَآءَانِ (2), سَمَاوَاتٌ (3-10)", R.drawable.samaaun, R.raw.ok));

        // setting up the array adapter
        WordAdapter5 itemsAdapter= new WordAdapter5(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
