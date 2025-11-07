package com.example.zadanie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int wyswietlaneZdj=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
            Button nastepneZdj = findViewById(R.id.next);
            Button poprzednieZdj = findViewById(R.id.prev);
            EditText ktoreZdj = findViewById(R.id.ktoryObraz);
            ImageView zdjecie = findViewById(R.id.imageView);
            Switch rozoweTlo = findViewById(R.id.tloRozowe);
            LinearLayout main = findViewById(R.id.main);

            ArrayList<Integer> zdjecia = new ArrayList<>();


        zdjecia.add(R.drawable.zdj1);
        zdjecia.add(R.drawable.zdj2);
        zdjecia.add(R.drawable.zdj3);
        zdjecia.add(R.drawable.zdj4);

        int iloscZdjec = zdjecia.size();
        nastepneZdj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wyswietlaneZdj<zdjecia.size()-1){
                    wyswietlaneZdj++;
                    zdjecie.setImageResource(zdjecia.get(wyswietlaneZdj));
                } else if (wyswietlaneZdj==zdjecia.size()-1) {
                    zdjecie.setImageResource(zdjecia.get(0));
                    wyswietlaneZdj=0;
                }
            }
        });

    }
}