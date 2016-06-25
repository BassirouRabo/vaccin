package com.likitana.vaccin.holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.likitana.vaccin.R;
import com.likitana.vaccin.activity.VaccinsVoyageActivity;
import com.likitana.vaccin.activity.VaccinsVoyageTypeActivity;
import com.likitana.vaccin.object.Pays;
import java.io.Serializable;


public class PaysHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView txtNom;

    public PaysHolder(View itemView) {
        super(itemView);

        txtNom = (TextView)itemView.findViewById(R.id.txtNom);

        itemView.setOnClickListener(this);
    }

    public void bind(Pays pays){
        txtNom.setText(pays.getNom());
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext().getApplicationContext(), VaccinsVoyageTypeActivity.class);
        intent.putExtra("Pays", (Serializable) v.getTag());
        v.getContext().startActivity(intent);
    }
}
