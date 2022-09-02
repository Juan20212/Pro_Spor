package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Detalleproducto2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalleproducto2);
    }
    public void Factura(View view) {
        Intent intent = new Intent(Detalleproducto2.this,Factura.class);
        startActivity(intent);
    }
    public void favorite1(View view) {
        Intent intent = new Intent(Detalleproducto2.this, Favorite.class);
        startActivity(intent);
    }
}