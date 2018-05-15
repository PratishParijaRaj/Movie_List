package com.example.pratishparija.recycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignupActivity extends AppCompatActivity {
    @BindView(R.id.input_name)
    EditText inputName;
    @BindView(R.id.input_email)
    EditText inputEmail;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.btn_signup)
    AppCompatButton btnSignup;
    @BindView(R.id.link_login)
    TextView linkLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Sign Up");
    }
    @OnClick({R.id.btn_signup, R.id.link_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_signup:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.link_login:
                Intent i=new Intent(SignupActivity.this,MainActivity.class);
                startActivity(i);
                break;
        }
    }
}
