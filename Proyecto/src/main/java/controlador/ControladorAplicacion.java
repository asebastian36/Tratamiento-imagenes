package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Imagen;
import modelo.Operaciones;
import vista.Principal;
import vista.Umbralizacion;

/**
 *
 * @author angel
 */

public class ControladorAplicacion implements ActionListener {

    private final Principal ventanaPrincipal;
    private Imagen imagenOriginal;
    private File archivoImagen;
    private Imagen imagenProcesada;
    private Operaciones op;
    private Umbralizacion umbralizacion;

    public ControladorAplicacion(Principal Ventana) {
        this.ventanaPrincipal = Ventana;
        this.ventanaPrincipal.abrirImagen.addActionListener(this);
        this.ventanaPrincipal.convertirGrises.addActionListener(this);
        this.ventanaPrincipal.rotar90Grados.addActionListener(this);
        this.ventanaPrincipal.rotar180grados.addActionListener(this);
        this.ventanaPrincipal.rotar270grados.addActionListener(this);
        this.ventanaPrincipal.verOriginal.addActionListener(this);
        this.ventanaPrincipal.sumaEscalar.addActionListener(this);
        this.ventanaPrincipal.restaEscalar.addActionListener(this);
        this.ventanaPrincipal.traslacion.addActionListener(this);
        this.ventanaPrincipal.reflejarEjeX.addActionListener(this);
        this.ventanaPrincipal.reflejarEjeY.addActionListener(this);
        this.ventanaPrincipal.suma.addActionListener(this);
        this.ventanaPrincipal.resta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Abrir imagen")) {
            System.out.println("Seleccionaste Abrir imagen");

            this.cargarRGB();

            this.ventanaPrincipal.menuOperaciones.setEnabled(true);
            this.ventanaPrincipal.convertirGrises.setEnabled(true);
        }

        if (e.getActionCommand().equals("Convertir a escala de grises")) {
            System.out.println("Seleccionaste Convertir a escala de grises");
            //  como paso las matrices?
            imagenProcesada = this.imagenOriginal.clone();
            this.cargarGris(this.imagenProcesada.getMatrizR(), this.imagenProcesada.getMatrizG(), this.imagenProcesada.getMatrizB());
            this.imagenProcesada.setBufferImagen(this.imagenOriginal.convierteMatrizEnBuffered(this.imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));

            this.ventanaPrincipal.menuVer.setEnabled(true);
            this.ventanaPrincipal.verOriginal.setEnabled(true);
            this.ventanaPrincipal.rotar90Grados.setEnabled(true);
            this.ventanaPrincipal.rotar180grados.setEnabled(true);
            this.ventanaPrincipal.rotar270grados.setEnabled(true);
            this.ventanaPrincipal.sumaEscalar.setEnabled(true);
            this.ventanaPrincipal.restaEscalar.setEnabled(true);
            this.ventanaPrincipal.traslacion.setEnabled(true);
            this.ventanaPrincipal.reflejarEjeX.setEnabled(true);
            this.ventanaPrincipal.reflejarEjeY.setEnabled(true);
            this.ventanaPrincipal.suma.setEnabled(true);
            this.ventanaPrincipal.resta.setEnabled(true);
        }

