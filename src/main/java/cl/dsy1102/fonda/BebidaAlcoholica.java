package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {

    private double graduacionAlcoholica;
    private boolean certificadaProveedor;
    private boolean ventaRestringida = false;

    private static final double PRECIO_BASE = 3500;

    public BebidaAlcoholica(String nombre, int volumenML, int stock,
                            double graduacionAlcoholica, boolean certificadaProveedor) {

        super(nombre, volumenML, stock);
        setGraduacionAlcoholica(graduacionAlcoholica);
        setCertificadaProveedor(certificadaProveedor);
    }

    public double getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    @Override
    public String getTipo() {
        return "Alcoholica";
    }

    @Override
    public boolean esConsumoResponsable() {
        return ventaRestringida;
    }

    @Override
    public void restringirVenta() {
        ventaRestringida = true;
    }

    @Override
    public boolean superaMaximoPermitido(int cantidad) {
        return cantidad > MAXIMO_UNIDADES;
    }

    public double getPrecio() {
        if (certificadaProveedor) {
            return PRECIO_BASE;
        }
        else {
        return PRECIO_BASE * 1.20;
        }

    }

    @Override
    public String getFichaDetalle() {
        return "Nombre: " + getNombre()
                + " | Volumen: "  + getVolumenML()
                + " | Stock: " + getStock()
                + " | Graduacion Alcoholica: " + getGraduacionAlcoholica()
                + " | Certificado Proveedor: " + isCertificadaProveedor()
                + " | Venta Restringida: " + isVentaRestringida()
                + " | Precio: " + getPrecio();
    }

    public boolean isCertificadaProveedor() {
        return certificadaProveedor;
    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }

    public void setGraduacionAlcoholica(double graduacionAlcoholica) {
        if (graduacionAlcoholica < 0.5 || graduacionAlcoholica > 45) {
            throw new IllegalArgumentException("La graduacion alcoholica debe estar entre 0.5 y 45");
        }
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public void setCertificadaProveedor(boolean certificadaProveedor) {
        this.certificadaProveedor = certificadaProveedor;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }


}