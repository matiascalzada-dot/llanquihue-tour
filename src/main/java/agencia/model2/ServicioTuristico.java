package agencia.model2;

/**
 * Clase Padre
 */
public class ServicioTuristico {
    protected String nombre;
    protected int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }



    public void mostrarInformacion(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("Duración: " + duracionHoras);
    }

    @Override
    public String toString() {
        return "\n ServicioTuristico" +
                "\n nombre: " + nombre +
                "\n duracion: " + duracionHoras;
    }
}
