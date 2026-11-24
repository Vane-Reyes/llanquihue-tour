package service;

import model.Tour;

import java.util.ArrayList;
import java.util.List;

//Clase que centraliza las operaciones sobre la lista de tours
public class TourService {

    private final List<Tour> tours = new ArrayList<>();

    //Método para cargar los tours en el servicio
    public void agregarTodos(List<Tour> nuevos){
        tours.addAll(nuevos);
    }

    //Método para devolver el listado de todos los tours
    public List<Tour> listar(){
        return new ArrayList<>(tours);
    }

    //Método para buscar tours por su nombre
    public Tour buscar (String nombre){
        for (Tour tour : tours){
            if (tour.getNombre().equalsIgnoreCase(nombre)) return tour;
        }
        return null;
    }

    //Método para filtrar tours por precio
    public List<Tour> filtrarPorPrecio(int minima){
        List<Tour> resultado = new ArrayList<>();
        for (Tour tour : tours){
            if (tour.getPrecio() > minima) resultado.add(tour);
        }
        return resultado;
    }
}
