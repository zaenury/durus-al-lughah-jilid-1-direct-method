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
import com.durusallughah.WordAdapter3;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kalimat6 extends Fragment {

    public Kalimat6() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "أَنَا أُسْتَاذٌ", R.drawable.ustaadzun, R.raw.ok));
        words.add(new Word("", "لِيْ كِتَابٌ", R.drawable.kitaabun, R.raw.ok));
        words.add(new Word("", "هٰذَا الْكِتَابُ لِيْ", R.drawable.hadzaakitaabun, R.raw.ok));
        words.add(new Word("", "أَنْتَ تِلْمِيذٌ", R.drawable.tilmiidzun, R.raw.ok));
        words.add(new Word("", "لَكَ كُرَّاسَةٌ", R.drawable.kurroosatun, R.raw.ok));
        words.add(new Word("", "أَنْتِ فَاطِمَةُ", R.drawable.faatimah, R.raw.ok));
        words.add(new Word("", "لَكِ مَنْدِيلٌ", R.drawable.mandiilun, R.raw.ok));
        words.add(new Word("", "مُحَمَّدٌ وَلَدٌ", R.drawable.muhammad, R.raw.ok));
        words.add(new Word("", "هُوَ تِلْمِيذٌ فِي هٰذِهِ الْمَدْرَسَةِ", R.drawable.madrosatun, R.raw.ok));
        words.add(new Word("", "لَهُ كُرَّاسَةٌٌ", R.drawable.kurroosatun, R.raw.ok));
        words.add(new Word("", "عَائِشَةُ بِنْتٌ", R.drawable.aisyah, R.raw.ok));
        words.add(new Word("", "هِيَ تِلْمِيذَةٌ فِي الْمَدْرَسَةِ الْاِبْتِدَائِيَّةِ", R.drawable.madrosatun, R.raw.ok));
        words.add(new Word("", "لَهَا مَحْفَظَةٌٌ", R.drawable.mahfadzotun, R.raw.ok));
        words.add(new Word("", "س : أَيْنَ قَلَمُ حِبْرٍ؟", R.drawable.kolamuhibrin, R.raw.ok));
        words.add(new Word("", "ج : هُوَ فِيْ الْجَيْبِ", R.drawable.jaibun, R.raw.ok));
        words.add(new Word("", "س : مَنْ ذٰلِكَ الْوَلَدُ؟", R.drawable.waladun, R.raw.ok));
        words.add(new Word("", "ج : هُوَ مُحَمَّدٌ", R.drawable.muhammad, R.raw.ok));
        words.add(new Word("", "س : هَلْ لِمُحَمَّدٍ كُرَّاسَةٌ؟", R.drawable.kolamun, R.raw.ok));
        words.add(new Word("", "ج : نَعَمْ, لَهُ كُرَّاسَةٌ عَلَى الْمَكْتَبِ", R.drawable.alkurroosatualalmaktabi, R.raw.ok));
        words.add(new Word("", "س : مَاذَا لِفَاطِمَةَ؟", R.drawable.faatimah, R.raw.ok));
        words.add(new Word("", "ج : لَهَا مَحْفَظَةٌ", R.drawable.mahfadzotun, R.raw.ok));

        // setting up the array adapter
        WordAdapter3 itemsAdapter= new WordAdapter3(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
