package com.durusallughah.pelajaran11;


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
public class Kalimat11 extends Fragment {

    public Kalimat11() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "لَيْسَ (هُوَ), لَيْسَتْ (هِيَ), لَسْتَ (أَنْتَ), لَسْتُ (أَنَا), لَسْتِ (أَنْتِ), لَسْنَا (نَحْنُ)", R.raw.ok));
        words.add(new Word("", "لَيْسَ الْأُسْتَاذُ وَرَاءَ التِّلْمِيْذِ بَلْ أَمَامَهُ", R.drawable.alustaadzuamaamattilmiidzi, R.raw.ok));
        words.add(new Word("", "لَيْسَ الْقَلَمُ فِي الْجَيْبِ بَلْ عَلَى الْمَكْتَبِ", R.drawable.laisalkolamufiljaibibalalalmaktabi, R.raw.ok));
        words.add(new Word("", "س : أَذٰلِكَ الرَّجُلُ أَبُوْكَ؟", R.drawable.halabuuka, R.raw.ok));
        words.add(new Word("", "ج : لَا, هُوَ لَيْسَ أَبِي بَلْ أُسْتَاذِيْ",  R.raw.ok));
        words.add(new Word("", "س : هَلِ السَّبُّورَةُ وَرَاءَ التِّلْمِيْذِ؟", R.drawable.halissabburotuwarooattilmiidzi, R.raw.ok));
        words.add(new Word("", "ج : لَا, لَيْسَتِ السَّبُّوْرَةُ وَرَاءَ التِّلْمِيْذِ بَلْ أَمَامَهُ", R.raw.ok));
        words.add(new Word("", "أَنْتَ عَالِمٌ لَسْتَ جَاهِلًا",R.drawable.aalimun, R.raw.ok));
        words.add(new Word("", "س : أَأَنْتَ أُسْتَاذٌ؟", R.drawable.lastuustaadzan, R.raw.ok));
        words.add(new Word("", "ج : لَا, لَسْتُ أُسْتَاذًا بَلْ تِلْمِيْذٌ", R.raw.ok));
        words.add(new Word("", "أَنْتِ تِلْمِيْذَةٌ لَسْتِ أُسْتَاذَةً",R.drawable.tilmiidzatun, R.raw.ok));
        words.add(new Word("", "س : هَلْ نَحْنُ عُمَّالٌ فِي الْمَصْنَعِ؟", R.drawable.nahnutalaamidz, R.raw.ok));
        words.add(new Word("", "ج : لَا, لَسْنَا عُمَّالًا فِي الْمَصْنَعِ، بَلْ نَحْنُ تَلَامِيْذُ فِي الْمَدْرَسَةِ", R.raw.ok));

        // setting up the array adapter
        WordAdapter5 itemsAdapter= new WordAdapter5(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
