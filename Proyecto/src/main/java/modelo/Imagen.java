package modelo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author angel
 */

public class Imagen {
    //  Atributos de la clase:
    private String nombre;
    private String formato;
    private int filas;
    private int columnas;
    private short matrizGris[][];
    private short matrizR[][];
    private short matrizG[][];
    private short matrizB[][];
    private File archivoImagen;
    private BufferedImage bufferImagen;
    
    //  REVISAR la clase Color, no hay que entregar

    //  constructores
    public Imagen() {
        
    }

    public Imagen(File archivoImagen) {
        this.bufferImagen = null;
        try {
            this.bufferImagen = ImageIO.read(archivoImagen);
            this.cargarImagen(bufferImagen);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        this.archivoImagen = archivoImagen;
        this.filas = bufferImagen.getHeight();
        this.columnas = bufferImagen.getWidth();
        this.nombre = archivoImagen.getName();
        System.out.println("Imagen::Termina la carga");
    }
    
    //  metodo que realiza la lectura del contenido 
    private void cargarImagen(BufferedImage imagenOriginal) {
        short [][] tMatrizR = new short [imagenOriginal.getWidth()][imagenOriginal.getHeight()];
        short [][] tMatrizG = new short [imagenOriginal.getWidth()][imagenOriginal.getHeight()];
        short [][] tMatrizB = new short [imagenOriginal.getWidth()][imagenOriginal.getHeight()];
        
        Color colorAuxiliar;
        
        for (int i = 0; i < imagenOriginal.getWidth(); i++) {
            for (int j = 0; j < imagenOriginal.getHeight(); j++) {
                colorAuxiliar = new Color(imagenOriginal.getRGB(i, j));
                tMatrizR[i][j] = (short) colorAuxiliar.getRed();
                tMatrizG[i][j] = (short) colorAuxiliar.getGreen();
                tMatrizB[i][j] = (short) colorAuxiliar.getBlue();
            }
        }
        
        this.setMatrizR(tMatrizR);
        this.setMatrizG(tMatrizG);
        this.setMatrizB(tMatrizB);
    }
    
    //  getters y setterss
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public short[][] getMatrizGris() {
        return matrizGris;
    }

    public void setMatrizGris(short[][] matrizGris) {
        this.matrizGris = matrizGris;
    }

    public short[][] getMatrizR() {
        return matrizR;
    }

    public void setMatrizR(short[][] matrizR) {
        this.matrizR = matrizR;
    }

    public short[][] getMatrizG() {
        return matrizG;
    }

    public void setMatrizG(short[][] matrizG) {
        this.matrizG = matrizG;
    }

    public short[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(short[][] matrizB) {
        this.matrizB = matrizB;
    }

    public File getArchivoImagen() {
        return archivoImagen;
    }

    public void setArchivoImagen(File archivoImagen) {
        this.archivoImagen = archivoImagen;
    }

    public BufferedImage getBufferImagen() {
        return bufferImagen;
    }

    public void setBufferImagen(BufferedImage bufferImagen) {
        this.bufferImagen = bufferImagen;
    }
}
