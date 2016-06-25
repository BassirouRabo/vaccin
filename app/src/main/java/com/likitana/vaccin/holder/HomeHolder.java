package com.likitana.vaccin.holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.likitana.vaccin.R;
import com.likitana.vaccin.activity.AbbreviationsActivity;
import com.likitana.vaccin.activity.ActualitesActivity;
import com.likitana.vaccin.activity.MonDossierFamilleActivity;
import com.likitana.vaccin.activity.MonProfilActivity;
import com.likitana.vaccin.activity.PaysActivity;
import com.likitana.vaccin.activity.VaccinationDefinitionActivity;
import com.likitana.vaccin.activity.VaccinsActivity;
import com.likitana.vaccin.object.Home;
import com.squareup.picasso.Picasso;

public class HomeHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private TextView txtMenuNom;
    private ImageView imgMenuIcon;

    public HomeHolder(View itemView) {
        super(itemView);

        txtMenuNom = (TextView) itemView.findViewById(R.id.txtMenuNom);
        imgMenuIcon = (ImageView) itemView.findViewById(R.id.imgMenuIcon);
        itemView.setOnClickListener(this);
    }

    public void bind(Home home) {
        txtMenuNom.setText(home.getNom());
        Picasso.with(imgMenuIcon.getContext())
                .load(home.getIcon())
                .into(imgMenuIcon);
    }



    @Override
    public void onClick(View v) {
        Home homeObject = (Home) v.getTag();
        switch (homeObject.getNom()) {
            case "Vaccination Définition":
                v.getContext().startActivity(new Intent(v.getContext(), VaccinationDefinitionActivity.class));
                break;
            case "Liste Vaccins":
                v.getContext().startActivity(new Intent(v.getContext(), VaccinsActivity.class));
                break;
            case "Vaccination voyage":
                Intent intentVaccinationVoyage = new Intent(v.getContext(), PaysActivity.class);
                intentVaccinationVoyage.putExtra("page", "Vaccination voyage");
                v.getContext().startActivity(intentVaccinationVoyage);
                break;
            case "Actualité vaccins":
                v.getContext().startActivity(new Intent(v.getContext(), ActualitesActivity.class));
                break;
            case "Calendrier vaccinal":
                Intent intentCalendrierVaccinal = new Intent(v.getContext(), PaysActivity.class);
                intentCalendrierVaccinal.putExtra("page", "Calendrier vaccinal");
                v.getContext().startActivity(intentCalendrierVaccinal);
                break;
            case "Abbréviations utilisées":
                v.getContext().startActivity(new Intent(v.getContext(), AbbreviationsActivity.class));
                break;
            case "Mon dossier famille":
                v.getContext().startActivity(new Intent(v.getContext(), MonDossierFamilleActivity.class));
                break;
            case "Mon profil":
                v.getContext().startActivity(new Intent(v.getContext(), MonProfilActivity.class));
                break;
        }
    }
}
