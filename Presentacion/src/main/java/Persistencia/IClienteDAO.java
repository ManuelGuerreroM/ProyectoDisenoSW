/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import objetoNegocio.Cliente;

/**
 *
 * @author Admin
 */
public interface IClienteDAO {
    
    boolean agregarCliente(String nombre, String CURP, String celular, String correo, String noIne) throws PersistenciaException;
    
    Cliente eliminarCliente(Cliente c) throws PersistenciaException;
    
    Cliente actualizarCliente(Cliente c) throws PersistenciaException;
    
    Cliente buscarClienteId(int id) throws PersistenciaException;
}