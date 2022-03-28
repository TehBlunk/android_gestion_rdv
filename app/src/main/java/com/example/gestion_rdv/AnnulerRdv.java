package com.example.gestion_rdv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnnulerRdv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annuler_rdv);

        String token = getIntent().getExtras().getString("token");
        String login = getIntent().getExtras().getString("login");

        TextView txtConnexion = findViewById(R.id.txtConnexion);
        txtConnexion.setText("Connecté en tant que "+login);

        ImageFilterButton retour = findViewById(R.id.btnRetour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                AnnulerRdv.this.finish();
            }
        });

        ImageFilterButton deco = findViewById(R.id.btnDeco);
        Intent MainActivity = new Intent(AnnulerRdv.this, MainActivity.class);
        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(MainActivity);
            }
        });
    }
}