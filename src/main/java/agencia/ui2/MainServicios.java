package agencia.ui2;

import agencia.data2.GestorServicios;
import agencia.model2.ServicioTuristico;



public class MainServicios {
    public static void main(String[] args) {


        GestorServicios gestor = new GestorServicios();

        System.out.println();
        System.out.println("========SERVICIOS========");

        for (ServicioTuristico servicio : gestor.getServicios()) {


            servicio.mostrarInformacion();
        }
    }
}

