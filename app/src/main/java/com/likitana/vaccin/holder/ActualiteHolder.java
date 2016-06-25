package com.likitana.vaccin.holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.likitana.vaccin.R;
import com.likitana.vaccin.activity.ActualiteActivity;
import com.likitana.vaccin.object.Actualite;

import java.io.Serializable;


public class ActualiteHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView txtActualiteJour;
    private TextView txtActualiteTitre;
    private TextView txtActualiteIntroduction;

    public ActualiteHolder(View itemView) {
        super(itemView);
        txtActualiteJour = (TextView) itemView.findViewById(R.id.txtActualiteJour);
        txtActualiteTitre = (TextView) itemView.findViewById(R.id.txtActualiteTitre);
        txtActualiteIntroduction = (TextView) itemView.findViewById(R.id.txtActualiteIntroduction);

        itemView.setOnClickListener(this);

    }

    public void bind(Actualite actualite) {
        txtActualiteJour.setText(actualite.getJour().toString());
        txtActualiteTitre.setText(actualite.getTitre());
        txtActualiteIntroduction.setText(actualite.getIntroduction());
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext().getApplicationContext(), ActualiteActivity.class);
        intent.putExtra("Actualite", (Serializable) v.getTag());
        v.getContext().startActivity(intent);
    }
}
