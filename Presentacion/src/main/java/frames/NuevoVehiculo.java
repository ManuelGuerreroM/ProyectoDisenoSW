
package frames;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author Equipo2
 */
public class NuevoVehiculo extends javax.swing.JFrame {

    public NuevoVehiculo() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        lblCarro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoAuto.png"));
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\fondo.jpg"));
        lblIconoVehiculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoVehiculo.png"));
    }

    public void mostrar() { 
        setVisible(true); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblCarro = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblNombreEmpresa1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblIconoVehiculo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNiv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOdometro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotas = new javax.swing.JTextArea();
        btnVaciarCampos = new javax.swing.JButton();
        btnRegistrarVehiculo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        checkBoxVin = new javax.swing.JCheckBox();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Vehiculo");

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlPrincipal.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 207, 125));

        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa.setText("Jaguar");
        pnlPrincipal.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, -1));

        lblNombreEmpresa1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa1.setText("Automotores");
        pnlPrincipal.add(lblNombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 150, -1));
        pnlPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 460));

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoVehiculo.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        pnlTitulo.add(lblIconoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        lblTitulo.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblTitulo.setText("Vehículos");
        pnlTitulo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 50));

        pnlPrincipal.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 210, 60));

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Modelo:");

        jLabel2.setText("Agencia:");

        jLabel4.setText("Año:");

        jLabel5.setText("Color:");

        jLabel6.setText("NIV:");

        jLabel7.setText("Odometro:");

        jLabel8.setText("Notas Adicionales: ");

        txtNotas.setColumns(20);
        txtNotas.setRows(5);
        jScrollPane1.setViewportView(txtNotas);

        btnVaciarCampos.setText("Vaciar Campos");
        btnVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarCamposActionPerformed(evt);
            }
        });

        btnRegistrarVehiculo.setText("Registrar Vehículo");
        btnRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVehiculoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(188, 211, 215));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton1.setText("Verificar");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel5))
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo)
                            .addComponent(txtAño)
                            .addComponent(txtColor)
                            .addComponent(txtOdometro)
                            .addComponent(txtAgencia)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(txtNiv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBoxVin))))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(btnRegistrarVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVaciarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNiv, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkBoxVin, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOdometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarVehiculo)
                    .addComponent(btnVaciarCampos))
                .addGap(49, 49, 49))
        );

        pnlPrincipal.add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 66, 260, 360));

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
        pnlPrincipal.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVehiculoActionPerformed
        String agencia = txtAgencia.getText();
        String modelo = txtModelo.getText();
        String año = txtAño.getText();
        String color = txtColor.getText();
        String niv = txtNiv.getText();
        String odometro = txtOdometro.getText();
        
        if (validacion1()) {
            if (validacion2()) {
                
                //Registro TEMPORAL
                JOptionPane.showMessageDialog(NuevoVehiculo.this, 
                "El vehículo ha sido registrado.", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                MenuVehiculos menuVehiculos = new MenuVehiculos();
                menuVehiculos.mostrar();
                this.dispose();
            }else {
            JOptionPane.showMessageDialog(NuevoVehiculo.this, 
            "Verifique el NIV antes de continuar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else {
        JOptionPane.showMessageDialog(NuevoVehiculo.this, 
        "Favor de rellenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarVehiculoActionPerformed

    private void btnVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarCamposActionPerformed
        txtAgencia.setText("");
        txtModelo.setText("");
        txtAño.setText("");
        txtColor.setText("");
        txtNiv.setText("");
        txtOdometro.setText("");
        txtNotas.setText("");
    }//GEN-LAST:event_btnVaciarCamposActionPerformed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        btnRegresar.setContentAreaFilled(true);
        btnRegresar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        btnRegresar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuVehiculos menuVehiculos = new MenuVehiculos();
        menuVehiculos.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    
     //----------------- EXPRESIONES REGULARES ----------------------------------
    
    private boolean validacion1() {
        
        if (!txtAgencia.getText().trim().isEmpty() && !txtModelo.getText().trim().isEmpty() && 
            !txtAño.getText().trim().isEmpty() && !txtColor.getText().trim().isEmpty() &&
            !txtNiv.getText().trim().isEmpty() && !txtOdometro.getText().trim().isEmpty()){   
         return true;
        }return false;
    }
    private boolean validacion2() {
        
        if (checkBoxVin.isSelected()){   
         return true;
        }return false;
    }
    
    //--------------------------------------------------------------------------
    
    
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
            java.util.logging.Logger.getLogger(NuevoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new NuevoVehiculo().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarVehiculo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVaciarCampos;
    private javax.swing.JCheckBox checkBoxVin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconoVehiculo;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreEmpresa1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNiv;
    private javax.swing.JTextArea txtNotas;
    private javax.swing.JTextField txtOdometro;
    // End of variables declaration//GEN-END:variables
}
