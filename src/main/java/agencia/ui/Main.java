package agencia.ui;
import agencia.data.GestorDatos;
import agencia.model.Tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();

        List<Tour> misTours = gestor.listaTours("AT.txt");

        if (misTours.isEmpty()) {
            System.out.println("No se encontraron datos en el archivo 'AT'.");
        } else {
        int diasLimite = 15;
        List<Tour> tourFiltrados = gestor.filtroDias(misTours, diasLimite);
        System.out.println("--- Tours cargados desde el archivo AT");
        for (Tour t : misTours) {
            System.out.println(t);
        }
            System.out.println("==== tour con mas de " + diasLimite+ " dias: =====\n");
        if (tourFiltrados.isEmpty()) {
            System.out.println("no se ha encontrado un tour con mas de " + diasLimite);
        }else{
            for (Tour t : tourFiltrados){
                System.out.println(t);
            }
        }

    }
    }
}