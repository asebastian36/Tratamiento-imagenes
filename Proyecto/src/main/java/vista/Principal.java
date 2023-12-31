/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorAplicacion;

/**
 *
 * @author angel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        new ControladorAplicacion(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelIzquierdo = new javax.swing.JPanel();
        panelDerecho = new javax.swing.JPanel();
        labelImagen = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirImagen = new javax.swing.JMenuItem();
        menuOperaciones = new javax.swing.JMenu();
        convertirGrises = new javax.swing.JMenuItem();
        rotar90Grados = new javax.swing.JMenuItem();
        rotar180grados = new javax.swing.JMenuItem();
        rotar270grados = new javax.swing.JMenuItem();
        sumaEscalar = new javax.swing.JMenuItem();
        restaEscalar = new javax.swing.JMenuItem();
        traslacion = new javax.swing.JMenuItem();
        reflejarEjeX = new javax.swing.JMenuItem();
        reflejarEjeY = new javax.swing.JMenuItem();
        suma = new javax.swing.JMenuItem();
        resta = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        verOriginal = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(3840, 2160));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("> w <");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Presiona esta Prieto-kun!!!!");

        panelIzquierdo.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        panelDerecho.setBackground(new java.awt.Color(204, 255, 204));

        labelImagen.setMaximumSize(new java.awt.Dimension(3840, 3840));
        labelImagen.setText("label1");

        javax.swing.GroupLayout panelDerechoLayout = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(panelDerechoLayout);
        panelDerechoLayout.setHorizontalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(205, 205, 205))
        );
        panelDerechoLayout.setVerticalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechoLayout.createSequentialGroup()
                .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jButton1)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
        );

        jMenuBar1.setName("menuArchivo"); // NOI18N

        jMenu1.setLabel("Archivo");

        abrirImagen.setText("Abrir imagen");
        abrirImagen.setName("menuItemAbrir"); // NOI18N
        abrirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirImagenActionPerformed(evt);
            }
        });
        jMenu1.add(abrirImagen);

        jMenuBar1.add(jMenu1);

        menuOperaciones.setText("Operaciones");
        menuOperaciones.setEnabled(false);

        convertirGrises.setText("Convertir a escala de grises");
        convertirGrises.setEnabled(false);
        menuOperaciones.add(convertirGrises);

        rotar90Grados.setText("Rotar 90 grados");
        rotar90Grados.setEnabled(false);
        menuOperaciones.add(rotar90Grados);

        rotar180grados.setText("Rotar 180 grados");
        rotar180grados.setEnabled(false);
        menuOperaciones.add(rotar180grados);

        rotar270grados.setText("Rotar 270 grados");
        rotar270grados.setEnabled(false);
        rotar270grados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotar270gradosActionPerformed(evt);
            }
        });
        menuOperaciones.add(rotar270grados);

        sumaEscalar.setText("Suma escalar");
        sumaEscalar.setEnabled(false);
        menuOperaciones.add(sumaEscalar);

        restaEscalar.setText("Resta escalar");
        restaEscalar.setEnabled(false);
        menuOperaciones.add(restaEscalar);

        traslacion.setText("Traslacion");
        traslacion.setEnabled(false);
        menuOperaciones.add(traslacion);

        reflejarEjeX.setText("Reflejar eje x");
        reflejarEjeX.setEnabled(false);
        menuOperaciones.add(reflejarEjeX);

        reflejarEjeY.setText("Reflejar eje y");
        reflejarEjeY.setEnabled(false);
        menuOperaciones.add(reflejarEjeY);

        suma.setText("Suma");
        suma.setEnabled(false);
        menuOperaciones.add(suma);

        resta.setText("Resta");
        resta.setEnabled(false);
        menuOperaciones.add(resta);

        jMenuBar1.add(menuOperaciones);

        menuVer.setText("Ver");
        menuVer.setEnabled(false);

        verOriginal.setText("Ver original");
        menuVer.add(verOriginal);

        jMenuBar1.add(menuVer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void abrirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirImagenActionPerformed

    private void rotar270gradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotar270gradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotar270gradosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem abrirImagen;
    public javax.swing.JMenuItem convertirGrises;
    public javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public java.awt.Label labelImagen;
    public javax.swing.JMenu menuOperaciones;
    public javax.swing.JMenu menuVer;
    public javax.swing.JPanel panelDerecho;
    public javax.swing.JPanel panelIzquierdo;
    public javax.swing.JMenuItem reflejarEjeX;
    public javax.swing.JMenuItem reflejarEjeY;
    public javax.swing.JMenuItem resta;
    public javax.swing.JMenuItem restaEscalar;
    public javax.swing.JMenuItem rotar180grados;
    public javax.swing.JMenuItem rotar270grados;
    public javax.swing.JMenuItem rotar90Grados;
    public javax.swing.JMenuItem suma;
    public javax.swing.JMenuItem sumaEscalar;
    public javax.swing.JMenuItem traslacion;
    public javax.swing.JMenuItem verOriginal;
    // End of variables declaration//GEN-END:variables
}
