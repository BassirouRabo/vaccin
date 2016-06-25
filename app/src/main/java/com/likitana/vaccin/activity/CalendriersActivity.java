package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.likitana.vaccin.R;
import com.likitana.vaccin.adapter.CalendrierAdapter;
import com.likitana.vaccin.object.Calendrier;
import com.likitana.vaccin.object.Pays;

import java.util.ArrayList;
import java.util.List;

public class CalendriersActivity extends AppCompatActivity {
    private Pays pays;
    private RecyclerView recyclerView;
    private List<Calendrier> calendriers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendriers);

        pays = (Pays) getIntent().getSerializableExtra("Pays");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        assert toolbar != null;
        toolbar.setTitle("Calendrier vaccinal " + pays.getNom());
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null && pays != null) {
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            calendriers.add(new Calendrier(1, "Naissance"));
            calendriers.add(new Calendrier(1, "2 mois"));
            calendriers.add(new Calendrier(1, "4 mois"));
            calendriers.add(new Calendrier(1, "11 mois"));
            calendriers.add(new Calendrier(1, "12 mois"));
            calendriers.add(new Calendrier(1, "16 - 18 mois"));
            calendriers.add(new Calendrier(1, "6 ans"));
            calendriers.add(new Calendrier(1, "11 - 13 ans"));
            calendriers.add(new Calendrier(1, "14 ans"));
            calendriers.add(new Calendrier(1, "25 ans"));
            calendriers.add(new Calendrier(1, "+65 ans"));

            recyclerView.setAdapter(new CalendrierAdapter(calendriers));
        }


    }

}
