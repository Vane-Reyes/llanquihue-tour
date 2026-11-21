package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Carga los tours desde el archivo de texto
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        // Recorre e imprime todos los tours cargados
        System.out.println("\n===== TODOS LOS TOURS =====");
        for (Tour t : tours){
            System.out.println(t);
        }

        // Filtra y muestra solo los tours con precio mayor a 15000
        System.out.println("\n=== Tours con precio mayor a $15000 ===");
        for (Tour t : tours){
            if (t.getPrecio() > 15000){
                System.out.println(t);
            }
        }
    }
}
