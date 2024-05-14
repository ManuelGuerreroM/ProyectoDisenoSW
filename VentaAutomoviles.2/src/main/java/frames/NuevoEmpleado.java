
package frames;
import java.awt.Color;
import objetoNegocio.Empleado;

/**
 * @author Equipo
 */
public class NuevoEmpleado extends javax.swing.JFrame {
    
    public NuevoEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void mostrar() { 
        setVisible(true); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIniciarSesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCarro = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblNombreEmpresa1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblNuevoEmpleado = new javax.swing.JLabel();
        lblIniciarSesion1 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        txtContraseña = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnVaciarCampos = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        lblIniciarSesion.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblIniciarSesion.setText("Iniciar Sesión");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Empleado");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCarro.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\main\\java\\recursos\\iconoAuto.png")); // NOI18N
        jPanel1.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 207, 125));

        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa.setText("Jaguar");
        jPanel1.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, -1));

        lblNombreEmpresa1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa1.setText("Automotores");
        jPanel1.add(lblNombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\main\\java\\recursos\\fondo.jpg")); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 460));

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lblNuevoEmpleado.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblNuevoEmpleado.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoEmpleados.png")); // NOI18N

        lblIniciarSesion1.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblIniciarSesion1.setText("Empleados");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIniciarSesion1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevoEmpleado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 240, 60));

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Contraseña:");

        jLabel2.setText("Usuario:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Curp:");

        jLabel7.setText("Correo:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel5))
                        .addGroup(pnlDatosLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario)
                    .addComponent(txtContraseña)
                    .addComponent(txtNombre)
                    .addComponent(txtTelefono)
                    .addComponent(txtCurp)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        jPanel1.add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 260, 230));

        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 150, -1));

        btnVaciarCampos.setText("Vaciar Campos");
        btnVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnVaciarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 150, -1));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoMenuPrincipal.png")); // NOI18N
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
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        btnRegresar.setContentAreaFilled(true);
        btnRegresar.setBackground(Color.white);
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        btnRegresar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarCamposActionPerformed
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtCurp.setText("");
    }//GEN-LAST:event_btnVaciarCamposActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        
        Empleado empleado = new Empleado();
        
        
        
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new NuevoEmpleado().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVaciarCampos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblIniciarSesion1;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreEmpresa1;
    private javax.swing.JLabel lblNuevoEmpleado;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
