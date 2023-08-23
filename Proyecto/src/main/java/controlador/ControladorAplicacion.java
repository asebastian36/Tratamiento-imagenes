package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
        this.ventanaPrincipal.jMenuItem1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Abrir imagen")) {
            System.out.println("Seleccionaste Abrir imagen");
            this.abrirImagen();
        }
    }
    
    private void abrirImagen() {
        //  condiciones para obtener la imagen e instancia del objeto que obtendra la imagen
        JFileChooser selectorArchivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        selectorArchivos.setFileFilter(filtro);
        
        //  abrir un dialogo para obtener la imagen y verificar que exista
        int respuesta = selectorArchivos.showOpenDialog(ventanaPrincipal);
        if(respuesta == JFileChooser.APPROVE_OPTION && selectorArchivos.getSelectedFile().exists()) {
            this.archivoImagen = selectorArchivos.getSelectedFile();
            
            //  Crea el objeto de tipo imagen
            this.imagenOriginal = new Imagen(this.archivoImagen);
            
            System.out.println("Cantidad de columnas de la imagen recibida: " + this.imagenOriginal.getColumnas());
            System.out.println("Cantidad de filas de la imagen recibida: " + this.imagenOriginal.getFilas());
            System.out.println("Este es un cambio minimo");

        }
    }
}
