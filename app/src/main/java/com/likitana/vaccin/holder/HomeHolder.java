package com.likitana.vaccin.holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.likitana.vaccin.R;
import com.likitana.vaccin.activity.AboutActivity;
import com.likitana.vaccin.activity.AbreviationsActivity;
import com.likitana.vaccin.activity.ActualitesActivity;
import com.likitana.vaccin.activity.MonDossierFamilleActivity;
import com.likitana.vaccin.activity.MonProfilActivity;
import com.likitana.vaccin.activity.VaccinationDefinitionActivity;
import com.likitana.vaccin.activity.VaccinsActivity;
import com.likitana.vaccin.activity.VaccinsCalendrierActivity;
import com.likitana.vaccin.activity.VaccinsVoyageActivity;
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
                v.getContext().startActivity(new Intent(v.getContext(), VaccinsVoyageActivity.class));
                break;
            case "Actualité vaccins":
                v.getContext().startActivity(new Intent(v.getContext(), ActualitesActivity.class));
                break;
            case "Calendrier vaccinal":
                v.getContext().startActivity(new Intent(v.getContext(), VaccinsCalendrierActivity.class));
                break;
            case "Abréviations utilisées":
                v.getContext().startActivity(new Intent(v.getContext(), AbreviationsActivity.class));
                break;
            case "Mon dossier famille":
                v.getContext().startActivity(new Intent(v.getContext(), MonDossierFamilleActivity.class));
                break;
            case "Mon profil":
                v.getContext().startActivity(new Intent(v.getContext(), MonProfilActivity.class));
                break;
            case "A propos":
                v.getContext().startActivity(new Intent(v.getContext(), AboutActivity.class));
                break;
        }
    }
}
