package com.example.zadanie;

import android.os.Bundle;
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


    }
}