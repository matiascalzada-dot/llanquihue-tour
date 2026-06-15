package agencia.model;

public class Reserva {
    private String fecha;
    private int numeroPersonas;

    public Reserva(String fecha, int numeroPersonas) {
        this.fecha = fecha;
        this.numeroPersonas = numeroPersonas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fecha='" + fecha + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                '}';
    }
}
