package com.example.pratishparija.recycle;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Movie_Details extends AppCompatActivity {

    @BindView(R.id.movie_poster)
    ImageView moviePoster;
    @BindView(R.id.txttitle)
    TextView txttitle;
    @BindView(R.id.txtcat)
    TextView txtcat;
    @BindView(R.id.txtdesc)
    TextView txtdesc;

    String Title, Category, Descrioption, Rating;
    int movie_id;
    Movies movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie__details);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Movie Details");
        movie = (Movies) getIntent().getParcelableExtra("movies");
        String t = movie.getTitle();
        String c = movie.getCategory();
        String desc = movie.getDescrioption();
        int image = movie.getRating();
        txttitle.setText(t);
        txtcat.setText(c);
        txtdesc.setText(desc);
        moviePoster.setImageResource(image);
    }
}
