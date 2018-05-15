package com.example.pratishparija.recycle;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.user_name)
    EditText userName;
    @BindView(R.id.passcode)
    EditText passcode;
    @BindView(R.id.prefData)
    TextView prefData;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.signup)
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Login Page");
    }

    public void save() {
        SharedPreferences sharedPreferences = getSharedPreferences("UserName", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", userName.getText().toString());
        editor.putString("password", passcode.getText().toString());
        editor.commit();
    }

    String name;

    public void load() {
        SharedPreferences sharedPreferences = getSharedPreferences("UserName", Context.MODE_PRIVATE);
        name = sharedPreferences.getString("name", "Pratish");
        sharedPreferences.getString("password", "Pratish");

    }

    @OnClick({R.id.btn, R.id.btn2,R.id.signup})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn: {
                save();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn2: {
                load();
                prefData.setText(name);
                break;
            }
            case R.id.signup: {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
