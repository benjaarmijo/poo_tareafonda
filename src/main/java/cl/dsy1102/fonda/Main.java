package cl.dsy1102.fonda;

import java.util.List;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {

        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        GestorFonda gestor = new GestorFonda();

        BebidaAlcoholica chicha = new BebidaAlcoholica("Chicha", 1000, 40, 12.0, false);
        BebidaAlcoholica piscoSour = new BebidaAlcoholica("Pisco Sour", 500, 25, 18.0, true);
        BebidaSinAlcohol chichaSinAlcohol = new BebidaSinAlcohol("Chicha", 1000, 60, 95);
        BebidaSinAlcohol moteConHuesillo = new BebidaSinAlcohol("Mote Con Huesillo", 400, 50, 70);
        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        chicha.restringirVenta();
        // TODO 3: registrarlas todas en el gestor.
        gestor.registrarBebida(chicha);
        gestor.registrarBebida(piscoSour);
        gestor.registrarBebida(chichaSinAlcohol);
        gestor.registrarBebida(moteConHuesillo);
        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        gestor.venderBebida("Pisco Sour", 2);
        gestor.venderBebida("Pisco Sour", 5);
        gestor.venderBebida("Chicha", 1);
        gestor.venderBebida("Mote Con Huesillo", 6);
        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.
        List<Bebida> resultados = gestor.buscarBebidas("Chicha");
        for (Bebida bebida : resultados) {
            System.out.println(bebida);
        }

    }
}
