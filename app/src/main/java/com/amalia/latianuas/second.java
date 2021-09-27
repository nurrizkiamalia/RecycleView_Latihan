package com.amalia.latianuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class second extends AppCompatActivity {

    ImageView img;
    TextView txt1, txt2;

    String data1, data2;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        img = findViewById(R.id.gambar2);
        txt1 = findViewById(R.id.juduldetail);
        txt2 = findViewById(R.id.descdetail);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("image") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            image = getIntent().getIntExtra("image",1);
        } else{
            Toast.makeText(this,"Data perlu dimasukkan",Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        txt1.setText(data1);
        txt2.setText(data2);
        img.setImageResource(image);
    }
}