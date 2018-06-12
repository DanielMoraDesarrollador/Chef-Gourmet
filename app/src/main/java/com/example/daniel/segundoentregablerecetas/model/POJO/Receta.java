package com.example.daniel.segundoentregablerecetas.model.POJO;

import java.io.Serializable;
import java.util.Objects;

public class Receta implements Serializable {

    private String titulo;
    private Integer foto;
    private String ingredientes;
    private String preparacion;

    public Receta(String titulo, Integer foto, String ingredientes, String preparacion) {
        this.titulo = titulo;
        this.foto = foto;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getFoto() {
        return foto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receta receta = (Receta) o;
        return this.titulo.equals(receta.titulo) && this.preparacion.equals(receta.preparacion);
    }

}
