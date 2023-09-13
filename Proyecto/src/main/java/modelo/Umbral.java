package modelo;

/**
 *
 * @author angel
 */

public class Umbral {
    private short umbral;
    private short umbral2;

    public Umbral() {
    }

    public Umbral(short umbral, short umbral2) {
        this.umbral = umbral;
        this.umbral2 = umbral2;
    }
    
    public short getUmbral() {
        return this.umbral;
    }

    public void setUmbral(short umbral) {
        this.umbral = umbral;
    }

    public short getUmbral2() {
        return this.umbral2;
    }

    public void setUmbral2(short umbral2) {
        this.umbral2 = umbral2;
    }
    
    public short [][] umbralInverso(short [][] matrizGris) {
        short [][] matrizResultante = new short [matrizGris.length][matrizGris[0].length];
        for (int i = 0; i < matrizGris.length; i++) {
            for (int j = 0; j < matrizGris[0].length; j++) {
                if (matrizGris[i][j] < umbral) matrizResultante[i][j] = 0;
                else if (matrizGris[i][j] > umbral) matrizResultante[i][j] = 255;
                else matrizResultante[i][j] = matrizGris[i][j];
            }
        }
        
        return matrizResultante;
    }
    
    public short [][] umbralNegativo(short [][] matrizGris) {
        short [][] matrizResultante = new short [matrizGris.length][matrizGris[0].length];
        for (int i = 0; i < matrizGris.length; i++) {
            for (int j = 0; j < matrizGris[0].length; j++) {
                matrizResultante[i][j] = (short) (255 - matrizGris[i][j]);
            }
        }
        
        return matrizResultante;
    }
    
    public short [][] extension(short [][] matrizGris) {
        short [][] matrizResultante = new short [matrizGris.length][matrizGris[0].length];
        for (int i = 0; i < matrizGris.length; i++) {
            for (int j = 0; j < matrizGris[0].length; j++) {
                if ( (matrizGris[i][j] < umbral) || (matrizGris[i][j] > umbral2) ) matrizResultante[i][j] = 255;
                else if ( (umbral > matrizGris[i][j]) && ( matrizGris[i][j] < umbral2) ) matrizResultante[i][j] = (short) ( 255 * ( (matrizGris[i][j] - umbral) / (umbral2 - umbral) ) );
            }
        }
        
        return matrizResultante;
    }
    
    public short [][] umbralGris(short [][] matrizGris) {
        short [][] matrizResultante = new short [matrizGris.length][matrizGris[0].length];
        for (int i = 0; i < matrizGris.length; i++) {
            for (int j = 0; j < matrizGris[0].length; j++) {
                if ( (matrizGris[i][j] < umbral) || (matrizGris[i][j] > umbral2) ) matrizResultante[i][j] = 255;
                else if ( (umbral > matrizGris[i][j]) && ( matrizGris[i][j] < umbral2) ) matrizResultante[i][j] = matrizGris[i][j];
            }
        }
        
        return matrizResultante;
    }
    
    public short [][] umbralBinario(short [][] matrizGris) {
        short [][] matrizResultante = new short [matrizGris.length][matrizGris[0].length];
        for (int i = 0; i < matrizGris.length; i++) {
            for (int j = 0; j < matrizGris[0].length; j++) {
                if ( (matrizGris[i][j] < umbral) || (matrizGris[i][j] > umbral2) ) matrizResultante[i][j] = 0;
                else if ( (umbral > matrizGris[i][j]) && ( matrizGris[i][j] < umbral2) ) matrizResultante[i][j] = 255;
            }
        }
        
        return matrizResultante;
    }
}
