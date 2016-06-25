package com.likitana.vaccin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.likitana.vaccin.R;
import com.likitana.vaccin.holder.VaccinHolder;
import com.likitana.vaccin.object.Vaccin;
import java.util.List;

public class VaccinAdapter extends RecyclerView.Adapter<VaccinHolder> {
    List<Vaccin> list;

    public VaccinAdapter(List<Vaccin> list) {
        this.list = list;
    }

    @Override
    public VaccinHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_liste_1, viewGroup, false);
        return new VaccinHolder(view);
    }

    @Override
    public void onBindViewHolder(VaccinHolder vaccinHolder, int position) {
        Vaccin vaccin = list.get(position);
        vaccinHolder.bind(vaccin);
        vaccinHolder.itemView.setTag(vaccin);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
