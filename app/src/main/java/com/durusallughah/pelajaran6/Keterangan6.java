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
public class Keterangan6 extends Fragment {

    public Keterangan6() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Pronouns and Possessive Pronouns 1", "ضَمَائِرُ وَضَمَائِرُ الْمَلَكِيَّةِ 1", R.raw.ok));
        words.add(new Word("Pronouns 1 : (iam - mine), (you - yours for male), (you - yours for female), (he - his), (she - hers)", "الضَّمِيْرُ 1 : ( أَنَا – لِيْ ), ( أَنْتَ – لَكَ ), ( أَنْتِ – لَكِ ), ( هُوَ – لَهُ ), ( هِيَ – لَهَا )", R.raw.ok));
        words.add(new Word("Users are able to use pronouns and possessive pronouns in the useful sentence", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِي اسْتِعْمَالِ الضَّمَائِرِ وَضَمَائِرِ الْمَلَكِيَّةِ فِي الْجُمْلَةِ الْمُفِيْدَةِ", R.raw.ok));
        words.add(new Word("Users are able to use new vocabulary and use it with proprietary expressions", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِيْ اسْتِعْمَالِ الْمُفْرَدَاتِ الْجَدِيْدَةِ نُطْقًا وَكِتَابَةً", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_numbers);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
