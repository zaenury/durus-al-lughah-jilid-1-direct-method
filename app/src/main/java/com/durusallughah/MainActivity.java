package com.durusallughah;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.durusallughah.pelajaran1.Main1Activity;
import com.durusallughah.pelajaran10.Main10Activity;
import com.durusallughah.pelajaran11.Main11Activity;
import com.durusallughah.pelajaran12.Main12Activity;
import com.durusallughah.pelajaran2.Main2Activity;
import com.durusallughah.pelajaran3.Main3Activity;
import com.durusallughah.pelajaran4.Main4Activity;
import com.durusallughah.pelajaran5.Main5Activity;
import com.durusallughah.pelajaran6.Main6Activity;
import com.durusallughah.pelajaran7.Main7Activity;
import com.durusallughah.pelajaran8.Main8Activity;
import com.durusallughah.pelajaran9.Main9Activity;


public class MainActivity extends Activity {

    private TextView tv,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12, tvlatihan;
    private Toolbar toolbar;
    private NavigationView navigationView; 
    private DrawerLayout drawerLayout;
    ImageView Pelajaran1, Pelajaran2, Pelajaran3, Pelajaran4, Pelajaran5, Pelajaran6, Pelajaran7, Pelajaran8, Pelajaran9,Pelajaran10, Pelajaran11, Pelajaran12, Tamrin, Setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tv = findViewById(R.id.toolbar);
        tv1 = findViewById(R.id.satu);
        tv2 = findViewById(R.id.dua);
        tv3 = findViewById(R.id.tiga);
        tv4 = findViewById(R.id.empat);
        tv5 = findViewById(R.id.lima);
        tv6 = findViewById(R.id.enam);
        tv7 = findViewById(R.id.tujuh);
        tv8 = findViewById(R.id.delapan);
        tv9 = findViewById(R.id.sembilan);
        tv10 = findViewById(R.id.sepuluh);
        tv11 = findViewById(R.id.sebelas);
        tv12 = findViewById(R.id.latihan);
        tvlatihan = findViewById(R.id.duabelas);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "usmani2.ttf");
        //tv.setTypeface(typeface);
        tv1.setTypeface(typeface);
        tv2.setTypeface(typeface);
        tv3.setTypeface(typeface);
        tv4.setTypeface(typeface);
        tv5.setTypeface(typeface);
        tv6.setTypeface(typeface);
        tv7.setTypeface(typeface);
        tv8.setTypeface(typeface);
        tv9.setTypeface(typeface);
        tv10.setTypeface(typeface);
        tv11.setTypeface(typeface);
        tv12.setTypeface(typeface);
        tvlatihan.setTypeface(typeface);

        Pelajaran1 = findViewById(R.id.pelajaran1);
        Pelajaran2 = findViewById(R.id.pelajaran2);
        Pelajaran3 = findViewById(R.id.pelajaran3);
        Pelajaran4 = findViewById(R.id.pelajaran4);
        Pelajaran5 = findViewById(R.id.pelajaran5);
        Pelajaran6 = findViewById(R.id.pelajaran6);
        Pelajaran7 = findViewById(R.id.pelajaran7);
        Pelajaran8 = findViewById(R.id.pelajaran8);
        Pelajaran9 = findViewById(R.id.pelajaran9);
        Pelajaran10 = findViewById(R.id.pelajaran10);
        Pelajaran11 = findViewById(R.id.pelajaran11);
        Pelajaran12 = findViewById(R.id.pelajaran12);
        Tamrin = findViewById(R.id.tamrin);

        Pelajaran1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main1Activity.class);
                startActivity(i);
            }
        });

        Pelajaran2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(s);
            }
        });

        Pelajaran3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(g);
            }
        });

        Pelajaran4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(a);
            }
        });
        Pelajaran5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(a);
            }
        });
        Pelajaran6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(a);
            }
        });
        Pelajaran7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main7Activity.class);
                startActivity(a);
            }
        });
        Pelajaran8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main8Activity.class);
                startActivity(a);
            }
        });
        Pelajaran9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main9Activity.class);
                startActivity(a);
            }
        });
        Pelajaran10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main10Activity.class);
                startActivity(a);
            }
        });
        Pelajaran11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main11Activity.class);
                startActivity(a);
            }
        });
        Pelajaran12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main12Activity.class);
                startActivity(a);
            }
        });
        Tamrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Latihan.class);
                startActivity(a);
            }
        });

        // Menginisiasi Toolbar dan mensetting sebagai actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Custom title
        TextView textCustomTitle = (TextView) findViewById(R.id.text_toolbar);

        // Set
        textCustomTitle.setTypeface(typeface);

        //setSupportActionBar(toolbar);
        // Menginisiasi  NavigationView
        navigationView = findViewById(R.id.navigation_view);
        //Mengatur Navigasi View Item yang akan dipanggil untuk menangani item klik menu navigasi
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                //Menutup  drawer item klik
                drawerLayout.closeDrawers();
                //Memeriksa untuk melihat item yang akan dilklik dan melalukan aksi
                switch (menuItem.getItemId()){
                    // pilihan menu item navigasi akan menampilkan pesan toast klik kalian bisa menggantinya
                    //dengan intent activity
                    case R.id.nav_overview:
                        Intent o = new Intent(MainActivity.this, Overview.class);
                        startActivity(o);
                        return true;
                    case R.id.nav_videos:
                        Intent a = new Intent(MainActivity.this, ReverensiVideo.class);
                        startActivity(a);
                        return true;
                    case R.id.nav_new:
                        Intent d = new Intent(MainActivity.this, Whatsnew.class);
                        startActivity(d);
                        return true;
                    case R.id.nav_update:
                        Uri uri0 = Uri.parse("https://play.google.com/store/apps/details?id=com.durus.duruscorp");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri0);
                        startActivity(intent);
                        return true;
                    case R.id.nav_feedback:
                        Intent send = new Intent(Intent.ACTION_SENDTO);
                        String uriText = "mailto:" + Uri.encode("adhiimzaenury@gmail.com") +
                                "?subject=" + Uri.encode("Thanks for helping Developer Improves Durus Al-Lughah") +
                                "&body=" + Uri.encode("My complaints / suggestions are: ");
                        Uri uri = Uri.parse(uriText);
                        send.setData(uri);
                        startActivity(Intent.createChooser(send, "Send mail..."));
                        return true;
                    case R.id.navi_developer:
                        Uri uri2 = Uri.parse("https://play.google.com/store/apps/details?id=com.unida.zheezhee.tamrinlughohgontory");
                        Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                        startActivity(intent2);
                        return true;
                    case R.id.nav_about:
                        Intent b = new Intent(MainActivity.this, About.class);
                        startActivity(b);
                        return true;

                    default:
                        Toast.makeText(getApplicationContext(),"Kesalahan Terjadi ",Toast.LENGTH_SHORT).show();
                        return true;
                }
            }
        });
        // Menginisasi Drawer Layout dan ActionBarToggle
        drawerLayout =  findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView) {
                // Kode di sini akan merespons setelah drawer menutup disini kita biarkan kosong
                super.onDrawerClosed(drawerView);
            }
            @Override
            public void onDrawerOpened(View drawerView) {
                //  Kode di sini akan merespons setelah drawer terbuka disini kita biarkan kosong
                super.onDrawerOpened(drawerView);
            }
        };
        //Mensetting actionbarToggle untuk drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        //memanggil synstate
        actionBarDrawerToggle.syncState();
    }


    public void loadSlides(View view) {
        new PreferenceManager(this).clearPreferences();
        startActivity(new Intent(this, WelcomeActivity.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        //exit dari aplikasi dengan konfirmasi AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
                //System.exit(0);
                //moveTaskToBack(true);
                //onDestroy();
                //Intent intent = new Intent(getApplicationContext(), Welcomescreen.class);
                //startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }


}