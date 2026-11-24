package data;

import model.Lugar;
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

                try {

                    // Separa cada línea en sus tres campos usando ";"
                    String[] datos = linea.split(";");
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);// convierte texto a número
                    if (precio <= 0) throw new IllegalArgumentException();
                    String comuna = datos[3];
                    String coordenadas = datos[4];
                    String referencia = datos[5];


                    // Crea el objeto Tour y lo agrega a la colección
                    tours.add(new Tour(nombre, tipo, precio, new Lugar(comuna, coordenadas, referencia)));
                }catch (IllegalArgumentException e){
                    System.out.println("\nLínea con datos inválidos, se omite: " + linea);

                }

            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return tours;
    }
}