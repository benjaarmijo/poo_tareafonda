package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {

    private List<Bebida> bebidas;

    public GestorFonda() {
        bebidas = new ArrayList<>();

    }

    public void registrarBebida(Bebida bebida) {
        bebidas.add(bebida);

        System.out.println("Registrando bebida: " + bebida.getNombre());
    }

    public List<Bebida> buscarBebidas(String criterio) {
        List<Bebida> resultado = new ArrayList<>();

        for (Bebida bebida : bebidas) {
            if (bebida.getNombre().equals(criterio)) {
                resultado.add(bebida);
            }
        }
        return resultado;
    }

    public void venderBebida(String nombre, int cantidad) {
        List<Bebida> resultado = buscarBebidas(nombre);

        if (resultado.isEmpty()) {
            System.out.println("No se encontro el bebida " + nombre);
        }
        else {
            Bebida bebida = resultado.get(0);

            if (cantidad > bebida.getStock()) {
                System.out.println("No hay suficiente stock");
                return;
            }

            if (bebida instanceof ConsumoResponsable) {
                ConsumoResponsable consumo = (ConsumoResponsable) bebida;

                if (consumo.esConsumoResponsable()) {
                    System.out.println("Venta Rechazada");
                    return;
                }

                if (consumo.superaMaximoPermitido(cantidad)) {
                    System.out.println("Venta Rechazada: supera el maximo permitido");
                    return;
                }

            }

            bebida.setStock(bebida.getStock() - cantidad);

            double total = bebida.getPrecio() * cantidad;

            System.out.println("Total a pagar: " + total);

        }





    }








}
