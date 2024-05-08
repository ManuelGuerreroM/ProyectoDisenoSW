/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Admin
 */
public class PersistenciaException extends Exception{
    public PersistenciaException(){}
    
    public PersistenciaException(String mensaje){
        super( mensaje);
    }
    
    public PersistenciaException(Throwable t){
        super( t);
    }
    
    public PersistenciaException(String mensaje, Throwable causa, boolean sup, boolean stackTrace){
        super(mensaje, causa, sup, stackTrace);
    }
}
