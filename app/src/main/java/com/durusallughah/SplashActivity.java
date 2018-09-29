package com.durusallughah;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity{
    private TextView tv,tv2;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        getSupportActionBar().setTitle(""); // set the top title
        String title = actionBar.getTitle().toString(); // get the title
        actionBar.hide(); // or even hide the actionbar

        tv = findViewById(R.id.text);
        tv2 = findViewById(R.id.text2);
        iv = findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.myanim);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "arab.ttf");
        tv.setTypeface(typeface);
        tv2.setTypeface(typeface);

        tv.startAnimation(myanim);
        tv2.startAnimation(myanim);
        iv.startAnimation(myanim);

        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}



