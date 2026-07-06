package agencia.data2;

import agencia.model2.PaseoLacustre;
import agencia.model2.RutaGastronomica;
import agencia.model2.Excursioncultural;
import agencia.model2.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;


public class GestorServicios {

    private final List<ServicioTuristico> Servicios;


    public List<ServicioTuristico> getServicios() {
        return Servicios;
    }

    public GestorServicios() {


        Servicios = new ArrayList<>();

        Servicios.add(new RutaGastronomica(
                "Ruta del Salmón",
                4,
                "5"));

        Servicios.add(new RutaGastronomica(
                "Sabores del Sur",
                3,
                "4"));

        Servicios.add(new PaseoLacustre(
                "Lago Llanquihue",
                2,
                "Catamarán"));

        Servicios.add(new PaseoLacustre(
                "Todos los Santos",
                5,
                "Lancha"));

        Servicios.add(new Excursioncultural(
                "Puerto Varas Histórico",
                3,
                "Iglesia del Sagrado Corazón"));

        Servicios.add(new Excursioncultural(
                "Frutillar Patrimonial",
                2,
                "Teatro del Lago"));
    }


        }





