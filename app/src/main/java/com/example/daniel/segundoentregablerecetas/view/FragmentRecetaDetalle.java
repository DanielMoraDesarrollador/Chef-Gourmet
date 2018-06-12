package com.example.daniel.segundoentregablerecetas.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniel.segundoentregablerecetas.R;
import com.example.daniel.segundoentregablerecetas.model.POJO.Receta;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecetaDetalle extends Fragment {
    public static final String RECETA_KEY = "receta_recibida";
    private ImageView imageViewReceta;
    private TextView textViewTitulo;
    private TextView textViewIngredientes;
    private TextView textViewPreparacion;


    public static FragmentRecetaDetalle dameUnFragment(Receta receta) {
        FragmentRecetaDetalle fragmentRecetaDetalleCreado = new FragmentRecetaDetalle();
        Bundle bundle = new Bundle();
        bundle.putSerializable(RECETA_KEY, receta);
        fragmentRecetaDetalleCreado.setArguments(bundle);
        return fragmentRecetaDetalleCreado;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receta_detalle, container, false);
        imageViewReceta = view.findViewById(R.id.imagen_receta_detalle_id);
        textViewTitulo = view.findViewById(R.id.titulo_receta_detalle_id);
        textViewIngredientes = view.findViewById(R.id.ingredientes_receta_detalle_id);
        textViewPreparacion = view.findViewById(R.id.preparacion_receta_detalle_id);

        Bundle bundle = getArguments();
        Receta receta = (Receta) bundle.getSerializable(RECETA_KEY);
        imageViewReceta.setImageResource(receta.getFoto());
        textViewTitulo.setText(receta.getTitulo());
        textViewIngredientes.setText("Ingredientes:\n\n" + receta.getIngredientes());
        textViewPreparacion.setText("Preparación:\n" + receta.getPreparacion());

        return view;
    }

}
