package modelo;

/**
 *
 * @author angel
 */
public class Operaciones {

    private Imagen imagen;

    public Operaciones() {

    }

    public Operaciones(Imagen imagen) {
        this.imagen = imagen;
    }

    //  programar las nuevas funcionalidades aqui!!
    public short[][] rotar90Grados(short matriz[][]) {
        //  invertimos tamano y ancho
        short resultante[][] = new short[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                resultante[i][j] = matriz[j][i];
            }
        }

        return resultante;
    }

    public short[][] rotar180Grados(short matriz[][]) {
        short[][] resultante = new short[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultante[i][j] = matriz[matriz.length - 1 - i][matriz[0].length - 1 - j];
            }
        }
        return resultante;
    }

    public short[][] rotar270Grados(short matriz[][]) {
        short[][] resultante = new short[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultante[i][j] = matriz[matriz[0].length - 1 - j][i];
            }
        }
        return resultante;
    }
}
