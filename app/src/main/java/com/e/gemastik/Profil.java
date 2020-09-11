package com.e.gemastik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Profil extends AppCompatActivity {

    TextView tv_nama,tv_ttl, tv_kelamin;
    ImageButton back;
    String get_nama,get_kelamin,get_tgllahir;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);

        back = (ImageButton) findViewById(R.id.btn_Back);
        tv_nama = findViewById(R.id.tv_nama);
        tv_ttl = findViewById(R.id.tv_ttl);
        tv_kelamin = findViewById(R.id.tv_kelamin);

        Bundle b = getIntent().getExtras();
        if (b != null)
        {
            get_nama = b.getString("parse_nama");
        }
        if (b != null)
        {
            get_kelamin = b.getString("parse_kelamin");
        }
        if (b != null)
        {
            get_tgllahir = b.getString("parse_tgllahir");
        }

        tv_nama.setText(""+get_nama);
        tv_ttl.setText(""+get_tgllahir);
        tv_kelamin.setText(""+get_kelamin);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profil.this,HomeActivityy.class);
                startActivity(i);
            }
        });
    }
}
