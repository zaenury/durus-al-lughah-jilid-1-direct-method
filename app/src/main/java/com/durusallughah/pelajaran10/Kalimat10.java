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
import com.durusallughah.WordAdapter5;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kalimat10 extends Fragment {

    public Kalimat10() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "مُفْرَدٌ = 1, جَمْعٌ >= 3",  R.raw.ok));
        words.add(new Word("", "فَصْلٌ = 1, فُصُوْلٌ >= 3", R.drawable.faslun, R.raw.ok));
        words.add(new Word("", "صَحْنٌ = 1, صُحُوْنٌ >= 3", R.drawable.sohnun, R.raw.ok));
        words.add(new Word("", "جَيْبٌ = 1, جُيُوْبٌ >= 3", R.drawable.jaibun, R.raw.ok));
        words.add(new Word("", "طَالِبٌ = 1, طُلَّابٌ >= 3", R.drawable.tilmiidzun, R.raw.ok));
        words.add(new Word("", "عَامِلٌ = 1, عُمَّالٌ >= 3", R.drawable.aamilun, R.raw.ok));
        words.add(new Word("", "رِسَالَةٌ = 1, رَسَائِلٌ >= 3", R.drawable.risaalatun, R.raw.ok));
        words.add(new Word("", "خَرِيْطَةٌ = 1, خَرَائِطٌ >= 3", R.drawable.qoriitotun, R.raw.ok));
        words.add(new Word("", "جَرِيْدَةٌ = 1, جَرَائِدٌ >= 3", R.drawable.jariidatun, R.raw.ok));
        words.add(new Word("", "مُسْلِمٌ = 1, مُسْلِمُوْنَ >= 3", R.drawable.muslimun, R.raw.ok));
        words.add(new Word("", "مُؤْمِنٌ = 1, مُؤْمِنُوْنَ >= 3", R.drawable.mukminun, R.raw.ok));
        words.add(new Word("", "صَالِحٌ = 1, صَالِحُوْنَ >= 3", R.drawable.soolihun, R.raw.ok));
        words.add(new Word("", "كَافِرٌ = 1, كَافِرُوْنَ/كُفَّارٌ >= 3", R.drawable.kaafirun, R.raw.ok));
        words.add(new Word("", "مَكْتَبٌ = 1, مَكَاتِبُ >= 3", R.drawable.maktabun, R.raw.ok));
        words.add(new Word("", "مَنْزِلٌ = 1, مَنَازِلُ >= 3", R.drawable.manzilun, R.raw.ok));
        words.add(new Word("", "مَدْرَسَةٌ = 1, مَدَارِسُ >= 3", R.drawable.madrosatun, R.raw.ok));
        words.add(new Word("", "نَافِذَةٌ = 1, نَوَافِذُ >= 3", R.drawable.naafidzatun, R.raw.ok));
        words.add(new Word("", "مَائِدَةٌ = 1, مَوَائِدُ >= 3", R.drawable.maaidatun, R.raw.ok));
        words.add(new Word("", "فَاكِهَةٌ = 1, فَوَاكِهُ >= 3", R.drawable.tsamarun, R.raw.ok));
        words.add(new Word("", "مِفْتَاحٌ = 1, مَفَاتِحُ >= 3", R.drawable.miftaahun, R.raw.ok));
        words.add(new Word("", "عُصْفُوْرٌ = 1, عُصْفُوْرٌ >= 3", R.drawable.usfuurun, R.raw.ok));
        words.add(new Word("", "تِلْمِيْذٌ = 1, تَلَامِيْذُ >= 3", R.drawable.tilmiidzun, R.raw.ok));
        words.add(new Word("", "مُسْلِمَةٌ = 1, مُسْلِمَاتٌ >= 3", R.drawable.muslimatun, R.raw.ok));
        words.add(new Word("", "مُؤْمِنَةٌ = 1, مُؤْمِنَاتٌ >= 3", R.drawable.mukminatun, R.raw.ok));
        words.add(new Word("", "صَالِحٌ = 1, صَالِحَاتٌ >= 3", R.drawable.soolihaatun, R.raw.ok));
        words.add(new Word("", "كَافِرَةٌ = 1, كَافِرَاتٌ >= 3", R.drawable.kaafirotun , R.raw.ok));

        // setting up the array adapter
        WordAdapter5 itemsAdapter= new WordAdapter5(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
