/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import java.util.List;
import DTOs.EmpleadoDTO;
/**
 *
 * @author Admin
 */
public interface IEmpleadoDAO {
    
    void agregarEmpleado(EmpleadoDTO empleado) throws PersistenciaException;
    void actualizarEmpleado(EmpleadoDTO empleado) throws PersistenciaException;
    void eliminarEmpleado(int id) throws PersistenciaException;
    List<EmpleadoDTO> obtenerListaEmpleados() throws PersistenciaException;
    EmpleadoDTO obtenerEmpleado(int id) throws PersistenciaException;
}