package agencia0.model;

public class Hotel {
    private String nombre;
    private int estrellas;

    public Hotel(String nombre, int estrellas) {
        this.nombre = nombre;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", estrellas=" + estrellas +
                '}';
    }
}
