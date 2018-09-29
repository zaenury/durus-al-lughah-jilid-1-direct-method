package com.durusallughah.pelajaran8;


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
public class Kalimat8 extends Fragment {

    public Kalimat8() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "قَلَمٌ (1), قَلَمَانِ (2), أَقْلَامٌ (3–10)", R.drawable.kolamunn, R.raw.ok));
        words.add(new Word("", "قَلَمٌ وَاحِدٌ", R.drawable.kolamunwaahidun, R.raw.ok));
        words.add(new Word("", "قَلَمَانِ اثْنَانِ", R.drawable.kolamaanisnaani, R.raw.ok));
        words.add(new Word("", "ثَلَاثَةُ أَقْلَامٍ", R.drawable.tsalaatsatuaklaamin, R.raw.ok));
        words.add(new Word("", "أَرْبَعَةُ أَقْلَامٍ", R.drawable.arbaatuaklaamin, R.raw.ok));
        words.add(new Word("", "خَمْسَةُ أَقْلَامٍ", R.drawable.qomsatuaklaamin, R.raw.ok));
        words.add(new Word("", "سِتَّةٌ أَقْلَامٍ", R.drawable.sittatuaklaamin, R.raw.ok));
        words.add(new Word("", "سَبْعَةُ أَقْلَامٍ", R.drawable.sabatuaklaamin, R.raw.ok));
        words.add(new Word("", "ثَمَانِيَةُ أَقْلَامٍ", R.drawable.tsamaaniyyatuaklaamin, R.raw.ok));
        words.add(new Word("", "تِسْعَةُ أَقْلَامٍ", R.drawable.tisatuaklaamin, R.raw.ok));
        words.add(new Word("", "عَشَرَةُ أَقْلَامٍ", R.drawable.asarotuaklaamin, R.raw.ok));
        words.add(new Word("", "بَابٌ", R.drawable.baabun, R.raw.ok));
        words.add(new Word("", "لِلْبَيْتِ ثَلَاثَةُ أَبْوَابٍ", R.drawable.tsalaatsatuabwaabin, R.raw.ok));
        words.add(new Word("", "سُوْرٌ (1), سُوْرَانِ (2), أَسْوَارٌ (3-10) ", R.drawable.suurun, R.raw.ok));
        words.add(new Word("", "ثَوْبٌ (1), ثَوْبَانِ (2), أَثْوَابٌ (3-10)", R.drawable.tsaubun, R.raw.ok));
        words.add(new Word("", "غُصْنٌ (1), غُصْنَانِ (2), أَغْصَانٌ (3-10)", R.drawable.gusnun, R.raw.ok));
        words.add(new Word("", "مِتْرٌ (1), مِتْرَانِ (2), أَمْتَارٌ (3-10)", R.drawable.mitrun, R.raw.ok));
        words.add(new Word("", "وَلَدٌ (1), وَلَدَانِ (2), أَوْلَادٌ (3-10)", R.drawable.waladun, R.raw.ok));
        words.add(new Word("", "رَقْمٌ (1), رَقْمَانِ (2), أَرْقَامٌ (3-10)", R.drawable.rokmun, R.raw.ok));
        words.add(new Word("", "بِئْرٌ (1), بِئْرَانِ (2), آبَارٌ (3-10)", R.drawable.bikrun, R.raw.ok));
        words.add(new Word("", "عُشْبٌ (1), عُشْبَانِ (2), أَعْشَابٌ", R.drawable.usbun, R.raw.ok));
        words.add(new Word("", "كُوْبٌ (1), كُوْبَانِ (2), أَكْوَابٌ", R.drawable.kuubun, R.raw.ok));

        // setting up the array adapter
        WordAdapter5 itemsAdapter= new WordAdapter5(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
