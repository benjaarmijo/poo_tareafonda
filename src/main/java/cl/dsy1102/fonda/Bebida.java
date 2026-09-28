package cl.dsy1102.fonda;

public abstract class Bebida {

    private String nombre;
    private int volumenML;
    private int stock;

    public abstract String getTipo();

    public abstract double getPrecio();

    public abstract String getFichaDetalle();

    public Bebida(String nombre, int volumenML, int stock) {

        setNombre(nombre);
        setVolumenML(volumenML);
        setStock(stock);

    }

    public String getNombre() {
        return nombre;
    }

    public int getVolumenML() {
        return volumenML;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {

        if (stock <= 0) {
            throw new IllegalArgumentException("El stock debe ser mayor a 0");
        }
        this.stock = stock;
    }
    public void setVolumenML(int volumenML) {
        if (volumenML < 100 || volumenML > 3000) {
            throw new IllegalArgumentException("El volumen no puede ser menor a 100 ni mayor a 3000");
        }
        this.volumenML = volumenML;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacio");
        }
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Volumen: " + volumenML + " ml";
    }



}
