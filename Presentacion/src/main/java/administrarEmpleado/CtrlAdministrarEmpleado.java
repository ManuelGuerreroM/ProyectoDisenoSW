/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrarEmpleado;

import DTOs.EmpleadoDTO;
import java.sql.SQLException;
import java.util.List;
import objetoNegocio.Empleado;
import persistencia.EmpleadoDAO;
import persistencia.IConexion;

/**
 *
 * @author Admin
 */
public class CtrlAdministrarEmpleado {
    private EmpleadoDAO empleadoDAO;

    public CtrlAdministrarEmpleado(IConexion conexion) throws SQLException {
      
    }

    public void agregarEmpleado(EmpleadoDTO empleado) {
        empleadoDAO.agregarEmpleado(empleado);
    }

    public void actualizarEmpleado(EmpleadoDTO empleado) {
        empleadoDAO.actualizarEmpleado(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.eliminarEmpleado(id);
    }

    public List<EmpleadoDTO> obtenerListaEmpleados() {
        return empleadoDAO.obtenerListaEmpleados();
    }
    
    public EmpleadoDTO obtenerEmpleado(int id) {
        return empleadoDAO.obtenerEmpleado(id);
    }
}
