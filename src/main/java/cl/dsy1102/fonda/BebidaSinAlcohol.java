package cl.dsy1102.fonda;


public class BebidaSinAlcohol extends Bebida{

    private double contenidoAzucar;
    private static final double PRECIO_BASE = 2000;

    public BebidaSinAlcohol(String nombre, int volumenML, int stock, double contenidoAzucar) {
        super(nombre, volumenML, stock);
        setContenidoAzucar(contenidoAzucar);

    }
    @Override
    public String getTipo() {
        return "SinAlcohol";

    }

    @Override
    public String getFichaDetalle() {
        return "Nombre: " + getNombre()
                + " | Volumen: " + getVolumenML()
                + " | Stock: " + getStock()
                + " | Contenido de Azucar: " + getContenidoAzucar()
                + " | Precio: " + getPrecio();
    }

    public double getContenidoAzucar() {
        return contenidoAzucar;
    }

    public void setContenidoAzucar(double contenidoAzucar) {
        this.contenidoAzucar = contenidoAzucar;
    }

    public double getPrecio() {
        if (contenidoAzucar > 80) {
            return PRECIO_BASE * 1.10;
        } else {
            return PRECIO_BASE;
        }
    }
}
