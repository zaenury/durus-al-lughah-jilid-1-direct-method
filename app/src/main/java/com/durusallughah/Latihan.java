package com.durusallughah;

/**
 * Created by Windows 7 on 13/04/2018.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.durusallughah.pelajaran4.Main4Activity;

public class Latihan extends AppCompatActivity {

    private Database db;
    private TextView txtno, txtsoal;
    private ImageView img;
    private RadioGroup rg;
    private RadioButton rdA, rdB, rdC;
    private List<Soal> listSoal;
    private Button btnPrev, btnNext, btnSelesai;
    int jawabanYgDiPilih[] = null;
    int jawabanYgBenar[] = null;
    boolean cekPertanyaan = false;
    int urutanPertanyaan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);

        String customFont = "usmani2.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView2 = findViewById(R.id.textViewSoal);
        TextView textView3 = findViewById(R.id.radio0);
        TextView textView4 = findViewById(R.id.radio1);
        TextView textView5 = findViewById(R.id.radio2);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        textView5.setTypeface(typeface);

        db = new Database(this);
        txtno =  findViewById(R.id.textViewHalaman);
        txtsoal =  findViewById(R.id.textViewSoal);
        img =  findViewById(R.id.imageView1);
        rg =  findViewById(R.id.radioGroup1);
        rdA =  findViewById(R.id.radio0);
        rdB =  findViewById(R.id.radio1);
        rdC =  findViewById(R.id.radio2);
        btnPrev = findViewById(R.id.buttonPrev);
        btnNext = findViewById(R.id.buttonNext);
        btnSelesai = findViewById(R.id.buttonSelesai);

        listSoal = new ArrayList<Soal>();
        listSoal = db.getSoal();

        btnSelesai.setOnClickListener(klikSelesai);
        btnPrev.setOnClickListener(klikSebelum);
        btnNext.setOnClickListener(klikBerikut);
        //new GetSoal().execute();
        jawabanYgDiPilih = new int[listSoal.size()];
        java.util.Arrays.fill(jawabanYgDiPilih, -1);
        jawabanYgBenar = new int[listSoal.size()];
        java.util.Arrays.fill(jawabanYgBenar, -1);
        mulaiKuis();
    }



    protected void mulaiKuis() {
        setUpSoal();

    }

    private void setUpSoal() {
        this.tunjukanPertanyaan(0, cekPertanyaan);
    }

    private void tunjukanPertanyaan(int urutan_soal_soal, boolean review) {
        try {
            rg.clearCheck();
            Soal soal = new Soal();
            soal = listSoal.get(urutan_soal_soal);
            String pertanyaan = soal.getSoal();
            if (jawabanYgBenar[urutan_soal_soal] == -1) {
                jawabanYgBenar[urutan_soal_soal] = soal.getJwban();

            }

            int gambar = soal.getGambar();
            txtsoal.setText(pertanyaan.toCharArray(), 0, pertanyaan.length());
            img.setImageResource(gambar);
            rg.check(-1);
            String jwb_a = soal.getPil_a();
            rdA.setText(jwb_a.toCharArray(), 0,
                    jwb_a.length());
            String jwb_b = soal.getPil_b();
            rdB.setText(jwb_b.toCharArray(), 0,
                    jwb_b.length());
            String jwb_c = soal.getPil_c();
            rdC.setText(jwb_c.toCharArray(), 0,
                    jwb_c.length());

            Log.d("", jawabanYgDiPilih[urutan_soal_soal] + "");
            if (jawabanYgDiPilih[urutan_soal_soal] == 0)
                rg.check(R.id.radio0);
            if (jawabanYgDiPilih[urutan_soal_soal] == 1)
                rg.check(R.id.radio1);
            if (jawabanYgDiPilih[urutan_soal_soal] == 2)
                rg.check(R.id.radio2);

            pasangLabelDanNomorUrut();

            if (urutan_soal_soal == (listSoal.size() - 1))
                btnNext.setEnabled(false);

            if (urutan_soal_soal == 0)
                btnPrev.setEnabled(false);

            if (urutan_soal_soal > 0)
                btnPrev.setEnabled(true);

            if (urutan_soal_soal < (listSoal.size() - 1))
                btnNext.setEnabled(true);

        } catch (Exception e) {
            Log.e(this.getClass().toString(), e.getMessage(), e.getCause());
        }
    }



    private OnClickListener klikSelesai = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            // hitung berapa yg benar
            int jumlahJawabanYgBenar = 0;
            for (int i = 0; i < jawabanYgBenar.length; i++) {
                if ((jawabanYgBenar[i] != -1) && (jawabanYgBenar[i] == jawabanYgDiPilih[i]))
                    jumlahJawabanYgBenar++;
            }
            AlertDialog tampilKotakAlert;
            tampilKotakAlert = new AlertDialog.Builder(Latihan.this).create();
            tampilKotakAlert.setTitle("نَتِيْجَةٌ");
            //TextView textView =  findViewById(android.R.id.message);
            //textView.setTextSize(24);
            //Typeface typeface = Typeface.createFromAsset(getAssets(), "usmani2.ttf");
            tampilKotakAlert.setMessage(" صَحِيْحٌ " +jumlahJawabanYgBenar + " مِنْ " + (listSoal.size() +" سُؤَالٍ"));
            //textView.setTypeface(typeface);


            tampilKotakAlert.setButton(AlertDialog.BUTTON_POSITIVE, "مَرَّةً أُخْرَي؟         ",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            urutanPertanyaan = 0;

                            Latihan.this.tunjukanPertanyaan(0,
                                    cekPertanyaan);
                        }
                    });
            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "صَفْحَةٌ رَئِيْسِيَّةٌ",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            finish();
                        }
                    });
            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "إِجَابَةٌ",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            Intent a = new Intent(Latihan.this, jawaban.class);
                            startActivity(a);
                        }
                    });



            tampilKotakAlert.show();

        }
    };

    private void aturJawaban_nya() {
        if (rdA.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 0;
        if (rdB.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 1;
        if (rdC.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 2;

        Log.d("", Arrays.toString(jawabanYgDiPilih));
        Log.d("", Arrays.toString(jawabanYgBenar));

    }

    private OnClickListener klikBerikut = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan++;
            if (urutanPertanyaan >= listSoal.size())
                urutanPertanyaan = listSoal.size() - 1;

            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };

    private OnClickListener klikSebelum = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan--;
            if (urutanPertanyaan < 0)
                urutanPertanyaan = 0;

            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };

    private void pasangLabelDanNomorUrut() {
        //txtno.setText("Question number -" + (urutanPertanyaan + 1) + " from " + listSoal.size());
        txtno.setText("السُّؤَالُ رَقْمُ - " + (urutanPertanyaan + 1) + " مِنْ " + listSoal.size());
        //txtno.setText(listSoal.size() + " مِنْ " + (urutanPertanyaan + 1) + " السُّؤَالُ رَقْمُ - ");
    }
}
