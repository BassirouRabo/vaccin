package com.likitana.vaccin.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.likitana.vaccin.R;
import com.likitana.vaccin.object.Abbreviation;

public class AbbreviationHolder extends RecyclerView.ViewHolder {
    private TextView txtAbbreviationAbbreviation;
    private TextView txtAbbreviationNom;

    public AbbreviationHolder(View itemView) {
        super(itemView);
        txtAbbreviationAbbreviation = (TextView) itemView.findViewById(R.id.txtAbbreviation);
        txtAbbreviationNom = (TextView) itemView.findViewById(R.id.txtAbbreviationNom);
    }

    public void bind(Abbreviation abbreviation) {
        txtAbbreviationAbbreviation.setText(abbreviation.getAbbreviation());
        txtAbbreviationNom.setText(abbreviation.getNom());
    }
}
