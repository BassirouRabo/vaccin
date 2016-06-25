package com.likitana.vaccin.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.likitana.vaccin.R;
import com.likitana.vaccin.holder.HomeHolder;
import com.likitana.vaccin.object.Home;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeHolder>{
    List<Home> list;

    public HomeAdapter(List<Home> list) {
        this.list = list;
    }

    @Override
    public HomeHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_home, viewGroup, false);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeHolder homeHolder, int position) {
        Home home = list.get(position);
        homeHolder.bind(home);
        homeHolder.itemView.setTag(home);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
