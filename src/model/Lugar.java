package model;

//Clase Lugar, que tiene atributos para especificar ubicación
//Se utilizará como atributo en la clase Tour
public class Lugar {
    private String comuna;
    private String coordenada;
    private String referencia;

    //Constructor con atributos
    public Lugar(String comuna, String coordenada, String referencia) {
        this.comuna = comuna;
        this.coordenada = coordenada;
        this.referencia = referencia;
    }

    //Constructor por defecto
    public Lugar(){

    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "-----Información del Lugar-----\n" +
                "Comuna: " + comuna + '\n' +
                "Coordenada: " + coordenada + '\n' +
                "Referencia: " + referencia;
    }
}
