package com.apps.juanlazuardo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;

public class DailyActivity extends AppCompatActivity {
    //Inisialisasi Var
    RecyclerView recyclerView, recyclerView2;
    ArrayList<MainModel> mainModels;
    MyAdapter2 myAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        //Assign Var
        recyclerView = findViewById(R.id.rcvFriend);
        //int array img
        Integer[] langLogo = {R.drawable.ic_people2, R.drawable.ic_people2, R.drawable.ic_people2,
                R.drawable.ic_people2, R.drawable.ic_people2, R.drawable.ic_people2, R.drawable.ic_people2};

        //string array string

        String[] langTxt = {"Juan","Hapid", "Nofri", "Ucok", "Iqbal", "Adithya","Fikri"};
        String[] langTxt2 = {"Wake Up", "Attend Class","Break","Playing Games","Sleep"};
        String[] langTxt3 = {"06.00", "08.00 – 14.00","14.00 – 16.00","19.00 – 23.59","00.00 – 06.00"};
        //inisialisasi ArrayList
        mainModels = new ArrayList<>();
        for (int i=0;i<langLogo.length;i++){
            MainModel model = new MainModel(langLogo[i], langTxt[i]);
            mainModels.add(model);
        }

        //Design Horizontal Layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                DailyActivity.this, LinearLayoutManager.HORIZONTAL, false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        myAdapter2 = new MyAdapter2(DailyActivity.this, mainModels);
        recyclerView.setAdapter(myAdapter2);


        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.daily);

        //selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.daily:
                        return true;
                    case R.id.gallery:
                        startActivity(new Intent(getApplicationContext()
                                , GalleryActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
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
