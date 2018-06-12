package com.example.daniel.segundoentregablerecetas.controller;

import android.content.Context;

import com.example.daniel.segundoentregablerecetas.model.DAO.DaoReceta;
import com.example.daniel.segundoentregablerecetas.model.POJO.Receta;

import java.util.List;

public class ControllerReceta {

    public List<Receta> getListaRecetas(Context context) {
        DaoReceta daoReceta = new DaoReceta();
        List<Receta> list = daoReceta.obtenerRecetas(context);
        return list;
    }
}
