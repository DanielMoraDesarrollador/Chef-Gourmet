package com.example.daniel.segundoentregablerecetas.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

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
    private EditText buscador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receta, container, false);
        recyclerViewReceta = view.findViewById(R.id.recycler_id);
        buscador = view.findViewById(R.id.buscador_id);

        buscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

        ControllerReceta controllerReceta = new ControllerReceta();
        listaRecetas = controllerReceta.getListaRecetas(getActivity());

        adapterReceta = new AdapterReceta(listaRecetas, this);
        recyclerViewReceta.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerViewReceta.setHasFixedSize(true);
        recyclerViewReceta.setAdapter(adapterReceta);

        return view;
    }

    private void filter(String texto) {
        ArrayList<Receta> listaAFiltrar = new ArrayList<>();
        for (Receta receta : listaRecetas) {
            if (receta.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                listaAFiltrar.add(receta);
            }
        }
        adapterReceta.listaFiltro(listaAFiltrar);
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
