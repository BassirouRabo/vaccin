package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.likitana.vaccin.R;
import com.likitana.vaccin.adapter.AbbreviationAdapter;
import com.likitana.vaccin.object.Abbreviation;

import java.util.ArrayList;
import java.util.List;

public class AbbreviationsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Abbreviation> abbreviations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbreviations);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            abbreviations.add(new Abbreviation(1, "BCG", "Bacille Calmette Guérin"));
            abbreviations.add(new Abbreviation(1, "Chol-Ecol-O", "Choléra - E.coli - oral"));
            abbreviations.add(new Abbreviation(1, "DCaT", "Diphtérie, Coqueluche acellulaire, Tétanos"));
            abbreviations.add(new Abbreviation(1, "DCaT-HB-VPI-Hib", "Diphtérie, Coqueluche acellulaire, Tétanos, Hépatite B, Polio inactivé, Haemophilus influenzae de type b"));
            abbreviations.add(new Abbreviation(1, "DCaT-Hib", "Diphtérie, Coqueluche acellulaire, Tétanos, Haemophilus influenzae de type b"));

            recyclerView.setAdapter(new AbbreviationAdapter(abbreviations));
        }
    }

}
