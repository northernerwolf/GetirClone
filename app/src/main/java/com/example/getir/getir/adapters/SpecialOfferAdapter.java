package com.example.getir.getir.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.getir.R;
import com.example.getir.getir.models.GetirProduct_model;
import com.example.getir.getir.models.Special_offer_model;

import java.util.List;

public class SpecialOfferAdapter extends RecyclerView.Adapter<SpecialOfferAdapter.ViewHolder>{

    private Context context;
    private List<Special_offer_model> special_offer_modelList;

    public SpecialOfferAdapter(Context context, List<Special_offer_model> special_offer_modelList) {
        this.context = context;
        this.special_offer_modelList = special_offer_modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_getir_products,parent,false);
        SpecialOfferAdapter.ViewHolder viewHolder = new SpecialOfferAdapter.ViewHolder(rowView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(special_offer_modelList.get(position).getImgproduct());
        holder.text_title.setText(special_offer_modelList.get(position).getTitle());
        holder.text_cost.setText(special_offer_modelList.get(position).getCost());
        holder.text_weight.setText(special_offer_modelList.get(position).getWeight());

    }

    @Override
    public int getItemCount() {
        return special_offer_modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_title, text_cost, text_weight;
        ImageView imageView;
        //        CardView cardView;
        RelativeLayout cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_title = (TextView)itemView.findViewById(R.id.text_title_product);
            text_cost = (TextView)itemView.findViewById(R.id.text_cost);
            text_weight = (TextView)itemView.findViewById(R.id.text_weight) ;
            imageView = (ImageView)itemView.findViewById(R.id.image_main_product);
            cardView = (RelativeLayout) itemView.findViewById(R.id.item_product_getir);
        }
    }
}
