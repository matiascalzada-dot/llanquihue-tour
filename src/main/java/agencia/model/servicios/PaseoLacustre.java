package agencia.model.servicios;

public class PaseoLacustre extends ServicioTuristico{
    private final String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarDatosBase(){
        super.mostrarDatosBase();
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
    }
    @Override
    public String toString() {
        return "PaseoLacustre" +
                "\n nombre: " + nombre +
                "\n duracion: " + duracionHoras +
                "\n Tipo de embarcacion: " + tipoEmbarcacion;
    }
}
