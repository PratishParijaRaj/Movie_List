package com.example.pratishparija.recycle;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

private Context context;
private List<Movies> moviesList;

    public RecyclerViewAdapter(Context context, List<Movies> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        view=layoutInflater.inflate(R.layout.card_view_movies,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.textView.setText(moviesList.get(position).getTitle());
        holder.imageView.setImageResource(moviesList.get(position).getRating());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movies click=moviesList.get(position);
                Intent intent=new Intent(context,Movie_Details.class);
                intent.putExtra("movies",(Parcelable) click);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return moviesList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.text_view);
            imageView=itemView.findViewById(R.id.image_view);
            cardView =itemView.findViewById(R.id.cardview_id);
        }
    }
}
