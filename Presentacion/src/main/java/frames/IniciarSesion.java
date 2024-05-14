
package frames;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 * @author Equipo2
 */
public class IniciarSesion extends javax.swing.JFrame {

    public IniciarSesion() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setLocationByPlatform(false);
        lblCarro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\iconoAuto.png"));
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genesis\\Desktop\\VentaAutomoviles\\src\\recursos\\fondo.jpg"));
    }

    public void mostrar() { setVisible(true); }
    
    //--------------------------------------------------------------------------
    
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
        String usuario = txtContraseña.getText();
        String contraseña = txtContraseña.getText();
        
        if (validacion()) {
            
            
            //LOGIN TEMPORAL
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.mostrar();
            this.dispose();
        } 
        else {
        JOptionPane.showMessageDialog(IniciarSesion.this, 
        "Usuario o contraña incorrecto, favor verifique.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarCamposActionPerformed
        txtUsuario1.setText("Ingrese su nombre de usuario..");
        txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
        txtUsuario1.setFocusable(false);
        txtContraseña.setText("**********************");
        txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
        txtContraseña.setFocusable(false);
    }//GEN-LAST:event_btnVaciarCamposActionPerformed

    //----------------- EXPRESIONES REGULARES ----------------------------------
    
    private boolean validacion() {
        
        if (!txtUsuario1.getText().equals("Ingrese su nombre de usuario..") &&
                !txtContraseña.getText().equals("**********************")) 
        {if (!txtUsuario1.getText().equals(" ") && !txtContraseña.getText().equals(" ")) {
           return true;        
        }} return false; 
    }
    
    //--------------------------------------------------------------------------
    
    //<editor-fold defaultstate="collapsed" desc="// Eventos Mouse & Focus">
    
    private void txtUsuario1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuario1FocusGained
        if (txtUsuario1.getText().equals("Ingrese su nombre de usuario..")) {
                    txtUsuario1.setText("");
                    txtUsuario1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsuario1FocusGained

    private void txtUsuario1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuario1FocusLost
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
        }
    }//GEN-LAST:event_txtUsuario1FocusLost

    private void txtUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario1MouseClicked
        txtUsuario1.setFocusable(true);
        txtUsuario1.requestFocusInWindow();   
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        } 
    }//GEN-LAST:event_txtUsuario1MouseClicked

    private void lblFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMouseClicked
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        }
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        } 
    }//GEN-LAST:event_lblFondoMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
                }
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
                } 
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
                } 
        txtContraseña.setFocusable(true);
        txtContraseña.requestFocusInWindow();   
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtUsuario1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario1MouseDragged
        txtUsuario1.setFocusable(true);
        txtUsuario1.requestFocusInWindow();
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        } 
    }//GEN-LAST:event_txtUsuario1MouseDragged

    private void txtContraseñaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseDragged
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        } 
        txtContraseña.setFocusable(true);
        txtContraseña.requestFocusInWindow();
    }//GEN-LAST:event_txtContraseñaMouseDragged

    private void lblFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMouseDragged
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        } 
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        } 
    }//GEN-LAST:event_lblFondoMouseDragged

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        } 
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        } 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        if (txtContraseña.getText().equals("**********************")) {
                    txtContraseña.setText("");
                    txtContraseña.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtContraseñaFocusGained



    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        } 
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        } 
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnIniciarSesionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseDragged
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        } 
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        } 
    }//GEN-LAST:event_btnIniciarSesionMouseDragged

    private void btnVaciarCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarCamposMouseClicked
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        } 
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        }
    }//GEN-LAST:event_btnVaciarCamposMouseClicked

    private void btnVaciarCamposMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarCamposMouseDragged
        if (txtUsuario1.getText().isEmpty()) {
                    txtUsuario1.setText("Ingrese su nombre de usuario..");
                    txtUsuario1.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtUsuario1.setFocusable(false);
        } 
        if (txtContraseña.getText().isEmpty()) {
                    txtContraseña.setText("**********************");
                    txtContraseña.setForeground(new Color(0xcc, 0xcc, 0xcc));
                    txtContraseña.setFocusable(false);
        }
    }//GEN-LAST:event_btnVaciarCamposMouseDragged

//</editor-fold>
    
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
        txtUsuario1 = new javax.swing.JTextField();
        btnVaciarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 207, 125));
        lblCarro.getAccessibleContext().setAccessibleParent(this);

        lblNombreEmpresa.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa.setText("Jaguar");
        jPanel1.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, -1));

        lblNombreEmpresa1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        lblNombreEmpresa1.setText("Automotores");
        jPanel1.add(lblNombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, -1));

        lblFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondoMouseDragged(evt);
            }
        });
        lblFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFondoMouseClicked(evt);
            }
        });
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
        txtContraseña.setFocusable(false);
        txtContraseña.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseDragged(evt);
            }
        });
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 204, 10));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 202, 20));

        btnIniciarSesion.setText("Continuar");
        btnIniciarSesion.setFocusable(false);
        btnIniciarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseDragged(evt);
            }
        });
        
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 140, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 202, 10));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 20));

        txtUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario1.setText("Ingrese su nombre de usuario..");
        txtUsuario1.setBorder(null);
        txtUsuario1.setFocusable(false);
        txtUsuario1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtUsuario1MouseDragged(evt);
            }
        });
        txtUsuario1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuario1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuario1FocusLost(evt);
            }
        });
        txtUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuario1MouseClicked(evt);
            }
        });
        jPanel1.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 204, 20));

        btnVaciarCampos.setText("Vaciar Campos");
        btnVaciarCampos.setFocusable(false);
        btnVaciarCampos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnVaciarCamposMouseDragged(evt);
            }
        });
        btnVaciarCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarCamposMouseClicked(evt);
            }
        });
        btnVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnVaciarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 140, 20));

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

    //--------------------------------------------------------------------------
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="// Look and feel setting code">
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
    private javax.swing.JButton btnVaciarCampos;
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
