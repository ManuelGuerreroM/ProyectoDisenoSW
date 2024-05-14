
package frames;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.TitledBorder;

/**
 * @author Equipo2
 */
public class Transaccion extends javax.swing.JFrame {

    public Transaccion() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        lblCarro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoAuto.png"));
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\fondo.jpg"));
        lblIconoTransaccion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoTransaccion.png"));
    
        actualizarFecha();
    }
    
    public void mostrar() { setVisible(true); }
    
    private void actualizarFecha() {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = formatoFecha.format(new Date());
        lblFecha.setText(fechaActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lblCarro = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblNombreEmpresa1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblIconoTransaccion = new javax.swing.JLabel();
        lblIniciarSesion1 = new javax.swing.JLabel();
        rbtnCompra = new javax.swing.JRadioButton();
        rbtnVenta = new javax.swing.JRadioButton();
        btnGuardarTransaccion = new javax.swing.JButton();
        btnVaciarCampos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblUsuario4 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        comboxEmpleado = new javax.swing.JComboBox<>();
        comboxCliente = new javax.swing.JComboBox<>();
        lblUsuario1 = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        comboxVehiculo = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        lblUsuario3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nueva Transaccion");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 207, 125));

        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa.setText("Jaguar");
        jPanel1.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, -1));

        lblNombreEmpresa1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa1.setText("Automotores");
        jPanel1.add(lblNombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, -1));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 410));

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoTransaccion.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        pnlTitulo.add(lblIconoTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        lblIniciarSesion1.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblIniciarSesion1.setText("Transacción");
        pnlTitulo.add(lblIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 200, 50));

        jPanel1.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 60));

        rbtnCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnCompra.setText("Compra");
        rbtnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCompraActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        rbtnVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnVenta.setText("Venta");
        rbtnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVentaActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        btnGuardarTransaccion.setText("Guardar Transaccion");
        btnGuardarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, -1));

        btnVaciarCampos.setText("Vaciar Campos");
        btnVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnVaciarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 150, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFecha.setBackground(new java.awt.Color(204, 204, 204));
        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(153, 153, 153));
        lblFecha.setText(" ");

        lblUsuario4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario4.setText("Fecha:");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setText("Empleado:");

        comboxEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario1.setText("Cliente:");

        lblUsuario2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario2.setText("Vehiculo:");

        comboxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUsuario3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario3.setText("Precio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblUsuario3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblUsuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblUsuario2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboxVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario4)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 250, -1));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnRegresar.setText("(Regresar)");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCompraActionPerformed
        
        rbtnVenta.setSelected(false);
        TitledBorder titledBorder;              
    }//GEN-LAST:event_rbtnCompraActionPerformed

    private void rbtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVentaActionPerformed
        
        rbtnCompra.setSelected(false);
    }//GEN-LAST:event_rbtnVentaActionPerformed

    private void btnGuardarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTransaccionActionPerformed
        
    }//GEN-LAST:event_btnGuardarTransaccionActionPerformed

    private void btnVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarCamposActionPerformed
        
    }//GEN-LAST:event_btnVaciarCamposActionPerformed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        btnRegresar.setContentAreaFilled(true);
        btnRegresar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        btnRegresar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Transaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new Transaccion().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarTransaccion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVaciarCampos;
    private javax.swing.JComboBox<String> comboxCliente;
    private javax.swing.JComboBox<String> comboxEmpleado;
    private javax.swing.JComboBox<String> comboxVehiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconoTransaccion;
    private javax.swing.JLabel lblIniciarSesion1;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreEmpresa1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JRadioButton rbtnCompra;
    private javax.swing.JRadioButton rbtnVenta;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
