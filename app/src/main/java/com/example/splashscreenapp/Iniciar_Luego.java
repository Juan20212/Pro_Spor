package com.example.splashscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;


public class Iniciar_Luego extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_luego);





    }


    public void vista(View view) {
        Intent intent = new Intent(Iniciar_Luego.this, Detalleproducto.class);
        startActivity(intent);
    }

    public void vista2(View view) {
        Intent intent = new Intent(Iniciar_Luego.this, Detalleproducto2.class);
        startActivity(intent);
    }

    public void vista3(View view) {
        Intent intent = new Intent(Iniciar_Luego.this, Detalleproducto3.class);
        startActivity(intent);
    }

    public void vista4(View view) {
        Intent intent = new Intent(Iniciar_Luego.this, Detalleproducto4.class);
        startActivity(intent);
    }




    public void onClick(View view) {
        Intent intent = new Intent(Iniciar_Luego.this, Activity_Cuenta.class);
        startActivity(intent);
    }

    public void Busqueda(View view) {
        Intent intent = new Intent(Iniciar_Luego.this,MainActivity_.class);
        startActivity(intent);
    }


    public void menu5(View view) {
        Intent intent = new Intent(Iniciar_Luego.this,Menu5.class);
        startActivity(intent);
    }
}



