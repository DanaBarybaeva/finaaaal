package com.example.jihcproject2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyTViewHolder> {
    private Context context;
    private List<Mugalim> mugalimList;

    public class MyTViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout backgroundColor;
        ImageView photo;
        TextView name;
        TextView klas;
        TextView sabaq;
        public MyTViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.mugalim_name);
            klas = view.findViewById(R.id.mugalim_name_class);
            sabaq = view.findViewById(R.id.mugalim_sabaq);
            photo =  view.findViewById(R.id.film_photo);

        }
    }


    public RecyclerViewAdapter(Context context,List<Mugalim> dataList){
        this.context = context;
        this.mugalimList = dataList;
    }
    @NonNull
    @Override
    public MyTViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mugalimderitem,parent,false);
        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyTViewHolder holder, int position) {
        Mugalim item = mugalimList.get(position);


        holder.photo.setImageResource(item.getPhoto());
        holder.name.setText(item.getTitle());
        holder.klas.setText(item.getKlas());
        holder.sabaq.setText(item.getSabaq());



    }

    @Override
    public int getItemCount() {
        return mugalimList.size();
    }

}