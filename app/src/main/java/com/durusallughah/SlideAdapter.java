package com.durusallughah;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public int[] first_images =

            {

                    R.drawable.ic_launcher2,
                    R.drawable.free,
                    R.drawable.time,
                    R.drawable.memory,

            };

//list titles

    public String[] first_title ={
            "Al-Quran",
            "Audio",
            "Alarm",
            "Bantuan"
    };

    //liat description

    public String[] first_description = {
            "description 1",
            "description 2",
            "description 3",
            "description 4"

    };

    public int[] first_background = {
            Color.rgb(49,139,135),
            Color.rgb(49,139,135),
            Color.rgb(49,139,135),
            Color.rgb(49,139,135)
    };


    public SlideAdapter (Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return first_title.length;
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        ImageView imageslide = view.findViewById(R.id.slideimg);
        TextView txttitle = view.findViewById(R.id.txttitle);
        TextView description = view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(first_background[position]);
        imageslide.setImageResource(first_images[position]);
        txttitle.setText(first_title[position]);
        description.setText(first_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout) object);
    }
}
