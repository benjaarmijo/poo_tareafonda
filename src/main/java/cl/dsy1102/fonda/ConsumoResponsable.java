package cl.dsy1102.fonda;

public interface ConsumoResponsable {

    int MAXIMO_UNIDADES = 3;

    public boolean esConsumoResponsable();

    public void restringirVenta();

    public boolean superaMaximoPermitido(int cantidad);
}
