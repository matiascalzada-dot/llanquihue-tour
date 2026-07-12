package agencia.model2;

public class ColaboradorExterno extends Persona implements Registrable{

    private String edad;

    public ColaboradorExterno(String nombre) {
        super(nombre);
    }
    public ColaboradorExterno(String nombre, String edad) {
        super(nombre);
        this.edad = edad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador "+ getNombre() + " registrado");
    }
}
