package agencia.model2;

public class GuiaTuristico extends Persona implements Registrable{

    private final String area;

    public GuiaTuristico(String nombre, String area) {
        super(nombre);
        this.area = area;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Guia "+ getNombre() + " registrado\n" + "Area: " + area);
    }
}
