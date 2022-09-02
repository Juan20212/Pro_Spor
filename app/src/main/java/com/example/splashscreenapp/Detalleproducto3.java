package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Detalleproducto3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalleproducto3);
    }
    public void Factura(View view) {
        Intent intent = new Intent(Detalleproducto3.this, Factura.class);
        startActivity(intent);
    }
    public void favorite3(View view) {
        Intent intent = new Intent(Detalleproducto3.this, Favorite.class);
        startActivity(intent);

    }
}