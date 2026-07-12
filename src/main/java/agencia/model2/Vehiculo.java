package agencia.model2;

public class Vehiculo implements Registrable{
    private final String marca;
    private final String paisOrigen;


    public Vehiculo(String marca, String paisOrigen) {
        this.marca = marca;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Vehiculo "+ marca + " registrado\n" + "Pais Origen: " + paisOrigen);
    }
}
