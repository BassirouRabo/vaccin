package com.likitana.vaccin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.likitana.vaccin.R;
import com.likitana.vaccin.holder.PaysHolder;
import com.likitana.vaccin.object.Pays;
import java.util.List;


public class PaysAdapter  extends RecyclerView.Adapter<PaysHolder>{
    List<Pays> list;

    public PaysAdapter(List<Pays> list) {
        this.list = list;
    }

    @Override
    public PaysHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_liste_1, viewGroup, false);
        return new PaysHolder(view);
    }

    @Override
    public void onBindViewHolder(PaysHolder paysHolder, int position) {
        Pays pays = list.get(position);
        paysHolder.bind(pays);
        paysHolder.itemView.setTag(pays);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
