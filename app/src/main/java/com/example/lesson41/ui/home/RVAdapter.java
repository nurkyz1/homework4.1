package com.example.lesson41.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson41.R;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVViewHolder> {
    ArrayList<ItemModel> list= new ArrayList();
    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list,parent,false);
        return new RVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder holder, int position) {
holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class RVViewHolder extends RecyclerView.ViewHolder{

    public RVViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void onBind(ItemModel itemModel){

    }
}
class  ItemModel{

}

