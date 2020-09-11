package com.e.gemastik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivityy extends AppCompatActivity {

    ImageButton btn_MK, btn_P, btn_TB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btn_MK = (ImageButton) findViewById(R.id.btn_MataKuliah);
        btn_P = (ImageButton) findViewById(R.id.btn_Profil);
        btn_TB = (ImageButton) findViewById(R.id.btn_TesBakat);

        btn_MK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(HomeActivityy.this, MataKuliah.class);
                startActivity(in);
            }
        });

        btn_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivityy.this,Profil.class);
                startActivity(i);
            }
        });

        btn_TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivityy.this,TesMB.class);
                startActivity(i);
            }
        });
    }
}
