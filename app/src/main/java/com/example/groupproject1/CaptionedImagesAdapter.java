package com.example.groupproject1;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.core.content.ContextCompat.startActivity;

public class CaptionedImagesAdapter
        extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private String[] captions ;
    private int[] imageIds;
    public CaptionedImagesAdapter (String[] captions,int[] imageIds){
        this.captions = captions;
        this.imageIds = imageIds;

    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        CardView card = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_image,
                parent,
                false);

        return new ViewHolder(card);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        CardView cardView = holder.cardView;
        ImageView imageView = cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);
        imageView.setImageDrawable(dr);

        TextView  txt =(TextView) cardView.findViewById(R.id.Name);
        txt.setText(captions[position]);
        cardView.setOnClickListener((card)-> {
            Intent intent =new Intent(card.getContext(),cardDetails.class);
            intent.putExtra("Id",position);
                MainActivity.context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder (CardView cardView){
            super(cardView);
            this.cardView=cardView;
        }
    }
}
