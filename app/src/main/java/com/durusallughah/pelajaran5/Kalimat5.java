package com.durusallughah.pelajaran5;


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
public class Kalimat5 extends Fragment {

    public Kalimat5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "إِمْلَاءِ الْإِهْتِمَامَ وَفَهِّمِ الْجُمْلَةَ عَلَى سَبِيْلِ الْمِثَالِ أَدْنَاهُ!",  R.raw.ok));
        words.add(new Word("", "اَلسَّبُّورَةُ وَالْمَكْتَبُ وَالْكُرْسِيُّ فِي الْفَصْلِ", R.drawable.assabburotuwalmaktabuwalkursiyyu, R.raw.ok));
        words.add(new Word("", "اَلْكُرَّاسَةُ عَلَى الْمَكْتَبِ", R.drawable.alkurroosatualalmaktabi, R.raw.ok));
        words.add(new Word("", "اَلْمَكْتَبُ وَالْكُرْسِيُّ عَلَى الْأَرْضِ",R.drawable.almaktabuwalkursiyyualalardi, R.raw.ok));
        words.add(new Word("", "اَلسَّقْفُ فَوْقَ الْمَكْتَبِ",R.drawable.assakfufaukolmaktabi, R.raw.ok));
        words.add(new Word("", "اَلْمَكْتَبُ تَحْتَ السَّقْفِ",R.drawable.almaktabutahtassakfi, R.raw.ok));
        words.add(new Word("", "اَلْأَرْضُ تَحْتَ السَّقْفِ",R.drawable.alardutahtassakfi, R.raw.ok));
        words.add(new Word("", "اَلْأَرْضُ وَالْمَكْتَبُ وَالْمَقْعَدُ وَالسَّبُّورَةُ تَحْتَ السَّقْفِ",R.drawable.alarduwalmaktabuwalmakaduwassabburotutahtassakfi, R.raw.ok));
        words.add(new Word("", "اَلْأُسْتَاذُ فِي الْفَصْلِ",R.drawable.alustaadzuwattilmidz, R.raw.ok));
        words.add(new Word("", "التِّلْمِيذُ فِي الْفَصْلِ",R.drawable.alustaadzuwattilmidz, R.raw.ok));
        words.add(new Word("", "اَلْأُسْتَاذُ أَمَامَ التِّلْمِيذِ",R.drawable.alustaadzuamaamattilmiidzi, R.raw.ok));
        words.add(new Word("", "التِّلْمِيذُ أَمَامَ الْأُسْتَاذِ",R.drawable.attilmiidzuamaamalustaadzi, R.raw.ok));
        words.add(new Word("", "اَلْأُسْتَاذُ بَيْنَ السَّبُّورَةِ وَالْمَكْتَبِ",R.drawable.alustaadzubainassabbuurotiwalmaktabi, R.raw.ok));
        words.add(new Word("", "السَّبُّوْرَةُ وَرَاءَ الْأُسْتَاذِ",R.drawable.assabburotuwarooalustaadzi, R.raw.ok));

        // setting up the array adapter
        WordAdapter5 itemsAdapter= new WordAdapter5(getActivity(), words, R.color.category_family);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
