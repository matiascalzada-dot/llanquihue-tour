package agencia.data2;

import agencia.model.servicios.PaseoLacustre;
import agencia.model.servicios.RutaGastronomica;
import agencia.model.servicios.Excursioncultural;

/**
 *  el metodo para las subclases de herencia
 */
public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica(
                        "Ruta del Salmón",
                        4,
                        "5");

        RutaGastronomica ruta2 =
                new RutaGastronomica(
                        "Sabores del Sur",
                        3,
                        "4");

        PaseoLacustre paseo1 =
                new PaseoLacustre(
                        "Lago Llanquihue",
                        2,
                        "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre(
                        "Todos los Santos",
                        5,
                        "Lancha");

        Excursioncultural excursion1 =
                new Excursioncultural(
                        "Puerto Varas Histórico",
                        3,
                        "Iglesia del Sagrado Corazón");

        Excursioncultural excursion2 = new Excursioncultural(
                "Frutillar Patrimonial",
                2,
                "Teatro del Lago");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }

}

