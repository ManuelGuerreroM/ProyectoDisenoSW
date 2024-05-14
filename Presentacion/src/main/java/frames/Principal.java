/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frames;

import persistencia.Conexion;

/**
 * Clase principal del proyecto
 * @author Admin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Te manda al inicio de sesion
        IniciarSesion iniciarSesion = new IniciarSesion();
        iniciarSesion.setVisible(true);
    }
    
}
