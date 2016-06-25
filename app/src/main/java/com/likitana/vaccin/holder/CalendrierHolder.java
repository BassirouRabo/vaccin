package com.likitana.vaccin.holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.likitana.vaccin.R;
import com.likitana.vaccin.activity.CalendrierActivity;
import com.likitana.vaccin.object.Calendrier;

import java.io.Serializable;


public class CalendrierHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView txtCalendrierPeriode;

    public CalendrierHolder(View itemView) {
        super(itemView);

        txtCalendrierPeriode = (TextView) itemView.findViewById(R.id.txtCalendrierPeriode);

        itemView.setOnClickListener(this);
    }

    public void bind(Calendrier calendrier) {
        txtCalendrierPeriode.setText(calendrier.getPeriode());
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext().getApplicationContext(), CalendrierActivity.class);
        intent.putExtra("Calendrier", (Serializable) v.getTag());
        v.getContext().startActivity(intent);
    }
}
