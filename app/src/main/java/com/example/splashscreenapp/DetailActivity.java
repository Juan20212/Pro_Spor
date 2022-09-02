package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.splashscreenapp.model.ItemList;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private ImageView imagenItemDetail;
    private TextView tvTituloDetail;
    private TextView tvDescripcionDetail;
    private ItemList itemDetail;
    private String doamin_image = "http://10.0.2.2/prosport/drawable/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle(getClass().getSimpleName());
        initViews();
        initValues();
    }
    private void initViews() {
        imagenItemDetail = findViewById(R.id.imagenItemDetail);
        tvTituloDetail = findViewById(R.id.tvTituloDetail);
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail);
    }

    private void initValues(){
        itemDetail = (ItemList) getIntent().getExtras()
                .getSerializable("itemDetail");

        //imgItemDetail.setImageResource(Integer.parseInt(itemDetail.getImgResource()));
        Picasso.get()
                .load(doamin_image+itemDetail.getImagenResource())
                .into(imagenItemDetail);
        tvTituloDetail.setText(itemDetail.getNombre());
        tvDescripcionDetail.setText(itemDetail.getDescripcion());
    }

}