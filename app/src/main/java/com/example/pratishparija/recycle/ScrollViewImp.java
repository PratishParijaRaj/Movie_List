package com.example.pratishparija.recycle;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;

import butterknife.BindView;

public class ScrollViewImp extends AppCompatActivity {
    Toolbar toolbar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        toolbar=findViewById(R.id.tool_bar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
}
