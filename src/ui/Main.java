package ui;

import data.GestorDatos;
import service.TourService;

public class Main {
    public static void main(String[] args) {
        // Carga los tours desde el archivo de texto
        TourService gestor = new TourService();

        try {
            gestor.agregarTodos(new GestorDatos().cargarTours("resources/tours.txt"));
            // Recorre e imprime todos los tours cargados
            System.out.println("\n===== TODOS LOS TOURS =====\n");
            for (var tour : gestor.listar()) System.out.println(tour);

            // Filtra y muestra solo los tours con precio mayor a 15000
            System.out.println("=== Tours con precio mayor a $15000 ===\n");
            for (var tour : gestor.filtrarPorPrecio(15000)) System.out.println(tour);

            //Buscar tour por su nombre
            System.out.println("===BUSQUEDA SENDERO PETROHUE===");
            System.out.println(gestor.buscar("Sendero Petrohue"));
        }catch (Exception e){
            System.out.println("No fue posible cargar el listado: " + e.getMessage());
        }
    }
}

