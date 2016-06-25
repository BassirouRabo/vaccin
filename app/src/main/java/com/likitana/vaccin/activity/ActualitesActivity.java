package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.likitana.vaccin.R;
import com.likitana.vaccin.adapter.ActualiteAdapter;
import com.likitana.vaccin.object.Actualite;

import java.util.ArrayList;
import java.util.List;

public class ActualitesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Actualite> actualites = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualites);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            actualites.add(new Actualite(1, "01/02/2016", "Actualite 1", "Introduction pour l'actualité 1", getString(R.string.vaccin_type_2)));
            actualites.add(new Actualite(1, "01/02/2016", "Actualite 2", "Introduction pour l'actualité 2", getString(R.string.vaccin_type_2)));
            actualites.add(new Actualite(1, "01/02/2016", "Actualite 3", "Introduction pour l'actualité 3", getString(R.string.vaccin_type_2)));

            recyclerView.setAdapter(new ActualiteAdapter(actualites));
        }
    }

}
