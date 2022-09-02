package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Detalleproducto4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalleproducto4);
    }
    public void Factura(View view) {
        Intent intent = new Intent(Detalleproducto4.this, Factura.class);
        startActivity(intent);
    }

    public void favorite4(View view) {
        Intent intent = new Intent(Detalleproducto4.this, Favorite.class);
        startActivity(intent);
    }
}