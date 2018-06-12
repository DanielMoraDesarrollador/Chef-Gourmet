package com.example.daniel.segundoentregablerecetas.model.DAO;

import android.content.Context;

import com.example.daniel.segundoentregablerecetas.R;
import com.example.daniel.segundoentregablerecetas.model.POJO.Receta;

import java.util.ArrayList;
import java.util.List;

public class DaoReceta {

    private List<Receta> listaRecetas;

    public List<Receta> obtenerRecetas(Context context) {
        armarListaRecetas();
        return listaRecetas;
    }

    private void armarListaRecetas() {
        listaRecetas = new ArrayList<>();
        listaRecetas.add(new Receta("Pollo al Curry estilo Tai", R.drawable.r1, "2 cucharaditas de aceite de oliva\n" +
                "½ kg de pechugas de pollo sin piel, cortadas en cubos de 1 cm\n" +
                "1 cucharada de pasta de curry rojo tailandés\n" +
                "2 zucchinis medianos, cortados en rodajas\n" +
                "1 pimiento rojo sin semillas y cortado en tiras\n" +
                "1 zanahoria mediana, cortada en rodajas\n" +
                "1 cebolla partida en cuartos y luego a la mitad\n" +
                "1 cucharada de fécula de maíz\n" +
                "400 ml de leche de coco\n" +
                "2 cucharadas de albahaca tailandesa picada", "Calentar el aceite en una sartén grande a fuego medio-alto. Agregar el pollo y dejar que se cocine por unos 3 minutos. Agregar la pasta de curry, los zucchinis, el pimiento, la zanahoria y la cebolla. Revolver bien mientras se cocina por unos minutos.\n" +
                "Disolver la maicena en la leche de coco, y luego verter ésto al sartén. Dejar que hierva, y luego bajar el fuego y cocinar por unos minutos. Antes de servir, añadir las hojas de albahaca."));
        listaRecetas.add(new Receta("Pechugas de Pollo rellenas al verdeo", R.drawable.r2, "4 pechugas de pollo sin piel\n" +
                "1 cucharadita de orégano\n" +
                "2 cucharadas de queso Parmesano rallado\n" +
                "1 atado de cebolla de verdeo picada\n" +
                "4 cucharadas de mozzarella rallada\n" +
                "sal y pimienta a gusto\n" +
                "2 cucharadas de aceite de oliva\n" +
                "150 gr de morrones en aceite (al escabeche)", "Precalentar el horno a 175 C (moderado). Cortar las pechugas de pollo a la mitad a lo largo, que una vez abierta la pechuga, parecerá como una mariposa. Colocar las pechugas entre dos hojas de papel film y golpear las pechugas con un martillo para tiernizar carne.. Realizar este procedimiento con todas las pechugas. Reservar.\n" +
                "Mezclar el queso parmesano con el orégano y la cebolla de verdeo picada y espolvorear sobre las pechugas de pollo. En uno de los pvordes de la pechuga colocar 3 tiritas de morrón en aceite y cubrir con una cucharada de la mozzarella. Enrollar la pechuga, comenzando por el lado de los morrones y la mozzarella. Cerrar los rollitos con escarbadientes para que no se desarmen. Colocar en una asadera para horno. Salpimentar a gusto y rociar con aceite de oliva.\n" +
                "Llevar al horno por 15 minutos y luego ponerlas a la parrilla y continuar su cocción por 5 a 10 minutos más. Retirar del horno y cortar en el plato, para que se vea el relleno al servir."));
        listaRecetas.add(new Receta("Souffle de Queso", R.drawable.r3, "30 gr de manteca\n" +
                "3 cucharadas de harina\n" +
                "250 cc de leche\n" +
                "200 gr de queso Gruyere rallado\n" +
                "3 huevos", "Precalentar el horno a 180°C (moderado).\n" +
                "Derretir la manteca en una sartén mediana y añadir la harina. Mezclar bien hasta que la mezcla se empiece a pegar y formar una bola. Agregar la leche de a poco.\n" +
                "Incorporar el queso Gruyere rallado y cocinar a fuego bajito por 5 minutos. Retirar del fuego. Añadir las yemas de 1 a la vez.\n" +
                "Batir las claras a nieve e incorporarlas de a poco en forma envolvente a la preparación anterior.\n" +
                "Enmantecar un molde para soufflé y verter la preparación. Llevar al horno por 30 minutos.\n" +
                "Servir INMEDIATAMENTE ya que el soufflé se va a desinflar si espera mucho tiempo."));
        listaRecetas.add(new Receta("Camarones en manteca y ajo", R.drawable.r4, "280g de manteca\n" +
                "2 cucharadas de mostaza de Dijon\n" +
                "½ limón, exprimido\n" +
                "2 dientes de ajo, picados\n" +
                "½ ramo de perejil, picado\n" +
                "1 kg de camarones frescos con cola, pelados y desvenados", "Precalentar el horno a 230 C (bien caliente).\n" +
                "Mezclar la manteca, mostaza, jugo de limón, ajo y perejil en una sartén pequeña a fuego medio. Retirar del fuego cuando la manteca se haya derretido completamente.\n" +
                "Acomodar los camarones en una asadera y verter la mezcla de manteca por encima. Llevar al horno.\n" +
                "Hornear 15 minutos o hasta que los camarones estén rosados."));
        listaRecetas.add(new Receta("Bife a la Wellington", R.drawable.r5, "1.5 kg de bife de chorizo\n" +
                "4 cucharadas de manteca blanda\n" +
                "2 cucharadas de manteca\n" +
                "1 cebolla mediana picada\n" +
                "1/2 taza de champignones fileteados\n" +
                "60 gr de paté\n" +
                "2 cucharadas de manteca blanda\n" +
                "sal y pimienta a gusto\n" +
                "2 masas de pascualina cuadradas\n" +
                "1 yema de huevo batida\n" +
                "375 ml de caldo de carne\n" +
                "2 cucharadas de vino tinto", "Precalentar el horno a 230 C (muy fuerte). Colocar los bifes en una asadera, y bañarlos con 2 cucharadas de manteca blanda. Cocinar por 10 a 15 minutos, o hasta que estén dorados. Retirar de la asadera, dejar enfriar y juntar los jugos de la cocción y reservar.\n" +
                "Derretir 2 cucharadas de manteca en un sartén a fuego mediano. Saltear las cebollas con los champignones por 5 minutos. Retirar del fuego y dejar enfriar.\n" +
                "Mezclar el paté con la manteca restante, y salpimentar a gusto.\n" +
                "Untar los bifes con la mezcla de paté. Cubrirlos con las cebollas y champignones cocidos.\n" +
                "Estirar la masa de hojaldre y colocar el bife en el centro y doblar la masa y cerrar los bordes. Asegúrese que los bordes no sean muy grandes ni gruesos.\n" +
                "Colocar el bife en una placa para horno con papel manteca. Hacer unos pequeños cortes en la masa de hojaldre en forma diagonal y pintar con la yema de huevo batida.\n" +
                "Cocinar en el horno precalentado por 10 minutos, y luego bajar el horno a 200 C (Moderado/Fuerte) por 10 a 15 minutos más, o hasta que la masa esté bien dorada.\n" +
                "Colocar en un sartén a fuego mediano/fuerte los jugos de la cocción de los bifes que había reservado anteriormente: . Agregar el caldo de carne y el vino tinto. Dejar hervir por 10 a 15 minutos. Pasar por un colador y servir con el bife. Delicioso."));
    }

}

