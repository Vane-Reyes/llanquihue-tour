package model;

// Representa un tour ofrecido por Llanquihue Tour
public class Tour {
    private String nombre;
    private String tipo;
    private int precio;
    //Composición: traer clase Lugar como atributo de Tour
    private Lugar lugar;

    // Constructor: inicializa los cuatro atributos del tour
    public Tour(String nombre, String tipo, int precio, Lugar lugar) {
        this.nombre = nombre;
        this.tipo = tipo;
        setPrecio(precio);
        this.lugar = lugar;
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
        if (precio < 1) {
            throw new IllegalArgumentException("El precio no puede ser menor a $1");
        }
        this.precio = precio;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    // Muestra el tour en formato legible: nombre | tipo | precio
    @Override
    public String toString() {
        return nombre + " | " + tipo + " | $" + precio + "\n" + lugar + "\n";
    }
}
