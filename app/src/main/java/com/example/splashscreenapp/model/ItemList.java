package com.example.splashscreenapp.model;

import java.io.Serializable;

public class ItemList implements Serializable {
    private String nombre;
    private String descripcion;
    private String imagen;

    public ItemList(String nombre, String descripcion, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagenResource() {
        return imagen;
    }
}

