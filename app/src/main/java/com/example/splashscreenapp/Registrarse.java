package com.example.splashscreenapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Registrarse extends AppCompatActivity {
    EditText t_nombre, t_email, t_pass;
    Button b_insertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        t_nombre=findViewById(R.id.txtnombre);
        t_email=findViewById(R.id.txtemail);
        t_pass=findViewById(R.id.txtpass);
        b_insertar=findViewById(R.id.btnregistro);

        b_insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertarDatos();
            }
        });

    }

    private void insertarDatos() {
        final String nombre=t_nombre.getText().toString().trim();
        final String email=t_email.getText().toString().trim();
        final String password=t_pass.getText().toString().trim();

        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("cargando");

        if(nombre.isEmpty()){
            t_nombre.setError("complete los campos");
            return;
        }else if(email.isEmpty()){
            t_email.setError("complete los campos");
            return;
        }
        else {
            progressDialog.show();
            StringRequest request = new StringRequest(Request.Method.POST, "http://10.0.2.2/login_/insertar.php", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equalsIgnoreCase("registro correctamente")) {
                        Toast.makeText(Registrarse.this, "datos insertados", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();

                        Intent intent = new Intent(Registrarse.this, Iniciar_Sesion.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Registrarse.this, response, Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        Toast.makeText(Registrarse.this, "No se pudo insertar", Toast.LENGTH_SHORT).show();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(Registrarse.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String,String>params= new HashMap<>();
                    params.put("nombre",nombre);
                    params.put("email",email);
                    params.put("password",password);
                    return params;
                }
            };

            RequestQueue requestQueue= Volley.newRequestQueue(Registrarse.this);
            requestQueue.add(request);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void login (View view){
        startActivity(new Intent(getApplicationContext(),Iniciar_Sesion.class));
        finish();
    }
}