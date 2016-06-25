package com.likitana.vaccin.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.likitana.vaccin.R;
import com.likitana.vaccin.object.Vaccin;

public class VaccinActivity extends AppCompatActivity {
    private Vaccin vaccin;
    private TextView txtVaccinNom;
    private TextView txtVaccinNomCommercial;
    private TextView txtVaccinAbbreviation;
    private TextView txtVaccinPresentation;
    private TextView txtVaccinIndication;
    private TextView txtVaccinContreIndication;
    private TextView txtVaccinEffetSecondaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccin);

        vaccin =(Vaccin) getIntent().getSerializableExtra("Vaccin");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        assert toolbar != null;
        toolbar.setTitle(vaccin.getNom());
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtVaccinNom = (TextView)findViewById(R.id.txtVaccinNom);
        txtVaccinNomCommercial = (TextView)findViewById(R.id.txtVaccinNomCommercial);
        txtVaccinAbbreviation = (TextView)findViewById(R.id.txtVaccinAbbreviation);
        txtVaccinPresentation = (TextView)findViewById(R.id.txtVaccinPresentation);
        txtVaccinIndication = (TextView)findViewById(R.id.txtVaccinIndication);
        txtVaccinContreIndication = (TextView)findViewById(R.id.txtVaccinContreIndication);
        txtVaccinEffetSecondaire = (TextView)findViewById(R.id.txtVatxtVaccinEffetSecondaireccinNom);

    }

    @Override
    protected void onStart() {
        super.onStart();
        txtVaccinNom.setText(vaccin.getNom());
        txtVaccinNomCommercial.setText(vaccin.getNomCommercial());
        txtVaccinAbbreviation.setText(vaccin.getAbbreviation());
        txtVaccinPresentation.setText(vaccin.getPresentation());
        txtVaccinIndication.setText(vaccin.getIndication());
        txtVaccinContreIndication.setText(vaccin.getContreIndication());
        txtVaccinEffetSecondaire.setText(vaccin.getEffetSecondaire());
    }
}
