package com.example.splashscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Registarse(View view) {
        Intent intent = new Intent(MainActivity.this, Registrarse.class);
        startActivity(intent);
    }

    public void iniciar_sesion(View view) {
        Intent intent = new Intent(MainActivity.this, Iniciar_Sesion.class);
        startActivity(intent);
    }

    public void inicar(View view) {
        Intent intent = new Intent(MainActivity.this, Iniciar_Luego.class);
        startActivity(intent);

    }


}

