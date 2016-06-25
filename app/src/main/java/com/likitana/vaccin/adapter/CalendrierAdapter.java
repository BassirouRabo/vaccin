package com.likitana.vaccin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.likitana.vaccin.R;
import com.likitana.vaccin.holder.CalendrierHolder;
import com.likitana.vaccin.object.Calendrier;

import java.util.List;


public class CalendrierAdapter extends RecyclerView.Adapter<CalendrierHolder> {
    List<Calendrier> list;

    public CalendrierAdapter(List<Calendrier> list) {
        this.list = list;
    }

    @Override
    public CalendrierHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_calendrier, viewGroup, false);
        return new CalendrierHolder(view);
    }

    @Override
    public void onBindViewHolder(CalendrierHolder calendrierHolder, int position) {
        Calendrier calendrier = list.get(position);
        calendrierHolder.bind(calendrier);
        calendrierHolder.itemView.setTag(calendrier);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
