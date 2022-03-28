package com.example.gestion_rdv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Accueil extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        String token = getIntent().getExtras().getString("token");
        String login = getIntent().getExtras().getString("login");

        TextView txtConnexion = findViewById(R.id.txtConnexion);
        txtConnexion.setText("Connecté en tant que "+login);

        Button demande = findViewById(R.id.DemandeRdv);
        demande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Log.d("mesMessages","ici");
               Intent DemandeRdv = new Intent(Accueil.this, DemandeRdv.class);
                DemandeRdv.putExtra("token",token);
                DemandeRdv.putExtra("login",login);
                startActivity(DemandeRdv);
            }
        });

        Button afficherRdvs = findViewById(R.id.AfficherRdvs);
        afficherRdvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent AfficherRdvs = new Intent(Accueil.this, AfficherRdvs.class);
                AfficherRdvs.putExtra("token",token);
                AfficherRdvs.putExtra("login",login);
                startActivity(AfficherRdvs);
            }
        });

        Button AfficherRdv = findViewById(R.id.AfficherRdv);
        AfficherRdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent AfficherRdv = new Intent(Accueil.this, AfficherRdv.class);
                AfficherRdv.putExtra("token",token);
                AfficherRdv.putExtra("login",login);
                startActivity(AfficherRdv);
            }
        });

        Button AnnulerRdv = findViewById(R.id.AnnulerRdv);
        AnnulerRdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent AnnulerRdv = new Intent(Accueil.this, AnnulerRdv.class);
                AnnulerRdv.putExtra("token",token);
                AnnulerRdv.putExtra("login",login);
                startActivity(AnnulerRdv);
            }
        });

        ImageFilterButton deco = findViewById(R.id.btnDeco);
        Intent MainActivity = new Intent(Accueil.this, MainActivity.class);
        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(MainActivity);
            }
        });


    }
}