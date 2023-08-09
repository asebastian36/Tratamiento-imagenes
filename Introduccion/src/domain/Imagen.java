package domain;

/**
 *
 * @author angel
 */

public class Imagen {
    private Integer altura;
    private Integer ancho;
    private String nombre;
    
    //  segun el color
    private Integer [] escalaGris;
    private Integer [][] escalaColor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen() {
    }

    public Imagen(Integer altura, Integer ancho, String nombre, Integer [] escalaGris) {
        this.altura = altura;
        this.ancho = ancho;
        this.nombre = nombre;
        this.escalaGris = escalaGris;
    }
    
    public Imagen(Integer altura, Integer ancho, String nombre, Integer [][] escalaColor) {
        this.altura = altura;
        this.ancho = ancho;
        this.nombre = nombre;
        this.escalaColor = escalaColor;
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

    public Integer[] getEscalaGris() {
        return escalaGris;
    }

    public void setEscalaGris(Integer[] escalaGris) {
        this.escalaGris = escalaGris;
    }

    public Integer[][] getEscalaColor() {
        return escalaColor;
    }

    public void setEscalaColor(Integer[][] escalaColor) {
        this.escalaColor = escalaColor;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Imagen{" + "altura=" + altura + ", ancho=" + ancho + ", nombre=" + nombre + '}';
    }
}
