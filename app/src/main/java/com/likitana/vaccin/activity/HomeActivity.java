package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.likitana.vaccin.R;
import com.likitana.vaccin.adapter.HomeAdapter;
import com.likitana.vaccin.object.Home;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Home> homeObject = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getDataFomApi();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new HomeAdapter(homeObject));

    }

    public void getDataFomApi() {
        homeObject.add(new Home("Vaccination Définition", R.mipmap.ic_image_healing));
        homeObject.add(new Home("Liste Vaccins", R.mipmap.ic_image_colorize));
        homeObject.add(new Home("Vaccination voyage", R.mipmap.ic_image_healing));
        homeObject.add(new Home("Actualité vaccins", R.mipmap.ic_image_straighten));
        homeObject.add(new Home("Calendrier vaccinal", R.mipmap.ic_image_timer));
        homeObject.add(new Home("Abbréviations utilisées", R.mipmap.ic_image_colorize));
        homeObject.add(new Home("Mon dossier famille", R.mipmap.ic_image_healing));
        homeObject.add(new Home("Mon profil", R.mipmap.ic_image_straighten));
        homeObject.add(new Home("A propos", R.mipmap.ic_image_healing));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
