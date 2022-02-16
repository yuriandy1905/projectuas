package com.dendytrinanda.twicert;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView txt_profile_name;
    Button btn_logout, exit, gejala;

    SharedPreferences sharedpreferences;
    Intent intent;


    @Override

        public void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            txt_profile_name = (TextView) findViewById(R.id.txt_profile_name);
            txt_profile_name.setText(getIntent().getExtras().get("name").toString());

        gejala = (Button) findViewById (R.id.gejala);
        gejala.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                //setContentView(R.layout.gejala);
                startActivity (new Intent ("com.dendytrinanda.twicert.GEJALA"));
            }
        });

            btn_logout = (Button) findViewById(R.id.btn_logout);
            btn_logout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    logout();
                }

            });





        }

        private void logout () {
            sharedpreferences = getSharedPreferences(
                    LoginActivity.my_shared_preferences, Context.MODE_PRIVATE);

            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putBoolean(LoginActivity.session_status, false);
            editor.putString(LoginActivity.TAG_ID, null);
            editor.putString(LoginActivity.TAG_EMAIL, null);
            editor.putString(LoginActivity.TAG_NAME, null);
            editor.putString(LoginActivity.TAG_PHONE, null);
            editor.commit();

            intent = new Intent(MainActivity.this, LoginActivity.class);
            finish();
            startActivity(intent);
        }

        public void kembali (View v){
            finish();
        }
    }
