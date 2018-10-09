package com.example.ridorianto.bangun_datar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class keliling_persegi extends AppCompatActivity {
    EditText s;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);
        //Deklarasi yang dikaitkan dengan id file xml
        s = (EditText) findViewById(R.id.editText7);
        b = (Button) findViewById(R.id.button6);
        hasil = (TextView) findViewById(R.id.textView18);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(s.length()== 0 ){
                    Toast.makeText(getApplication(),"alas dan tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiAlas = s.getText().toString();
                    double f = Double.parseDouble(isiAlas);
                    double hs = segitiga (f);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double segitiga(double f){return f*4;}
}