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
import com.durusallughah.WordAdapter1;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Keterangan5 extends Fragment {

    public Keterangan5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Two tools from jar ( حُرُوْفٌ وَظُرُوْفٌ )", "أَدَاتَانِ الْجَرِّ ( حُرُوْفٌ وَظُرُوْفٌ )", R.raw.ok));
        words.add(new Word("Tool of jar ( الْحُرُوْفِ ) : عَلَى , فِيْ", "أَدَاةُ الْجَرِّ ( حُرُوْفٌ ) : عَلَى , فِيْ", R.raw.ok));
        words.add(new Word("Tool of jar ( الظُّرُوْفِ ) : فَوْقَ , تَحْتَ , بَيْنَ , وَرَاءَ , أَمَامَ", "أَدَاةُ الْجَرِّ ( ظُرُوْفٌ ) : فَوْقَ , تَحْتَ , بَيْنَ , وَرَاءَ , أَمَامَ", R.raw.ok));
        words.add(new Word("Users are able to use two tools of jar ( حُرُوْفٌ وَظُرُوْفٌ ) in the sentence", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِي اسْتِعْمَالِ الْأَدَتَيْنِ الْجَرِّ ( حُرُوْفٌ وَظُرُوْفٌ) فِي الْجُمْلَةِ", R.raw.ok));
        words.add(new Word("Users are able to declare placement by using two tools of jar ( حُرُوْفٌ وَظُرُوْفٌ ) in the sentence", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ كَشْفَ الْمَكَانِ فِي اسْتِعْمَالِ الْأَدَتَيْنِ الْجَرِّ ( حُرُوْفٌ وَظُرُوْفٌ ) فِي الْجُمْلَةِ", R.raw.ok));
        words.add(new Word("Users are able to use new vocabularies by reading and writing", "إِكْسَابُ الْمُسْتَخْدِمِيْنَ الْكَفَاءَةُ فِيْ اسْتِعْمَالِ الْمُفْرَدَاتِ الْجَدِيْدَةِ نُطْقًا وَكِتَابَةً", R.raw.ok));

        // setting up the array adapter
        WordAdapter1 itemsAdapter= new WordAdapter1(getActivity(), words,  R.color.category_numbers);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
