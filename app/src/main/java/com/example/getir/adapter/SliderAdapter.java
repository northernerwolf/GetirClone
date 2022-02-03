package com.example.getir.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.getir.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.ViewHolder> {

    int[] image;

    public SliderAdapter(int[] image){
        this.image = image;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        viewHolder.image_slider.setImageResource(image[position]);

    }

    @Override
    public int getCount() {
        return image.length;
    }

    public class ViewHolder extends SliderViewAdapter.ViewHolder{

        ImageView image_slider;
        public ViewHolder(View itemView) {
            super(itemView);
            image_slider = itemView.findViewById(R.id.image_view_slider);
        }
    }
}
