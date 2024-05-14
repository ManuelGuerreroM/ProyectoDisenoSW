
package frames;
import java.awt.Color;

/**
 * @author Equipo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
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
        btnReportes = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnVehiculos = new javax.swing.JButton();
        btnTransacciones = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnCerrarSession = new javax.swing.JButton();
        lblIniciarSesion1 = new javax.swing.JLabel();

        lblIniciarSesion.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblIniciarSesion.setText("Iniciar Sesión");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

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
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 410));

        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoReportes.png")); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, 50));

        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoEmpleados.png")); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 200, 50));

        btnVehiculos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVehiculos.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoVehiculo.png")); // NOI18N
        btnVehiculos.setText("Vehículos");
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 50));

        btnTransacciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTransacciones.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoTransaccion.png")); // NOI18N
        btnTransacciones.setText("Transacciones");
        btnTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 200, 50));

        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\labcisco\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoCliente.png")); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 200, 50));

        btnCerrarSession.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnCerrarSession.setText("(Cerrar Sesión)");
        btnCerrarSession.setBorder(null);
        btnCerrarSession.setContentAreaFilled(false);
        btnCerrarSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSessionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSessionMouseExited(evt);
            }
        });
        btnCerrarSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSessionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 70, 20));

        lblIniciarSesion1.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        lblIniciarSesion1.setText("Menú");
        jPanel1.add(lblIniciarSesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 100, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        NuevoCliente nuevoCliente = new NuevoCliente();
        nuevoCliente.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        NuevoEmpleado nuevoEmpleado = new NuevoEmpleado();
        nuevoEmpleado.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        NuevoVehiculo nuevoVehiculo = new NuevoVehiculo();
        nuevoVehiculo.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionesActionPerformed

    }//GEN-LAST:event_btnTransaccionesActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed

    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnCerrarSessionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSessionMouseEntered

        btnCerrarSession.setContentAreaFilled(true);
        btnCerrarSession.setBackground(Color.white);
    }//GEN-LAST:event_btnCerrarSessionMouseEntered

    private void btnCerrarSessionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSessionMouseExited

        btnCerrarSession.setContentAreaFilled(false);
    }//GEN-LAST:event_btnCerrarSessionMouseExited

    private void btnCerrarSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSessionActionPerformed
        
        IniciarSesion iniciarSesion = new IniciarSesion();
        iniciarSesion.mostrar();
        this.dispose();
    }//GEN-LAST:event_btnCerrarSessionActionPerformed


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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new MenuPrincipal().setVisible(true);}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSession;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTransacciones;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblIniciarSesion1;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreEmpresa1;
    // End of variables declaration//GEN-END:variables
}
