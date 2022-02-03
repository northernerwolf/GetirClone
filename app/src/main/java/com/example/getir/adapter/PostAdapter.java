package com.example.getir.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.getir.NextItem;
import com.example.getir.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    private List<NextItem> nextItems = new ArrayList<>();


    public PostAdapter(List<NextItem> nextItems) {
        this.nextItems = nextItems;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.next_item, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.postImgVieww.setImageResource(nextItems.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return nextItems.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder{

        RoundedImageView postImgVieww;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImgVieww = itemView.findViewById(R.id.imagepost);
    }}
}
