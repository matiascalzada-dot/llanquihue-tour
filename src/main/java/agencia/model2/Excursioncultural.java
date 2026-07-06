package agencia.model2;

public class Excursioncultural extends ServicioTuristico{
    private final String lugarHistorico;

    public Excursioncultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Lugar historico: " + lugarHistorico);
    }
    @Override
    public String toString() {
        return "Excursioncultural" +
                "\n nombre: " + nombre +
                "\n duracion: " + duracionHoras +
                "\n lugar historico: " + lugarHistorico;
    }
}
