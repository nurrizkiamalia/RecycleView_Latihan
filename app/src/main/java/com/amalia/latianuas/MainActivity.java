package com.amalia.latianuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    String s1[], s2[];
    int img[] = {R.drawable.flutter,R.drawable.laravel,R.drawable.react,R.drawable.unity,R.drawable.unrealengine};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recycleView);

        s1 = getResources().getStringArray(R.array.edukasi);
        s2 = getResources().getStringArray(R.array.deskripsi);

        adapter myadapter = new adapter(this, s1, s2, img);
        recyclerview.setAdapter(myadapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}