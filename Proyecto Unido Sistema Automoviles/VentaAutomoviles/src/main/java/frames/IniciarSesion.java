
package frames;
import java.awt.Color;

/**
 * @author Equipo
 */
public class IniciarSesion extends javax.swing.JFrame {

    
    public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void mostrar() { 
        setVisible(true); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCarro = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblNombreEmpresa1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnIniciarSesion = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        btnNuevoUsuario = new javax.swing.JButton();
        txtUsuario1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCarro.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\main\\java\\recursos\\iconoAuto.png")); // NOI18N
        jPanel1.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 207, 125));
        lblCarro.getAccessibleContext().setAccessibleParent(this);

        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa.setText("Jaguar");
        jPanel1.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, -1));

        lblNombreEmpresa1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa1.setText("Automotores");
        jPanel1.add(lblNombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\main\\java\\recursos\\fondo.jpg")); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 310));
        lblFondo.getAccessibleContext().setAccessibleParent(this);

        lblIniciarSesion.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblIniciarSesion.setText("Iniciar Sesión");
        jPanel1.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, 30));

        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("**********************");
        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 204, 10));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 202, 20));

        btnIniciarSesion.setText("Continuar");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 130, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 202, 10));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 20));

        btnNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnNuevoUsuario.setText("(Crear nuevo usuario)");
        btnNuevoUsuario.setBorder(null);
        btnNuevoUsuario.setContentAreaFilled(false);
        btnNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoUsuarioMouseExited(evt);
            }
        });
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 100, 20));

        txtUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario1.setText("Ingrese su nombre de usuario..");
        txtUsuario1.setBorder(null);
        jPanel1.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 204, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
        String usuario = txtContraseña.getText();
        String contraseña = txtContraseña.getText();
        
        
        //Si el usuario y contraseña estan correctos ..
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
    
        NuevoEmpleado nuevoEmpleado = new NuevoEmpleado();
        nuevoEmpleado.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnNuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioMouseEntered
        
        btnNuevoUsuario.setContentAreaFilled(true);
        btnNuevoUsuario.setBackground(Color.white);
    }//GEN-LAST:event_btnNuevoUsuarioMouseEntered

    private void btnNuevoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioMouseExited
        
        btnNuevoUsuario.setContentAreaFilled(false);
    }//GEN-LAST:event_btnNuevoUsuarioMouseExited

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new IniciarSesion().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreEmpresa1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
