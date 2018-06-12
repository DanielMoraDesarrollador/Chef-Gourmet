package com.example.daniel.segundoentregablerecetas.view;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daniel.segundoentregablerecetas.R;
import com.example.daniel.segundoentregablerecetas.controller.ControllerReceta;
import com.example.daniel.segundoentregablerecetas.model.POJO.Receta;

import java.util.ArrayList;
import java.util.List;

public class ActivityDetalle extends AppCompatActivity {

    public static final String RECETA_KEY = "receta_recibida";
    public static final String POSICION_KEY = "posicion_recibida";
    private List<FragmentRecetaDetalle> fragmentRecetaDetalles;
    private ViewPager viewPager;
    private Receta receta;
    private ControllerReceta controllerReceta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        controllerReceta=new ControllerReceta();
        viewPager = findViewById(R.id.view_Pager_id);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        receta = (Receta) bundle.getSerializable(RECETA_KEY);
        crearListaDeFragment();
        AdapterViewPager adapterViewPager = new AdapterViewPager(getSupportFragmentManager(), fragmentRecetaDetalles);
        viewPager.setAdapter(adapterViewPager);
        int posicionDelItem = 0;

        for (Integer i = 0; i < controllerReceta.getListaRecetas(this).size(); i++){
            if (controllerReceta.getListaRecetas(this).get(i).equals(receta)){
                posicionDelItem = i;
                break;
            }
        }
        viewPager.setCurrentItem(posicionDelItem);
    }

    public void crearListaDeFragment() {
        fragmentRecetaDetalles = new ArrayList<>();
        List<Receta> recetas;
        recetas = controllerReceta.getListaRecetas(this);
        for (Receta listaRecorrida : recetas) {
            fragmentRecetaDetalles.add(FragmentRecetaDetalle.dameUnFragment(listaRecorrida));
        }
    }
}
