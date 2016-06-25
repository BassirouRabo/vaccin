package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.likitana.vaccin.R;
import com.likitana.vaccin.adapter.PaysAdapter;
import com.likitana.vaccin.object.Pays;
import java.util.ArrayList;
import java.util.List;

public class PaysActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Pays> pays = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (savedInstanceState == null) {
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            pays.add(new Pays("Afrique du Sud"));
            pays.add(new Pays("Albanie"));
            pays.add(new Pays("Algérie"));
            pays.add(new Pays("Allemagne"));
            pays.add(new Pays("Angola"));
            pays.add(new Pays("Arabie saoudite"));
            pays.add(new Pays("Argentine"));
            pays.add(new Pays("Arménie"));
            pays.add(new Pays("Australie"));
            pays.add(new Pays("Autriche"));
            pays.add(new Pays("Azerbaïdjan"));
            pays.add(new Pays("Bahamas"));
            pays.add(new Pays("Bahreïn"));
            pays.add(new Pays("Bangladesh"));
            pays.add(new Pays("Belgique"));

            recyclerView.setAdapter(new PaysAdapter(pays));
        }
    }



}
