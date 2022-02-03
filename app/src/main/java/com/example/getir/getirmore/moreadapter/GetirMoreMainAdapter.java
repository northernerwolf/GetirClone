package com.example.getir.getirmore.moreadapter;

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

import com.example.getir.R;
import com.example.getir.getir.ItemGetirActivity;
import com.example.getir.getir.models.Main_model;
import com.example.getir.getirmore.moremodels.Main_model_more;

import java.util.List;

public class GetirMoreMainAdapter extends RecyclerView.Adapter<GetirMoreMainAdapter.ViewHolder> {

    private Context context;
    private List<Main_model_more> main_model_more;
    private LayoutInflater inflater;

    public GetirMoreMainAdapter(Context context, List<Main_model_more> main_model_more) {
        this.context = context;
        this.main_model_more = main_model_more;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_getirmore_main,parent,false);
        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(main_model_more.get(position).getImage());
        holder.text_title.setText(main_model_more.get(position).getTitle());
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
        return main_model_more.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_title;
        ImageView imageView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_title = (TextView)itemView.findViewById(R.id.text_title_more);
            imageView = (ImageView)itemView.findViewById(R.id.image_main_more);
            cardView = (CardView)itemView.findViewById(R.id.item_main_getirmore);
        }
    }
}
