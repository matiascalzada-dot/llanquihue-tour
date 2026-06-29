package agencia.model.servicios;

public class Excursioncultural extends ServicioTuristico{
    private final String lugarHistorico;

    public Excursioncultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarDatosBase(){
        super.mostrarDatosBase();
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
