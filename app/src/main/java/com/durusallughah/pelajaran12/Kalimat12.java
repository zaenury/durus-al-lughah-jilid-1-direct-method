package com.durusallughah.pelajaran12;


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
public class Kalimat12 extends Fragment {

    public Kalimat12() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "أَحَدَ عَشَرَ وَلَدًا", R.drawable.anaksebelas, R.raw.ok));
        words.add(new Word("", "اِثْنَا عَشَرَ وَلَدًا", R.drawable.anakduabelas, R.raw.ok));
        words.add(new Word("", "ثَلَاثَةَ عَشَرَ وَلَدًا", R.drawable.anaktigabelas, R.raw.ok));
        words.add(new Word("", "أَرْبَعَةَ عَشَرَ وَلَدًا", R.drawable.anakempatbelas, R.raw.ok));
        words.add(new Word("", "خَمْسَةَ عَشَرَ وَلَدًا", R.drawable.anaklimabelas, R.raw.ok));
        words.add(new Word("", "سِتَّةَ عَشَرَ وَلَدًا", R.drawable.anakenambelas, R.raw.ok));
        words.add(new Word("", "سَبْعَةَ عَشَرَ وَلَدًا", R.drawable.anaktujuhbelas, R.raw.ok));
        words.add(new Word("", "ثَمَانِيَةَ عَشَرَ وَلَدًا", R.drawable.anakdelapanbelas, R.raw.ok));
        words.add(new Word("", "تِسْعَةَ عَشَرَوَلَدًا", R.drawable.anaksembilanbelas, R.raw.ok));
        words.add(new Word("", "عِشْرُوْنَ وَلَدًا", R.drawable.anakduapuluh, R.raw.ok));
        words.add(new Word("", "س : عَلَى مَقْعَدٍ وَاحِدٍ أَرْبَعَةُ أَوْلَادٍ. كَمْ وَلَدًا عَلَى أَرْبَعَةِ مَقَاعِدَ؟", R.drawable.kamwaladan, R.raw.ok));
        words.add(new Word("", "ج : عَلَيْهَا سِتَّةَ عَشَرَ وَلَدًا", R.raw.ok));
        words.add(new Word("", "س : كَمْ وَلَدًا عَلَى خَمْسَةِ مَقَاعِدَ؟", R.raw.ok));
        words.add(new Word("", "ج : عَلَيْهَا عِشْرُوْنَ وَلَدًا", R.raw.ok));
        words.add(new Word("", "هٰذِهِ سَاعَةٌ, فِي السَّاعَةِ رَقْمٌ", R.drawable.saaatun, R.raw.ok));
        words.add(new Word("", "كَمْ رَقْمًا فِي السَّاعَةِ؟ فِيْهَا اثْنَا عَشَرَ رَقْمًا", R.raw.ok));

        // setting up the array adapter
        WordAdapter5 itemsAdapter= new WordAdapter5(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
