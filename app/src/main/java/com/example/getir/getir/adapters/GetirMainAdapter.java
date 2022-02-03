package com.example.getir.getir.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.getir.NextActivity;
import com.example.getir.R;
import com.example.getir.activity.SearchActivity;
import com.example.getir.getir.ItemGetirActivity;
import com.example.getir.getir.models.Main_model;

import java.util.List;

public class GetirMainAdapter extends RecyclerView.Adapter<GetirMainAdapter.ViewHolder> {

    private Context context;
    private List<Main_model> main_modelList;
    private LayoutInflater inflater;

    public GetirMainAdapter(Context context, List<Main_model> main_modelList) {
        this.context = context;
        this.main_modelList = main_modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_getir_main,parent,false);
        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(main_modelList.get(position).getImage());
        holder.text_title.setText(main_modelList.get(position).getTitle());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ItemGetirActivity.class);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return main_modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_title;
        ImageView imageView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_title = (TextView)itemView.findViewById(R.id.text_title);
            imageView = (ImageView)itemView.findViewById(R.id.image_main);
            cardView = (CardView)itemView.findViewById(R.id.item_main_getir);
        }
    }
}
