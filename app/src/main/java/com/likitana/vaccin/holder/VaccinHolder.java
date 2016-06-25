package com.likitana.vaccin.holder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.likitana.vaccin.R;
import com.likitana.vaccin.activity.VaccinActivity;
import com.likitana.vaccin.object.Vaccin;

import java.io.Serializable;


public class VaccinHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView txtNom;

    public VaccinHolder(View itemView) {
        super(itemView);

        txtNom = (TextView)itemView.findViewById(R.id.txtNom);

        itemView.setOnClickListener(this);
    }

    public void bind(Vaccin vaccin){
        txtNom.setText(vaccin.getNom());
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext().getApplicationContext(), VaccinActivity.class);
        intent.putExtra("Vaccin", (Serializable) v.getTag());
        v.getContext().startActivity(intent);
    }
}
