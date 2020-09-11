package com.e.gemastik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class input_datadiri extends AppCompatActivity {

    EditText edt_nama;
    EditText edt_tgl;
    RadioGroup rgKelamin;
    RadioButton rbPerempuan;
    RadioButton rbLaki;
    ImageButton ib_next;

    String var_nama,var_kelamin,var_tgllahir;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datadiri1);

        edt_nama = findViewById(R.id.edt_nama);
        edt_tgl = findViewById(R.id.edt_tgl);
        ib_next = findViewById(R.id.ib_next);
        rgKelamin = findViewById(R.id.rgKelamin);
        ib_next = findViewById(R.id.ib_next);

        ib_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var_nama = edt_nama.getText().toString();
                var_tgllahir = edt_tgl.getText().toString();
                Intent i = new Intent(input_datadiri.this, Profil.class);
                Bundle b = new Bundle();
                b.putString("parse_nama", var_nama);
                int id = rgKelamin.getCheckedRadioButtonId();
                RadioButton rgKelamin = (RadioButton) findViewById(id);
                b.putString("parse_kelamin", rgKelamin.getText().toString());
                b.putString("parse_tgllahir", var_tgllahir);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
