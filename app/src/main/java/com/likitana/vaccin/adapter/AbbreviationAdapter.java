package com.likitana.vaccin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.likitana.vaccin.R;
import com.likitana.vaccin.holder.AbbreviationHolder;
import com.likitana.vaccin.object.Abbreviation;

import java.util.List;


public class AbbreviationAdapter extends RecyclerView.Adapter<AbbreviationHolder> {
    List<Abbreviation> list;

    public AbbreviationAdapter(List<Abbreviation> list) {
        this.list = list;
    }

    @Override
    public AbbreviationHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_abbreviation, viewGroup, false);
        return new AbbreviationHolder(view);
    }

    @Override
    public void onBindViewHolder(AbbreviationHolder abbreviationHolder, int position) {
        Abbreviation abbreviation = list.get(position);
        abbreviationHolder.bind(abbreviation);
        abbreviationHolder.itemView.setTag(abbreviation);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
