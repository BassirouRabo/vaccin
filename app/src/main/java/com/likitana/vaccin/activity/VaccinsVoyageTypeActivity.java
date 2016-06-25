package com.likitana.vaccin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.likitana.vaccin.R;
import com.likitana.vaccin.object.Pays;

import java.io.Serializable;

public class VaccinsVoyageTypeActivity extends AppCompatActivity {
    private Pays pays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccins_voyage_type);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pays = (Pays)getIntent().getSerializableExtra("Pays");
    }

    public void startVaccinsVoyageOblibatoire(View view) {
        Intent intent = new Intent(getApplicationContext(), VaccinsVoyageActivity.class);
        intent.putExtra("Pays", pays);
        intent.putExtra("type", "obligatoire");
        startActivity(intent);
    }

    public void startVaccinsVoyageRecommande(View view) {
        Intent intent = new Intent(getApplicationContext(), VaccinsVoyageActivity.class);
        intent.putExtra("Pays", pays);
        intent.putExtra("type", "recommande");
        startActivity(intent);
    }
}
