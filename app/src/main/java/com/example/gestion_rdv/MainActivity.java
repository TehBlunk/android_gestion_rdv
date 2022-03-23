package com.example.gestion_rdv;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    class TacheAsync extends AsyncTask<String, Integer, String> {
        private String method;
        private String url1 = "http://192.168.1.12:8000/api/";
        @Override
        protected String doInBackground (String... arg0){
            String aRetourner ="";
            URL url2;
            StringBuffer leBuffer=new StringBuffer (aRetourner);
            method = arg0[0];
            switch(arg0[0]){
                case "POST":
                    try{

                        url2 = new URL (url1+"login");
                        HttpURLConnection conn = (HttpURLConnection) url2.openConnection();

                        conn.setRequestMethod("POST");
                        conn.setDoInput(true);
                        conn.setDoOutput(true);
                        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                        OutputStream outputPost = conn.getOutputStream();
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputPost,"UTF-8"));
                        String query = new JSONStringer().object().key("username").value(arg0[1]).key("password").value(arg0[2])
                                .endObject().toString();
                        writer.write(query);
                        writer.flush();
                        writer.close();
                        outputPost.close();
                        conn.connect();
                        int codeResponse = conn.getResponseCode();
                        if (codeResponse == HttpURLConnection.HTTP_OK){
                            InputStream leFluxEntree = new BufferedInputStream(conn.getInputStream());
                            BufferedReader leLecteur = new BufferedReader(new InputStreamReader(leFluxEntree));
                            String laLigne = leLecteur.readLine();
                            while (laLigne!= null){
                                leBuffer.append(laLigne);
                                leBuffer.append("\n");
                                laLigne=leLecteur.readLine();
                            }
                            aRetourner = leBuffer.toString();
                            JSONObject token = new JSONObject(aRetourner);
                            aRetourner = token.getString("token");

                        }
                    }catch(Exception e){
                        e.printStackTrace();
                        aRetourner = "ERREUR ";
                    }
                    break;
            }
            return aRetourner;
        }

        @Override
        protected void onPostExecute(String pResult){
            super.onPostExecute(pResult);
            switch(method){
                case "POST":
                    //Intent Patient = new Intent(MainActivity.this, Patient.class);
                    EditText login = findViewById(R.id.txtLogin);
                    TextView erreur = findViewById(R.id.erreur);
                    if(pResult != null){
                        /*Patient.putExtra("token",pResult);
                        Patient.putExtra("login",login.getText());
                        startActivity(Patient);*/
                        erreur.setText(/*login.getText()*/pResult.toString());
                    }else{
                        erreur.setText("Erreur le clown");
                    }
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button conn = findViewById(R.id.btnConn);
        conn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                EditText login = findViewById(R.id.txtLogin);
                EditText mdp = findViewById(R.id.txtMdp);
                TextView erreur = findViewById(R.id.erreur);
                MainActivity.TacheAsync maTache = new MainActivity.TacheAsync();
                if(login.getText().toString() != null && mdp.getText().toString() != null){
                    maTache.execute("POST",login.getText().toString(), mdp.getText().toString());
                }else{
                    erreur.setText("OH le clown");
                }
            }
        });
    }
}