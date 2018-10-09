package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class keliling_pp extends AppCompatActivity{
    EditText p, l;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keliling_pp);
        //Deklarasi yang dikaitkan dengan id file xml
        p = (EditText) findViewById(R.id.editText5);
        l = (EditText) findViewById(R.id.editText6);
        b = (Button) findViewById(R.id.button4);
        hasil = (TextView) findViewById(R.id.textView15);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(p.length()== 0 && l.length()== 0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(p.length() == 0){
                    Toast.makeText(getApplication(), "alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(l.length() == 0){
                    Toast.makeText(getApplication(), "tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiPanjang = p.getText().toString();
                    String isiLebar = l.getText().toString();
                    double p = Double.parseDouble(isiPanjang);
                    double l = Double.parseDouble(isiLebar);
                    double hs = segitiga (p,l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double segitiga(double p, double l){return p + l *2;
    }

}


