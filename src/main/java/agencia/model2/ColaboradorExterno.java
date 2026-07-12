package agencia.model2;

public class ColaboradorExterno implements Registrable{

    private final String nombre;

    public ColaboradorExterno(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador "+ nombre + " registrado");
    }
}
