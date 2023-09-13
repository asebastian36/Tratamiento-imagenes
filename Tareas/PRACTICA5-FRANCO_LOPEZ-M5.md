# Practica 5

> Nombre: Franco Lopez Angel Sebastian Grupo: M5

## Suma

```java
public short[][] suma(short[][] matriz) {
        short [][] matrizResultante = new short [matriz.length][matriz[0].length];
        if (matriz.length == this.imagen.getColumnas() && matriz[0].length == this.imagen.getFilas()) {
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    int suma = 0;
                    suma = (this.imagen.getMatrizGris()[i][j] + matriz[i][j]) / 2;
                    if (suma > 255) suma = 255;
                    matrizResultante[i][j] = (short) suma;
                }
            }
        }
        
        return matrizResultante;
    }
```

## Resta

```java
    public short[][] resta(short[][] matriz) {
        short [][] matrizResultante = new short [matriz.length][matriz[0].length];
        if (matriz.length == this.imagen.getColumnas() && matriz[0].length == this.imagen.getFilas()) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    int resta = 0;
                    resta = this.imagen.getMatrizGris()[i][j] - matriz[i][j];
                    if (resta < 0) resta = resta * -1;
                    matrizResultante[i][j] = (short) resta;
                }
            }
        }
        
        return matrizResultante;
    }
```

## Metodos en el controlador

```java
if (e.getActionCommand().equals("Resta")) {
    System.out.println("seleccionaste Resta");
    Imagen externa = this.configurarImagen(this.cargarImagenExterna());
    imagenProcesada = this.imagenOriginal.clone();
    op = new Operaciones(imagenProcesada);
    imagenProcesada.setMatrizGris(op.resta(externa.getMatrizGris()));
    imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
    this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
}

if (e.getActionCommand().equals("Suma")) {
    System.out.println("seleccionaste Suma");
    Imagen externa = this.configurarImagen(this.cargarImagenExterna());
    imagenProcesada = this.imagenOriginal.clone();
    op = new Operaciones(imagenProcesada);
    imagenProcesada.setMatrizGris(op.suma(externa.getMatrizGris()));
    imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
    this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
}
```
