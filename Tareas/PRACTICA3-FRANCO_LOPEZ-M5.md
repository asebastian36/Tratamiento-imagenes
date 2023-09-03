# Practica 3

> Nombre: Franco Lopez Angel Sebastian Grupo: M5

## Codigo de los metodos

```java
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
    }//  Desde este metodo matriz se refiere a una matriz de gris
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
```

## Capturas de las salidas

Imagen de inicio:

![imagen de inicio](/Imagenes/Captura%20de%20pantalla%202023-09-03%20130521.png)

* Salida de rotar 90 grados:

  ![imagen](/Imagenes/90.png)

* Salida de rotar 180 grados:

    ![imagen](/Imagenes/180.png)

* Salida de rotar 270 grados:

    ![imagen](/Imagenes/270.png)
