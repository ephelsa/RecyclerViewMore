package com.ingdisconsistemas.teach;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private List<RecyclerModel> modelList;
    private Context context = null;

    public RecyclerAdapter(List<RecyclerModel> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_mcard, parent, false);

        ViewHolder holder = new ViewHolder(itemView);
        context = parent.getContext();

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerAdapter.ViewHolder holder, int position) {

        Drawable photo = modelList.get(position).getPhoto();
        final String name = modelList.get(position).getName();

        if (photo == null)
            holder.photo.setImageResource(R.drawable.ic_launcher_background);
        else
            holder.photo.setImageDrawable(photo);

        holder.name.setText(name);

        if (position == 3) {
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, name, Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    /*
     * Esta clase se encarga de controlar los ELEMENTOS DE LA VISTA DEL CARDVIEW.
     */

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView photo;
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.mCardView);
            photo = itemView.findViewById(R.id.photo);
            name = itemView.findViewById(R.id.name);
        }
    }
}
