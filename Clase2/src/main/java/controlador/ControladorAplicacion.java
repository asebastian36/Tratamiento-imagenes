package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Imagen;
import vista.Principal;

/**
 *
 * @author angel
 */

public class ControladorAplicacion implements ActionListener {
    private Principal ventanaPrincipal;
    private Imagen imagenOriginal;
    
    public ControladorAplicacion(Principal Ventana) {
        this.ventanaPrincipal = Ventana;
        this.ventanaPrincipal.jMenuItem1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Abrir archivo")) {
            System.out.println("Seleccionaste Abrir imagen");
        }
    }
}
