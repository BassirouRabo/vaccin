package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.likitana.vaccin.R;
import com.likitana.vaccin.adapter.VaccinAdapter;
import com.likitana.vaccin.object.Pays;
import com.likitana.vaccin.object.Vaccin;

import java.util.ArrayList;
import java.util.List;

public class VaccinsVoyageActivity extends AppCompatActivity {
    private Pays pays;
    private String type;
    private RecyclerView recyclerView;
    private List<Vaccin> vaccins = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccins_voyage);

        pays = (Pays)getIntent().getSerializableExtra("Pays");
        type = getIntent().getStringExtra("type");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        assert toolbar != null;
        toolbar.setTitle(pays.getNom()+" vacin "+type);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (savedInstanceState == null && pays !=null) {

            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            vaccins.add(new Vaccin(1, "Poliomyélite", "Dukoral", "Chol-Ecol-O", getString(R.string.vaccin_type_1), getString(R.string.vaccin_type_2), getString(R.string.vaccin_type_3),getString(R.string.vaccin_type_1)));
            vaccins.add(new Vaccin(1, "Coqueluche", "Dukoral", "Chol-Ecol-O", getString(R.string.vaccin_type_1), getString(R.string.vaccin_type_2), getString(R.string.vaccin_type_3),getString(R.string.vaccin_type_1)));

            recyclerView.setAdapter(new VaccinAdapter(vaccins));
        }


    }

}
