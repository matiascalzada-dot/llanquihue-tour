package agencia.model2;

public class RutaGastronomica extends ServicioTuristico{
    private final String numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, String numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("N° paradas: " + numeroDeParadas);
    }

    @Override
    public String toString() {
        return "\n RutaGastronomica" +
                 "\n nombre: " + nombre +
                "\n duracion: " + duracionHoras +
                "\n N° paradas: " + numeroDeParadas;
    }

}
