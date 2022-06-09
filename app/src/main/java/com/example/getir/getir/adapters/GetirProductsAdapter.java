package com.example.getir.getir.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.getir.R;
import com.example.getir.getir.models.GetirProduct_model;
import com.example.getir.getir.tabfragments.ItemDetailActivity;

import java.util.List;

public class GetirProductsAdapter  extends RecyclerView.Adapter<GetirProductsAdapter.ViewHolder>{

    private Context context;
    private List<GetirProduct_model> getirProduct_modelList;

    public GetirProductsAdapter(Context context, List<GetirProduct_model> getirProduct_modelList) {
        this.context = context;
        this.getirProduct_modelList = getirProduct_modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_getir_products,parent,false);
        GetirProductsAdapter.ViewHolder viewHolder = new GetirProductsAdapter.ViewHolder(rowView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(getirProduct_modelList.get(position).getImgproduct());
        holder.text_title.setText(getirProduct_modelList.get(position).getTitle());
        holder.text_cost.setText(getirProduct_modelList.get(position).getCost());
        holder.text_weight.setText(getirProduct_modelList.get(position).getWeight());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra("title",getirProduct_modelList.get(position).getTitle());
                intent.putExtra("cost",getirProduct_modelList.get(position).getCost());
                intent.putExtra("weight",getirProduct_modelList.get(position).getWeight());
                intent.putExtra("image",getirProduct_modelList.get(position).getImgproduct());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getirProduct_modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_title, text_cost, text_weight;
        ImageView imageView ;
        ImageButton minus_product;
        CardView add_products, cardview_add;
        RelativeLayout cardView, expandi ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_title = (TextView)itemView.findViewById(R.id.text_title_product);
            text_cost = (TextView)itemView.findViewById(R.id.text_cost);
            text_weight = (TextView)itemView.findViewById(R.id.text_weight) ;
            imageView = (ImageView)itemView.findViewById(R.id.image_main_product);
            cardView = (RelativeLayout) itemView.findViewById(R.id.item_product_getir);
            expandi = (RelativeLayout) itemView.findViewById(R.id.expandable_view);
            add_products = (CardView) itemView.findViewById(R.id.product_add);
            cardview_add = (CardView) itemView.findViewById(R.id.card_view_add);
            minus_product = (ImageButton) itemView.findViewById(R.id.minus_product_getir);


            add_products.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (expandi.getVisibility() == View.GONE){
                        TransitionManager.beginDelayedTransition(cardview_add, new AutoTransition());
                        expandi.setVisibility(View.VISIBLE);
                    }
                        minus_product.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                TransitionManager.beginDelayedTransition(cardview_add, new AutoTransition());
                                expandi.setVisibility(View.GONE);
                            }
                        });

                    }

            });

        }
    }
}
