package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Imagen;
import vista.Principal;

/**
 *
 * @author angel
 */

public class ControladorAplicacion implements ActionListener {

    private Principal ventanaPrincipal;
    private Imagen imagenOriginal;
    private File archivoImagen;

    public ControladorAplicacion(Principal Ventana) {
        this.ventanaPrincipal = Ventana;
        this.ventanaPrincipal.AgregarImagen.addActionListener(this);
        this.ventanaPrincipal.ConvertirGrises.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Abrir imagen")) {
            System.out.println("Seleccionaste Abrir imagen");

            if (this.ventanaPrincipal.jLabel1.getIcon() == null) {
                this.cargarRGB();
            }

            this.ventanaPrincipal.ConvertirGrises.setEnabled(true);
            this.ventanaPrincipal.ConvertirGrises.setVisible(true);
        } 
        
        if (e.getActionCommand().equals("Convertir a escala de grises")) {
            System.out.println("Seleccionaste Convertir a escala de grises");
            //  como paso las matrices?
            this.cargarGris(this.imagenOriginal.getMatrizR(), this.imagenOriginal.getMatrizG(), this.imagenOriginal.getMatrizB());
            this.imagenOriginal.convierteMatrizEnBuffered(this.imagenOriginal.getMatrizR());
            this.ventanaPrincipal.jLabel1.setIcon(new ImageIcon(this.imagenOriginal.getBufferImagen().getScaledInstance(100, 200, Image.SCALE_DEFAULT)));
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

        this.imagenOriginal.setMatrizGris(matrizResultante);
    }
}
