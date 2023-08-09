package domain;

/**
 *
 * @author angel
 */

public class Imagen {
    private Integer altura;
    private Integer ancho;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen() {
    }

    public Imagen(Integer altura, Integer ancho, String nombre) {
        this.altura = altura;
        this.ancho = ancho;
        this.nombre = nombre;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Imagen{" + "altura=" + altura + ", ancho=" + ancho + ", nombre=" + nombre + '}';
    }
}