        if (e.getActionCommand().equals("Rotar 90 grados")) {
            System.out.println("Seleccionaste Rotar 90 grados");
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.rotar90Grados());
            imagenProcesada.getBufferImagen().flush();
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Rotar 180 grados")) {
            System.out.println("Seleccionaste Rotar 180 grados");
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.rotar180Grados());
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Rotar 270 grados")) {
            System.out.println("Seleccionaste Rotar 270 grados");
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.rotar270Grados());
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Ver original")) {
            System.out.println("Seleccionaste Ver original");
            imagenProcesada = new Imagen(this.archivoImagen);
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Suma escalar")) {
            System.out.println("seleccionaste Suma escalar");

            short numero = Short.parseShort(JOptionPane.showInputDialog("Introduce un valor para la suma escalar:"));
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.sumaEscalar(numero));
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Resta escalar")) {
            System.out.println("seleccionaste Resta escalar");

            short numero = Short.parseShort(JOptionPane.showInputDialog("Introduce un valor para la resta escalar:"));
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.restaEscalar(numero));
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Traslacion")) {
            System.out.println("seleccionaste Traslacion");
            short numero = Short.parseShort(JOptionPane.showInputDialog("Introduce un valor para la traslacion:"));
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.traslacion(numero));
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Reflejar eje x")) {
            System.out.println("seleccionaste Reflejar eje x");
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.reflejarEjeX());
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
        }

        if (e.getActionCommand().equals("Reflejar eje y")) {
            System.out.println("seleccionaste Reflejar eje y");
            imagenProcesada = this.imagenOriginal.clone();
            op = new Operaciones(imagenProcesada);
            imagenProcesada.setMatrizGris(op.reflejarEjeY());
            imagenProcesada.setBufferImagen(imagenProcesada.convierteMatrizEnBuffered(imagenProcesada.getMatrizGris()));
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenProcesada.getBufferImagen()));
        }

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
    }

    private void cargarRGB() {
        //  condiciones para obtener la imagen e instancia del objeto que obtendra la imagen
        JFileChooser selectorArchivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        selectorArchivos.setFileFilter(filtro);

        //  abrir un dialogo para obtener la imagen y verificar que exista
        int respuesta = selectorArchivos.showOpenDialog(ventanaPrincipal);
        if (respuesta == JFileChooser.APPROVE_OPTION && selectorArchivos.getSelectedFile().exists()) {
            this.archivoImagen = selectorArchivos.getSelectedFile();

            //  Crea el objeto de tipo imagen
            this.imagenOriginal = new Imagen(this.archivoImagen);
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenOriginal.getBufferImagen()));
            System.out.println("Cantidad de columnas de la imagen recibida: " + this.imagenOriginal.getColumnas());
            System.out.println("Cantidad de filas de la imagen recibida: " + this.imagenOriginal.getFilas());
        }
    }

    private void cargarGris(short matrizR[][], short matrizG[][], short matrizB[][]) {
        short matrizResultante[][] = new short[matrizR.length][matrizR[0].length];

        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR[0].length; j++) {
                //  operacion
                int suma = (matrizR[i][j] + matrizG[i][j] + matrizB[i][j]);
                int resultado = (suma / 3);
                matrizResultante[i][j] = (short) resultado;
            }
        }

        this.imagenProcesada.setMatrizGris(matrizResultante);
        this.imagenOriginal.setMatrizGris(matrizResultante);
    }

    private File cargarImagenExterna() {
        //  condiciones para obtener la imagen e instancia del objeto que obtendra la imagen
        JFileChooser selectorArchivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        selectorArchivos.setFileFilter(filtro);

        //  abrir un dialogo para obtener la imagen y verificar que exista
        int respuesta = selectorArchivos.showOpenDialog(ventanaPrincipal);
        if (respuesta == JFileChooser.APPROVE_OPTION && selectorArchivos.getSelectedFile().exists()) {
            return selectorArchivos.getSelectedFile();
        }
        return null;
    }

    private Imagen configurarImagen(File archivoImagen) {
        Imagen resultante = new Imagen(archivoImagen);

        short matrizResultante[][] = new short[resultante.getMatrizR().length][resultante.getMatrizR()[0].length];

        for (int i = 0; i < resultante.getMatrizR().length; i++) {
            for (int j = 0; j < resultante.getMatrizR()[0].length; j++) {
                //  operacion
                int suma = (resultante.getMatrizR()[i][j] + resultante.getMatrizG()[i][j] + resultante.getMatrizB()[i][j]);
                int resultado = (suma / 3);
                matrizResultante[i][j] = (short) resultado;
            }
        }

        resultante.setMatrizGris(matrizResultante);

        return resultante;
    }
}
