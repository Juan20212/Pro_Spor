package com.example.splashscreenapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

public
class Iniciar_Sesion extends AppCompatActivity{

    EditText t_email, t_pass;
    String str_email,str_pass;
    String url="http://10.0.2.2/login_/login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        t_email=findViewById(R.id.txttemail);
        t_pass=findViewById(R.id.txtpass);
    }

    public void login(View view){
        if(t_email.getText().toString().equals("")){
            Toast.makeText(this,"ingrese correo", Toast.LENGTH_SHORT).show();
        }else if (t_pass.getText().toString().equals("")){
            Toast.makeText(this,"ingrese pass", Toast.LENGTH_SHORT).show();
        }else {
            final ProgressDialog progressDialog=new ProgressDialog(this);
            progressDialog.setMessage("por favor espere");
            progressDialog.show();


            str_email=t_email.getText().toString().trim();
            str_pass=t_pass.getText().toString().trim();

            StringRequest request =new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();

                    if (response.equalsIgnoreCase("ingreso correctamente")) {
                        t_email.setText("");
                        t_pass.setText("");
                        startActivity(new Intent(getApplicationContext(), Iniciar_Luego.class));
                    } else {
                        Toast.makeText(Iniciar_Sesion.this, response, Toast.LENGTH_SHORT).show();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(Iniciar_Sesion.this,error.getMessage().toString(),Toast.LENGTH_SHORT).show();

                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params=new HashMap<>();
                    params.put("email",str_email);
                    params.put("password",str_pass);
                    return params;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(Iniciar_Sesion.this);
            requestQueue.add(request);
        }
    }
    public void registro (View view){
        startActivity(new Intent(getApplicationContext(),Registrarse.class));
        finish();
    }
}
