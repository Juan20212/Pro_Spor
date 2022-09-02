package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Detalleproducto extends AppCompatActivity {
    private ImageButton btnCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalleproducto);
        btnCar = findViewById(R.id.buttoncar);
    }

    public void Factura(View view) {
        Intent intent = new Intent(Detalleproducto.this, Factura.class);
        startActivity(intent);
    }

    public void favorite(View view) {
        Intent intent = new Intent(Detalleproducto.this, Favorite.class);
        startActivity(intent);
    }
}