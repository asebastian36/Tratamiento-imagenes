# Practica 4

> Nombre: Franco Lopez Angel Sebastian Grupo: M5

## Codigo de los ejercicios

```java
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
```

## Capturas de las salidas

* Salida de suma escalar:

  ![imagen](/Imagenes/entradaSuma.png)

  ![imagen](/Imagenes/salidaSuma.png)

* Salida de resta escalar:

  ![imagen](/Imagenes/entradaResta.png)

  ![imagen](/Imagenes/salidaResta.png)

* Salida de traslacion:

  ![imagen](/Imagenes/entradaTraslacion.png)

  ![imagen](/Imagenes/salidaTraslacion.png)

* Salida de reflejo en el eje x:

  ![imagen](/Imagenes/reflejoX.png)

* Salida de reflejo en el eje y:

  ![imagen](/Imagenes/reflejarY.png)
