package agencia.model.servicios;

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



    public void mostrarDatosBase(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras);
    }

    @Override
    public String toString() {
        return "ServicioTuristico" +
                "\n nombre: " + nombre +
                "\n duracion: " + duracionHoras;
    }
}
