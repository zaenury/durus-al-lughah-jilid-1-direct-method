package com.durusallughah.pelajaran11;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by admin on 26-06-2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "أهداف", "مفردات", "أمثلة", "أسئلة"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new Keterangan11();
        } else if (position == 1){
            return new Kata11();
        } else if (position == 2) {
            return new Kalimat11();
        } else {
            return new Percakapan11();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
