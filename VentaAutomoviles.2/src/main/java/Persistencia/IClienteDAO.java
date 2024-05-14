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
    
    Cliente agregarCliente(Cliente c) throws PersistenciaException;
    
    Cliente eliminarCliente(Cliente c) throws PersistenciaException;
    
    Cliente actualizarCliente(Cliente c) throws PersistenciaException;
    
    Cliente buscarClienteId(int id) throws PersistenciaException;
}