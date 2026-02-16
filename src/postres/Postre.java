package postres;

public class Postre {

    private String nombre;
    private double precio;
    private int cant;

    public Postre() {
    }

    public Postre(String nombre, double precio, int cant) {
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setCant(cant);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Tipo de postre " + nombre + ", precio : " + precio + ", cantidad : " + cant;
    }

    

}
