package com.example.daniel.segundoentregablerecetas.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daniel.segundoentregablerecetas.R;
import com.example.daniel.segundoentregablerecetas.controller.ControllerReceta;
import com.example.daniel.segundoentregablerecetas.model.POJO.Receta;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentReceta extends Fragment implements AdapterReceta.NotificadorRecetaCelda {

    private List<Receta> listaRecetas;
    private RecyclerView recyclerViewReceta;
    private AdapterReceta adapterReceta;
    private NotificarReceta notificarReceta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receta, container, false);
        recyclerViewReceta = view.findViewById(R.id.recycler_id);

        ControllerReceta controllerReceta = new ControllerReceta();
        listaRecetas = controllerReceta.getListaRecetas(getActivity());

        adapterReceta = new AdapterReceta(listaRecetas, this);
        recyclerViewReceta.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerViewReceta.setHasFixedSize(true);
        recyclerViewReceta.setAdapter(adapterReceta);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        notificarReceta = (NotificarReceta) context;
    }


    @Override
    public void notificarRecetaClickeada(Receta receta, int posicion) {
        notificarReceta.notificar(receta, posicion);
    }


    public interface NotificarReceta {
        public void notificar(Receta receta, int posicion);
    }

}
