package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class pilihpola extends AppCompatActivity {

    ImageView sebelumnya, persegi, persegiPanjang, segitiga, hexagonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_pilihpola);

        sebelumnya = findViewById(R.id.sebelumnya);
        sebelumnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sebelumnya();
            }
        });
//        implicit intent persegi
        persegi = findViewById(R.id.persegi);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/drive/folders/1UVb1_4pEWee7pyVp_cWBBFuwu3-W5be7?usp=sharing";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        //        implicit intent persegi panjang
        persegiPanjang = findViewById(R.id.persegiPanjang);
        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/drive/folders/1D1yAOsGnDucZb3dkmPRV-J4QBDyqVIJ6?usp=share_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        //        implicit intent segitiga
        segitiga = findViewById(R.id.segitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/drive/folders/1qVOu0LJDO2Qbaxnkhn9-cOH2dz7cdyaB?usp=share_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        //        implicit intent hexagonal
        hexagonal = findViewById(R.id.hexagonal);
        hexagonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/drive/folders/126wJo1VsLVjS6M1medMYz9mwLaJCiPGI?usp=share_link";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });






    }

    public void sebelumnya(){
        Intent intent= new Intent(this, menu.class);
        startActivity(intent);
    }


}