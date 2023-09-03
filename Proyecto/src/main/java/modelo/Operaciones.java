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

    //  Desde este metodo matriz se refiere a una matriz de gris
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

    public static short[][] rotar270Grados(short matriz[][]) {
        // Declaramos una matriz de la misma dimensión que la matriz original
        short[][] resultante = new short[matriz[0].length][matriz.length];

        // Recorremos la matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // Obtenemos el valor del elemento original
                short valor = matriz[j][matriz.length - 1 - i];

                // Almacenamos el valor en la matriz resultante en la posición opuesta
                resultante[i][j] = valor;
            }
        }

        // Devolvemos la matriz resultante
        return resultante;
    }

    public short[][] sumaEscalar(short matriz[][], short recorrido) {
        short[][] resultante = new short[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                short resultado = (short) (matriz[i][j] + recorrido);

                if (resultado > 255) {
                    resultante[i][j] = (short) 255;
                } else {
                    resultante[i][j] = resultado;
                }
            }
        }

        return resultante;
    }

    public short[][] restaEscalar(short matriz[][], short recorrido) {
        short[][] resultante = new short[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                short resultado = (short) (matriz[i][j] - recorrido);

                if (resultado < 0) {
                    resultante[i][j] = (short) 0;
                } else {
                    resultante[i][j] = resultado;
                }
            }
        }

        return resultante;
    }

    public short[][] traslacion(short[][] matriz, int translacion) {
        // Calculamos el tamaño de la matriz resultante
        int filas = matriz.length + Math.abs(translacion);
        int columnas = matriz[0].length;

        // Declaramos la matriz resultante
        short[][] resultante = new short[filas][columnas];

        // Recorremos la matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // Obtenemos el valor del elemento original
                short valor = matriz[i][j];

                // Aplicamos la traslación
                resultante[(i + translacion) % filas][(j + translacion) % columnas] = (j + translacion) >= columnas ? 0 : valor;
            }
        }

        // Devolvemos la matriz resultante
        return resultante;
    }

    public short[][] reflejarEjeX(short matriz[][]) {
        // Declaramos una matriz de la misma dimensión que la matriz original
        short[][] matrizReflejada = new short[matriz.length][matriz[0].length];

        // Recorremos la matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // Obtenemos el valor del elemento original
                int valor = matriz[i][j];

                // Almacenamos el valor en la matriz reflejada en la posición opuesta
                matrizReflejada[i][matriz[0].length - j - 1] = (short) valor;
            }
        }

        // Devolvemos la matriz reflejada
        return matrizReflejada;
    }

    public short[][] reflejarEjeY(short matriz[][]) {
        // Declaramos una matriz de la misma dimensión que la matriz original
        short[][] matrizReflejada = new short[matriz.length][matriz[0].length];

        // Recorremos la matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // Obtenemos el valor del elemento original
                int valor = matriz[i][j];

                // Almacenamos el valor en la matriz reflejada en la posición opuesta
                matrizReflejada[matriz.length - i - 1][j] = (short) valor;
            }
        }

        // Devolvemos la matriz reflejada
        return matrizReflejada;
    }

}
