package com.apps.juanlazuardo;
    /*

    NIM     : 10117160
    NAMA    : JUAN LAZUARDO
    KELAS   : AKB-4 / IF-4
    Update  :
        9 Mei 2020 : - Membuat Splash Screen
                     - Merubah Icon Aplikasi
                     - Update Github " Membuat Splash Screen"

    10-11 Mei 2020 : - Membuat Asset untuk ViewPager
                     - Membuat 3 ViewPager dengan Metode OnBoarding Screen Design
                     - Update Github "Membuat ViewPager dengan Metode OnBoarding Screen Design"

       13 Mei 2020 : - Membuat Buttom Navigation VIew

       14 Mei 2020 : - Membuat Tampilan Menu Home
                     - Membuat Tampilan Profile + Webview + Maps untuk FindMe
                     - Membuat Custom Dialog

       15 Mei 2020 : - Membuat Tampilan Menu Music


    */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.daily:
                        startActivity(new Intent(getApplicationContext()
                                , DailyActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.gallery:
                        startActivity(new Intent(getApplicationContext()
                                , GalleryActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        return true;
                    case R.id.music:
                        startActivity(new Intent(getApplicationContext()
                                , MusicActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                , AboutActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}
