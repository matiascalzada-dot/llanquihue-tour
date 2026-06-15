package agencia.model;


// Usaremos tour para crear los objetos
public class Tour {
    private String lugar;
    private int precio;
    private int duracionDias;
// Constructor
    public Tour(String lugar, int precio, int duracionDias) {
        this.lugar = lugar;
        this.precio = precio;
        this.duracionDias = duracionDias;
    }
// getters and setters
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }
//toString
    @Override
    public String toString() {
        return "Tour" + "\n" +
                "lugar = " + lugar + "\n" +
                "precio = " + precio + "\n" +
                "Dias = " + duracionDias + "\n";
    }
}
