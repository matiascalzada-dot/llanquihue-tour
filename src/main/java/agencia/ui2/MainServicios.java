package agencia.ui2;

import agencia.data2.GestorEntidades;
import agencia.model2.ColaboradorExterno;
import agencia.model2.GuiaTuristico;
import agencia.model2.Vehiculo;

import javax.swing.*;


public class MainServicios {
    public static void main(String[] args) {


        GestorEntidades gestor = new GestorEntidades();


        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""" 
                    LLANQUIHUE TOUR APP
                    
                    1. Agregar Guia
                    2. Agregar Vehiculo
                    3. Agregar Colaborador
                    4. Mostrar entidades
                    5. Salir
                    """));

            switch (opcion) {
                case 1 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre del guia: ");
                    String area = JOptionPane.showInputDialog("Area del guia: ");

                    gestor.agregarEntidad(new GuiaTuristico(nombre, area));
                }
                case 2 -> {
                    String marca = JOptionPane.showInputDialog("Marca del vehiculo: ");
                    String paisOrigen = JOptionPane.showInputDialog("Pais de origen: ");

                    gestor.agregarEntidad(new Vehiculo(marca, paisOrigen));
                }
                case 3 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre del colaborador: ");
                    gestor.agregarEntidad(new ColaboradorExterno(nombre));
                }
                case 4 -> {
                    gestor.mostrarEntidades();
                    JOptionPane.showInputDialog(null,"Mostrando listado en consola");
                }

            }
        }while (opcion != 5);

    }
}

