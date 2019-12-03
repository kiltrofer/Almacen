/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author christopher
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        menuProductosAdmin = new javax.swing.JMenuItem();
        menuRecepcion = new javax.swing.JMenuItem();
        menuVEnta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        menuBar.add(menuArchivo);

        menuProductos.setText("Productos");

        menuProductosAdmin.setText("Administrar");
        menuProductosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosAdminActionPerformed(evt);
            }
        });
        menuProductos.add(menuProductosAdmin);

        menuRecepcion.setText("Recepcion");
        menuRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRecepcionActionPerformed(evt);
            }
        });
        menuProductos.add(menuRecepcion);

        menuVEnta.setText("Venta");
        menuVEnta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVEntaActionPerformed(evt);
            }
        });
        menuProductos.add(menuVEnta);

        menuBar.add(menuProductos);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
      int resp = JOptionPane.showConfirmDialog(null, "¿Desea Salir De La Aplicacion?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if (resp==JOptionPane.YES_OPTION) {
//al usar esta linea el boton salir provoca el cierre del programa    
        System.exit(0);
    }                                        
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuProductosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosAdminActionPerformed
        ProductosAdmin pa = new ProductosAdmin();
        this.escritorio.add(pa);
        pa.setVisible(true);
    }//GEN-LAST:event_menuProductosAdminActionPerformed

    private void menuRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRecepcionActionPerformed
         ProductosRecepcion pr = new ProductosRecepcion();
        this.escritorio.add(pr);
        pr.setVisible(true);
    }//GEN-LAST:event_menuRecepcionActionPerformed

    private void menuVEntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVEntaActionPerformed
         ProductosVenta pv = new ProductosVenta();
        this.escritorio.add(pv);
        pv.setVisible(true);
    }//GEN-LAST:event_menuVEntaActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenuItem menuProductosAdmin;
    private javax.swing.JMenuItem menuRecepcion;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuVEnta;
    // End of variables declaration//GEN-END:variables
}
