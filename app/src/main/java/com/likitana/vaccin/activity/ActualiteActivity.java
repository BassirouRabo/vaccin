package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.likitana.vaccin.R;
import com.likitana.vaccin.object.Actualite;

public class ActualiteActivity extends AppCompatActivity {
    private Actualite actualite;
    private TextView txtActualiteJour;
    private TextView txtActualiteTItre;
    private TextView txtActualiteActualite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualite);

        actualite = (Actualite) getIntent().getSerializableExtra("Actualite");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtActualiteJour = (TextView) findViewById(R.id.txtActualiteJour);
        txtActualiteTItre = (TextView) findViewById(R.id.txtActualiteTItre);
        txtActualiteActualite = (TextView) findViewById(R.id.txtActualiteActualite);

        if (savedInstanceState == null && actualite != null) {
            txtActualiteJour.setText(actualite.getJour());
            txtActualiteTItre.setText(actualite.getTitre());
            txtActualiteActualite.setText(actualite.getActualite());
        }
    }

}
