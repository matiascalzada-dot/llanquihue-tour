package agencia.data2;

import agencia.model2.ColaboradorExterno;
import agencia.model2.GuiaTuristico;
import agencia.model2.Registrable;
import agencia.model2.Vehiculo;

import java.util.ArrayList;


public class GestorEntidades {


    private final ArrayList<Registrable> registro;

    public GestorEntidades() {
        registro = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        registro.add(entidad);
    }



    public void mostrarEntidades() {

        for (Registrable entidad : registro) {

            entidad.mostrarResumen();

            if (entidad instanceof GuiaTuristico) {
                System.out.println("Tipo: Guía Turístico");
            } else if (entidad instanceof Vehiculo) {
                System.out.println("Tipo: Vehículo");
            } else if (entidad instanceof ColaboradorExterno) {
                System.out.println("Tipo: Colaborador Externo");
            }

            System.out.println("-----------------------");
        }
    }

}

