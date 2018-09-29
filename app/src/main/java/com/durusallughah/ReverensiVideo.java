package com.durusallughah;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Windows 7 on 28/04/2018.
 */

public class ReverensiVideo extends AppCompatActivity{
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reverensi_video);

        button1 = findViewById(R.id.watch1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="h6h_SFoiqwc";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button2 = findViewById(R.id.watch2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="LKqfTBVJ0K4";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button3 = findViewById(R.id.watch3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="llBjxgpm3MY";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button4 = findViewById(R.id.watch4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="8RqJenX3LyE";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button5 = findViewById(R.id.watch5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="KsqHcOWVvn8";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button6 = findViewById(R.id.watch6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="3e2xp8Yg_rw";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button7 = findViewById(R.id.watch7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="kiQJ-tusGBs";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button8 = findViewById(R.id.watch8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="kxha5SUK5PA";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button9 = findViewById(R.id.watch9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="uduyWVxjIW0";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button10 = findViewById(R.id.watch10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="3lcVF8_F7Eo";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button11 = findViewById(R.id.watch11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="CmG45LfQDec";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button12 = findViewById(R.id.watch12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="M2HN7GOczQc";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
        button13 = findViewById(R.id.watch13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId ="jKXbW32sBbM";
                Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                a.putExtra("VIDEO_ID", videoId);
                startActivity(a);
            }
        });
    }
}
