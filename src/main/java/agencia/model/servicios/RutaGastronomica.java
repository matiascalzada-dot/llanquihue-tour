package agencia.model.servicios;

public class RutaGastronomica extends ServicioTuristico{
    private final String numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, String numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarDatosBase(){
        super.mostrarDatosBase();
        System.out.println("N° paradas: " + numeroDeParadas);
    }

    @Override
    public String toString() {
        return "RutaGastronomica" +
                 "\n nombre: " + nombre +
                "\n duracion: " + duracionHoras +
                "\n N° paradas: " + numeroDeParadas;
    }

}
