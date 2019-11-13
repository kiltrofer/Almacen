/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB_MOVIL08
 */
public class ClienteEditar extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClienteEditar
     */
    public ClienteEditar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblComuna = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtComuna = new javax.swing.JTextField();
        cmbCiudad = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();

        jLabel1.setText("Editar Cliente");

        lblRut.setText("Rut (Sin Digito Verificador)");

        lblRazonSocial.setText("Razon Social");

        lblCiudad.setText("Ciudad");

        lblComuna.setText("Comuna");

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });

        txtComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComunaKeyTyped(evt);
            }
        });

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aldea de Tulor", "Alto El Loa", "Antofagasta", "Arica", "Bahía Inglesa", "Calama", "Caspana", "Cerro Toco", "Chiu - Chiu", "Copiapó", "Géisers del Tatio", "Guatín", "Hierbas Buenas", "Iquique", "La Tirana", "Laguna Cejar", "Laguna Chaxa", "Laguna Roja", "Lagunas Altiplánicas (Miscanti y Miñiques)", "Machuca", "Monumento Natural Salar de Surire", "Oficinas Salitreras Humberstone", "Ojos del Salar y laguna Tebinquinche", "Ollagüe", "Parque Nacional Lauca", "Parque Nacional Llanos de Challe", "Parque Nacional Llullaillaco", "Parque Nacional Nevado Tres Cruces", "Parque Nacional Pan de Azúcar", "Parque Nacional Salar de Huasco", "Parque Nacional Volcán Isluga", "Pukará de Lasana", "Pukará de Quitor", "Putre", "Reserva Nacional Los Flamencos", "Reserva Nacional Pampa del Tamarugal", "Salar de Atacama", "Salar de Tara", "San Pedro de Atacama", "Socaire", "Termas de Mamiña", "Termas de Puritama", "Toconao", "Valle de la Luna", "Valle del Arcoiris", "Volcán Láscar", "Volcán Licancabur", "Volcán Ojos del Salado", "Volcán SairecaburCoquimbo", "La Serena", "Parque Nacional Bosques de Fray Jorge", "Pisco Elqui", "Reserva Nacional Pingüino de Humboldt", "Termas de Socos", "Tongoy", "Valle del ElquiAlgarrobo", "Alto del Naranjo", "Baños Colina", "Cajón del Maipo", "Curicó", "El Colorado", "Farellones", "Isla Negra", "Isla Robinson Crusoe", "La Parva", "Lago Colbún", "Lago Rapel", "Lago Vichuquén", "Laguna Aculeo", "Los Andes / Portillo", "Mall Costanera Center", "Monumento Natural El Morado", "Monumento Natural Isla Cachagua", "Museo de Colchagua", "Olmué", "Outlet Buenaventura", "Parque Aguas de San Ramón", "Parque Nacional La Campana", "Parque Nacional Radal Siete Tazas", "Pichilemu", "Rancagua", "Reserva Nacional Altos del Lircay", "Reserva Nacional Laguna Torca", "Reserva Nacional Río Clarillo", "Reserva Nacional Río Los Cipreses", "San Fernando", "Santa Cruz", "Santiago", "Sewell", "Ski en Santiago", "Talca", "Termas de Cauquenes", "Termas de Panimávida", "Termas de Quinamávida", "Termas del Flaco", "Valle de Almahue", "Valle de Casablanca", "Valle de Colchagua", "Valle del Maipo", "Valle Nevado", "Valparaíso", "Viña Casa Silva", "Viña Concha y Toro", "Viña del Mar", "Viña Escondida", "Viña Lapostolle", "Viña Matetic", "Viña Montes", "Viña MontGras", "Viña Santa Cruz", "Viña Santa Rita", "Viña Undurraga", "Viña Vik", "Viña Viu Manent", "Volcán San José", "Yerba Loca", "ZapallarAraucanía y Los Ríos", "Backyard Pullao", "Chillán", "Cochamó", "Concepción", "Contulmo", "Corralco", "Crater Raihuen", "Curacautín", "El Cañi", "Fiordo Quintupeu", "Frutillar", "Lago Budi", "Lago Llanquihue", "Lago Lleu Lleu", "Lago Ranco", "Lago Todos los Santos", "Lonquimay", "Los Ángeles", "Monumento Natural Cerro Ñielol", "Ojos del Caburgua", "Osorno", "Parque Nacional Alerce Andino", "Parque Nacional Conguillío", "Parque Nacional Huerquehue", "Parque Nacional Laguna del Laja", "Parque Nacional Nahuelbuta", "Parque Nacional Puyehue", "Parque Nacional Tolhuaca", "Parque Nacional Vicente Perez Rosales", "Parque Nacional Villarrica", "Parque Tagua-Tagua", "Peninsula de Rilán", "Pucón", "Puerto Montt", "Puerto Octay", "Puerto Varas", "Quinquén", "Reserva Biologica Huilo Huilo", "Reserva Nacional Isla Mocha", "Reserva Nacional Malalcahuello", "Río Puelo", "Río Trancura", "Salto del Laja", "Saltos de Petrohué", "Santuario de la Naturaleza Carlos Anwandter", "Ski en Antillanca", "Ski en Chillán", "Sollipulli", "Temuco", "Termas de Aguas Calientes", "Termas de Chillán", "Termas de Coñaripe", "Termas de Huife", "Termas de Liquiñe", "Termas de Puyehue", "Termas de Tolhuaca", "Termas Geométricas", "Totoral", "Trekking al Salto del Puma Anticura", "Valdivia", "Villarrica", "Volcán Osorno" }));
        cmbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblDireccion.setText("Direccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                            .addComponent(lblCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRut)
                            .addComponent(lblDireccion))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCiudad, javax.swing.GroupLayout.Alignment.TRAILING, 0, 190, Short.MAX_VALUE)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDireccion))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRazonSocial)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCiudad))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComuna))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //cierra la ventana 
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         try{
            //metodo para hacer update a la base de datos 
            PreparedStatement pps = cn.prepareStatement("UPDATE cliente SET (rut = '"+txtRut.getText()+"', razon_social = '"+txtRazonSocial.getText()+"', direccion = '"+txtDireccion.getText()+"', id_ciudad = '"+cmbCiudad.getItemAt(WIDTH)+"' , comuna = '"+txtComuna.getText()+"')");
           
            pps.executeUpdate();
            //mensaje que confirma la edicion 
            JOptionPane.showMessageDialog(null, "Datos Editados");
        }catch (SQLException ex){
           Logger.getLogger(ClienteAgregar.class.getName()).log(Level.SEVERE,null,ex); 
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed
    }
    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        //esta linea provoca que solo se acepten digitos en el text field
        char c = evt.getKeyChar();
       //la condicion que se impone para que solo salgan esos numeros
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtRutKeyTyped

    private void txtComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComunaKeyTyped
       //esta linea de codigo hace que solo acepte letras en el text field 
        char c = evt.getKeyChar();
       //la condicion que se pone para los caracteres utilizables 
        if ((c<'a'||  c>'z')&&(c>'Z' || c<'A')&&(c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtComunaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblComuna;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables

    private static class cn {

        private static PreparedStatement prepareStatement(String update_clienterutrazon_social_direccionid) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public cn() {
        }
    }
}
