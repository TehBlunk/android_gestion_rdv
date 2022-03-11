package com.example.gestion_rdv;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    Button conn = findViewById(R.id.btnConn);
    conn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            EditText login = findViewById(R.id.txtLogin);
            EditText mdp = findViewById(R.id.txtMdp);
            String sLogin = login.getText().toString();
            String sMdp = mdp.getText().toString();
        }
    });

    public void onClick(View v){

    }
}