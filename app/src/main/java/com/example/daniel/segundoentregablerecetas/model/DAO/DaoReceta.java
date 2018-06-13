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
        listaRecetas.add(new Receta("Fondue de Queso", R.drawable.im1, "250cc de vino blanco seco\n" +
                "250g (2 tazas) de queso suizo rallado\n" +
                "250g (2 tazas) de queso gruyere rallado\n" +
                "2 cucharadas de harina\n" +
                "¼ de cucharadita de sal\n" +
                "¼ cucharadita de nuez moscada\n" +
                "1 baguette cortada en cubos de 2 cm", "Preparación: 10mins  ›  Tiempo de cocción: 20mins  ›  Tiempo extra: 2mins enfriando  ›  Listo en:32mins \n" +
                "Calentar el vino en una olla de fondue o caquelon a fuego suave. Cuando comienza a hacer burbujitas en los costados, añadir el queso suizo y el queso gruyere de a 1 taza a la vez. Dejar derretir sin parar de revolver con cuchara de madera.\n" +
                "Una vez que todo el queso está derretido, agregar la harina disuelta en un poquito de agua, y mezclar para integrar bien. Condimentar con sal y nuez moscada. Servir con cubos de pan."));
        listaRecetas.add(new Receta("Pato relleno con Castañas", R.drawable.im2, "Porciones: 4 \n" +
                "Para la marinada\n" +
                "1 zanahoria, pelada y picada\n" +
                "1 puñado de perejil, picado\n" +
                "1 cebolla, picada\n" +
                "500cc de vino blanco\n" +
                "1 ramita de romero\n" +
                "2 hojas de laurel\n" +
                "1 cucharadita de granos de pimienta blanca\n" +
                "1 pato, limpio\n" +
                "Para el relleno\n" +
                "250g de castañas, tostadas y picadas finamente\n" +
                "2 rodajas de pan, tostado y en cubitos\n" +
                "1 manzana, cortada en cubos\n" +
                "1 huevo\n" +
                "1 cucharadita de estragón seco\n" +
                "sal y pimienta, a gusto\n" +
                "escarbadientes\n" +
                "2 cucharadas de aceite de uva", "Preparación: 20mins  ›  Tiempo de cocción: 1hora50mins  ›  Listo en:2horas10mins \n" +
                "Preparar la marinada mezclando todos los ingredientes juntos. Colocar el pato en un bowl grande y bañar con la marinada. Cubrir con film transparente y llevar a la heladera 12 horas.\n" +
                "Precalentar el horno a 220 *C (bien caliente). Separar una fuente para horno.\n" +
                "Para el relleno: Mezclar las castañas, las tostadas, las manzanas, el huevo y condimentar con sal, pimienta y estragón. Retirar el pato del bowl y colar la marinada reservando el líquido. Secar el pato con toallas de papel por dentro y por afuera. Condimentar con sal y pimienta, rellenar y cerrar la abertura con escarbadientes. Colocarlo sobre una fuente y llevar al horno 20 minutos hasta que esté dorado.\n" +
                "En una cacerola, calentar la marinada y usar para rociar el pato. Cubrirlo con papel de aluminio y bajar la temperatura del horno a 180 *C (moderado). Cocinar el pato 90 minutos. Destapar y dejar dorar otros 10 minutos a horno fuerte (200 *C ) para que la piel se ponga crocante. Retirar del horno, cubrir con papel aluminio nuevamente y dejar reposar 7 minutos.\n" +
                "Colar los jugos de cocción de la asadera y colocarlos en una cacerola pequeña. Condimentar con sal y pimienta. Cocinar al fuego hasta reducir y lograr una salsa. Servir la salsa con el pato."));
        listaRecetas.add(new Receta("Milhojas de Mousse de Salmon", R.drawable.im3, "Rinde: 4 \n" +
                "150 g de queso de cabra\n" +
                "1 puñado de ciboulette picada\n" +
                "1 paquete de galletitas de agua tipo obleas saladas para copetín\n" +
                "sal y pimienta a gusto\n" +
                "4 lonjas de salmón ahumado", "Preparación: 5mins  ›  Listo en:5mins \n" +
                "Picar y mezclar 3 lonjas de salmón ahumado con el queso de cabra a temperatura ambiente hasta que se hayan mezclado bien. Si tiene una procesadora, mejor todavía. Salpimentar a gusto.\n" +
                "Añadir la ciboulette picada y mezclar con un tenedor. Colocar la mousse intercalándola con las galletitas y decorar por arriba con la última tirita de salmón ahumado y ciboulette. Lista para servir."));
        listaRecetas.add(new Receta("Brochette de Mar", R.drawable.im4, "Porciones: 2 \n" +
                "1/2 Pimiento morrón amarillo\n" +
                "1/2 Pimiento morrón verde\n" +
                "1/2 Pimiento morrón rojo\n" +
                "4 Palillos de Brochette\n" +
                "1 Lata Calamares enlatados\n" +
                "1 Lata Mejillones enlatados\n" +
                "1 Cebolla\n" +
                "A gusto Sal y Pimienta", "Preparación: 3mins  ›  Tiempo de cocción: 4mins  ›  Listo en:7mins \n" +
                "Cortar la cebolla y todos los pimientos morrones en cuadrados de 2 centímetros aproximadamente.\n" +
                "Armar los brochettes intercalando los ingredientes (los langostinos doblarlos a la mitad para pincharlos) e ir acomodándolos en las 4 cavidades de la base del accesorio BroCheff.\n" +
                "Cortar el excedente del palillo, tapar hasta donde nos permita el espacio. Cocinar a potencia máxima durante unos 4 minutos.\n" +
                "Consejo\n" +
                "Degustar de a dos."));
    }

}

