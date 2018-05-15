package com.example.pratishparija.recycle;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.du)
    DrawerLayout drawerLayout;
    List<Movies> movies = new ArrayList<>();
    private ActionBarDrawerToggle actionBarDrawerToggle;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        ButterKnife.bind(this);
        setNavigationViewListner();
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setTitle("details");
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        movies.add(new Movies("Dear Zindagi", "Drama/Romance", "Director: Gauri Shinde", R.mipmap.dear_zindagi));
        movies.add(new Movies("Dhoom", "Crime film/Bollywood", "Director: Sanjay Gadhvi", R.mipmap.dhoom));
        movies.add(new Movies("dilwale", " Drama/Crime film", "Director: Rohit Shetty", R.mipmap.dilwale));
        movies.add(new Movies("Thor", "Fantasy/Science fiction film", "Director: Kenneth Branagh", R.mipmap.thor));
        movies.add(new Movies("Iron Man 3", "Science fiction film/Action", "Director: Shane Black", R.mipmap.ironman));
        movies.add(new Movies("Dear Zindagi", "Drama/Romance", "Director: Gauri Shinde", R.mipmap.dear_zindagi));
        movies.add(new Movies("Dhoom", "Crime film/Bollywood", "Director: Sanjay Gadhvi", R.mipmap.dhoom));
        movies.add(new Movies("dilwale", " Drama/Crime film", "Director: Rohit Shetty", R.mipmap.dilwale));
        movies.add(new Movies("Thor", "Fantasy/Science fiction film", "Director: Kenneth Branagh", R.mipmap.thor));
        movies.add(new Movies("Iron Man 3", "Science fiction film/Action", "Director: Shane Black", R.mipmap.ironman));
        movies.add(new Movies("Dear Zindagi", "Drama/Romance", "Director: Gauri Shinde", R.mipmap.dear_zindagi));
        movies.add(new Movies("Dhoom", "Crime film/Bollywood", "Director: Sanjay Gadhvi", R.mipmap.dhoom));
        movies.add(new Movies("dilwale", " Drama/Crime film", "Director: Rohit Shetty", R.mipmap.dilwale));
        movies.add(new Movies("Thor", "Fantasy/Science fiction film", "Director: Kenneth Branagh", R.mipmap.thor));
        movies.add(new Movies("Iron Man 3", "Science fiction film/Action", "Director: Shane Black", R.mipmap.ironman));
        movies.add(new Movies("Dear Zindagi", "Drama/Romance", "Director: Gauri Shinde", R.mipmap.dear_zindagi));
        movies.add(new Movies("Dhoom", "Crime film/Bollywood", "Director: Sanjay Gadhvi", R.mipmap.dhoom));
        movies.add(new Movies("dilwale", " Drama/Crime film", "Director: Rohit Shetty", R.mipmap.dilwale));
        movies.add(new Movies("Thor", "Fantasy/Science fiction film", "Director: Kenneth Branagh", R.mipmap.thor));
        movies.add(new Movies("Iron Man 3", "Science fiction film/Action", "Director: Shane Black", R.mipmap.ironman));
        movies.add(new Movies("Dear Zindagi", "Drama/Romance", "Director: Gauri Shinde", R.mipmap.dear_zindagi));
        movies.add(new Movies("Dhoom", "Crime film/Bollywood", "Director: Sanjay Gadhvi", R.mipmap.dhoom));
        movies.add(new Movies("dilwale", " Drama/Crime film", "Director: Rohit Shetty", R.mipmap.dilwale));
        movies.add(new Movies("Thor", "Fantasy/Science fiction film", "Director: Kenneth Branagh", R.mipmap.thor));
        movies.add(new Movies("Iron Man 3", "Science fiction film/Action", "Director: Shane Black", R.mipmap.ironman));
        RecyclerView recyclerView = findViewById(R.id.rec_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, movies);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void setNavigationViewListner() {
        navView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_user: {
                Intent i = new Intent(SecondActivity.this, MyTable.class);
                startActivity(i);
                break;
            }
            case R.id.nav_movies: {
                Intent i = new Intent(SecondActivity.this, TabsActivity.class);
                startActivity(i);
                break;
            }
            case R.id.nav_set: {
                Intent i = new Intent(SecondActivity.this, ScrollViewImp.class);
                startActivity(i);
                break;
            }
            case R.id.nav_report: {
                Intent i = new Intent(SecondActivity.this, Report.class);
                startActivity(i);
                break;
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
