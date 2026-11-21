package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Se encarga de leer el archivo de datos y convertirlo en objetos Tour
public class GestorDatos {
    public ArrayList<Tour> cargarTours(String ruta) {
        ArrayList<Tour> tours = new ArrayList<>();
        // Lee el archivo línea por línea
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                // Separa cada línea en sus tres campos usando ";"
                String[] datos = linea.split(";");
                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);// convierte texto a número
                // Crea el objeto Tour y lo agrega a la colección
                tours.add(new Tour(nombre, tipo, precio));
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return tours;
    }
}

