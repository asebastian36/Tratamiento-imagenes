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
    public short[][] rotar90Grados() {
        // Calculamos el tamaño de la matriz resultante
        int filas = imagen.getMatrizGris().length;
        int columnas = imagen.getMatrizGris()[0].length;

        // Comprobamos el tamaño de la matriz original
        if (filas < columnas) {
            // Aumentamos el tamaño de la matriz original
            short[][] matrizOriginalExtendida = new short[filas + columnas - 1][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matrizOriginalExtendida[i][j] = imagen.getMatrizGris()[i][j];
                }
            }

            // Rotamos la matriz extendida
            short[][] matrizRotada = new short[columnas][filas];
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < filas; j++) {
                    matrizRotada[i][j] = matrizOriginalExtendida[filas - 1 - j][i];
                }
            }

            // Devolvemos la matriz rotada
            return matrizRotada;
        } else {
            // Rotamos la matriz original
            short[][] matrizRotada = new short[columnas][filas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matrizRotada[j][filas - 1 - i] = imagen.getMatrizGris()[i][j];
                }
            }

            // Devolvemos la matriz rotada
            return matrizRotada;
        }
    }

    public short[][] rotar180Grados() {
        short[][] resultante = new short[imagen.getMatrizGris().length][imagen.getMatrizGris()[0].length];
        for (int i = 0; i < imagen.getMatrizGris().length; i++) {
            for (int j = 0; j < imagen.getMatrizGris()[0].length; j++) {
                resultante[i][j] = imagen.getMatrizGris()[imagen.getMatrizGris().length - 1 - i][imagen.getMatrizGris()[0].length - 1 - j];
            }
        }
        return resultante;
    }

    public short[][] rotar270Grados() {
  short[][] resultante = new short[imagen.getMatrizGris()[0].length][imagen.getMatrizGris().length];
  for (int i = imagen.getMatrizGris().length - 1; i >= 0; i--) {
    for (int j = 0; j < imagen.getMatrizGris()[0].length; j++) {
      resultante[imagen.getMatrizGris()[0].length - 1 - j][i] = imagen.getMatrizGris()[i][j];
    }
  }
  return resultante;
}

    public short[][] sumaEscalar(short recorrido) {
        short[][] resultante = new short[imagen.getMatrizGris().length][imagen.getMatrizGris()[0].length];

        for (int i = 0; i < imagen.getMatrizGris().length; i++) {
            for (int j = 0; j < imagen.getMatrizGris()[0].length; j++) {
                short resultado = (short) (imagen.getMatrizGris()[i][j] + recorrido);

                if (resultado > 255) {
                    resultante[i][j] = (short) 255;
                } else {
                    resultante[i][j] = resultado;
                }
            }
        }

        return resultante;
    }

    public short[][] restaEscalar(short recorrido) {
        short[][] resultante = new short[imagen.getMatrizGris().length][imagen.getMatrizGris()[0].length];

        for (int i = 0; i < imagen.getMatrizGris().length; i++) {
            for (int j = 0; j < imagen.getMatrizGris()[0].length; j++) {
                short resultado = (short) (imagen.getMatrizGris()[i][j] - recorrido);

                if (resultado < 0) {
                    resultante[i][j] = (short) 0;
                } else {
                    resultante[i][j] = resultado;
                }
            }
        }

        return resultante;
    }

    public short[][] traslacion(int translacion) {
        // Calculamos el tamaño de la matriz resultante
        int filas = imagen.getMatrizGris().length + Math.abs(translacion);
        int columnas = imagen.getMatrizGris()[0].length;

        // Declaramos la matriz resultante
        short[][] resultante = new short[filas][columnas];

        // Recorremos la matriz original
        for (int i = 0; i < imagen.getMatrizGris().length; i++) {
            for (int j = 0; j < imagen.getMatrizGris()[0].length; j++) {
                // Obtenemos el valor del elemento original
                short valor = imagen.getMatrizGris()[i][j];

                // Aplicamos la traslación
                resultante[(i + translacion) % filas][(j + translacion) % columnas] = (j + translacion) >= columnas ? 0 : valor;
            }
        }

        // Devolvemos la matriz resultante
        return resultante;
    }

    public short[][] reflejarEjeX() {
        // Declaramos una matriz de la misma dimensión que la matriz original
        short[][] matrizReflejada = new short[imagen.getMatrizGris().length][imagen.getMatrizGris()[0].length];

        // Recorremos la matriz original
        for (int i = 0; i < imagen.getMatrizGris().length; i++) {
            for (int j = 0; j < imagen.getMatrizGris()[0].length; j++) {
                // Obtenemos el valor del elemento original
                int valor = imagen.getMatrizGris()[i][j];

                // Almacenamos el valor en la matriz reflejada en la posición opuesta
                matrizReflejada[i][imagen.getMatrizGris()[0].length - j - 1] = (short) valor;
            }
        }

        // Devolvemos la matriz reflejada
        return matrizReflejada;
    }

    public short[][] reflejarEjeY() {
        // Declaramos una matriz de la misma dimensión que la matriz original
        short[][] matrizReflejada = new short[imagen.getMatrizGris().length][imagen.getMatrizGris()[0].length];

        // Recorremos la matriz original
        for (int i = 0; i < imagen.getMatrizGris().length; i++) {
            for (int j = 0; j < imagen.getMatrizGris()[0].length; j++) {
                // Obtenemos el valor del elemento original
                int valor = imagen.getMatrizGris()[i][j];

                // Almacenamos el valor en la matriz reflejada en la posición opuesta
                matrizReflejada[imagen.getMatrizGris().length - i - 1][j] = (short) valor;
            }
        }

        // Devolvemos la matriz reflejada
        return matrizReflejada;
    }

}
