package agencia.model2;

public class PaseoLacustre extends ServicioTuristico{
    private final String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
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
