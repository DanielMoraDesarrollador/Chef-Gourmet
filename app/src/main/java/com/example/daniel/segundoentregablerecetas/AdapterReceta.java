package com.example.daniel.segundoentregablerecetas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterReceta extends RecyclerView.Adapter {

    private List<Receta> listaRecetas;
    private NotificadorRecetaCelda notificadorRecetaCelda;

    public AdapterReceta(List<Receta> listaRecetas, NotificadorRecetaCelda notificadorRecetaCelda) {
        this.listaRecetas = listaRecetas;
        this.notificadorRecetaCelda = notificadorRecetaCelda;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.celda_recycler_view_receta, parent, false);
        AdapterReceta.ViewHolderReceta viewHolderReceta = new ViewHolderReceta(view);
        return viewHolderReceta;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Receta receta = listaRecetas.get(position);
        ViewHolderReceta viewHolderReceta = (ViewHolderReceta) holder;
        viewHolderReceta.cargarReceta(receta);

    }

    @Override
    public int getItemCount() {
        if (listaRecetas != null) {
            return listaRecetas.size();
        } else {
            return 0;
        }
    }

    public class ViewHolderReceta extends RecyclerView.ViewHolder {

        private TextView textViewTitulo;
        private ImageView imagenReceta;

        public ViewHolderReceta(View itemView) {
            super(itemView);
            this.textViewTitulo = itemView.findViewById(R.id.titulo_receta_pequena_id);
            this.imagenReceta = itemView.findViewById(R.id.imagen_receta_pequena_id);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int posicionRecetaClickeada = getAdapterPosition();
                    Receta receta = listaRecetas.get(posicionRecetaClickeada);
                    notificadorRecetaCelda.notificarRecetaClickeada(receta,posicionRecetaClickeada);
                }
            });

        }

        public void cargarReceta(Receta receta) {
            textViewTitulo.setText(receta.getTitulo());
            imagenReceta.setImageResource(receta.getFoto());
        }
    }

    public interface NotificadorRecetaCelda {
        public void notificarRecetaClickeada(Receta receta, int posicion);
    }
}
