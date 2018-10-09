package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_sgt (View view){
        Intent sgt = new Intent(Dashboard.this, Segitiga.class);
        startActivity(sgt);
    }

    public void jj_gj (View view){
        Intent jjgj = new Intent( Dashboard.this, jajar_genjang.class);
        startActivity(jjgj);
    }
    public void k_pp (View view){
        Intent k_pp = new Intent( Dashboard.this, keliling_pp.class);
        startActivity(k_pp);
    }

    public void k_p (View view){
        Intent k_p = new Intent(Dashboard.this, keliling_persegi.class);
        startActivity(k_p);
    }




}

