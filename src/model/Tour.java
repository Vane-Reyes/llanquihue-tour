package model;

// Representa un tour ofrecido por Llanquihue Tour
public class Tour {
    private String nombre;
    private String tipo;
    private int precio;

    // Constructor: inicializa los tres atributos del tour
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Muestra el tour en formato legible: nombre | tipo | precio
    @Override
    public String toString() {
        return nombre + " | " + tipo + " | $" + precio;
    }
}
