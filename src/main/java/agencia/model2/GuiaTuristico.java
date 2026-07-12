package agencia.model2;

public class GuiaTuristico implements Registrable{

    private final String nombre;
    private final String area;

    public GuiaTuristico(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Guia "+ nombre + " registrado\n" + "Area: " + area);
    }
}
