/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrarEmpleado;

import objetoNegocio.Empleado;
import DTOs.EmpleadoDTO;
import java.sql.SQLException;
import java.util.List;
import persistencia.IConexion;

/**
 *
 * @author Admin
 */
public class FacadeAdministrarEmpleado {
    private CtrlAdministrarEmpleado ctrlAdministrarEmpleado;
    
    public FacadeAdministrarEmpleado(IConexion conexion) throws SQLException {
        this.ctrlAdministrarEmpleado = new CtrlAdministrarEmpleado(conexion);
    }

    public void agregarEmpleado(String usuario, String contraseña, String nombreCompleto, String curp, String celular, String correo) {
        EmpleadoDTO empleado = new EmpleadoDTO();
        empleado.setUsuario(usuario);
        empleado.setContraseña(contraseña);
        empleado.setNombre(nombreCompleto);
        empleado.setCurp(curp);
        empleado.setCelular(celular);
        empleado.setCorreo(correo);
        ctrlAdministrarEmpleado.agregarEmpleado(empleado);
    }

    public void actualizarEmpleado(int id, String usuario, String contraseña, String nombreCompleto, String curp, String celular, String correo, boolean esAdmin) {
        EmpleadoDTO empleado = new EmpleadoDTO();
        empleado.setId(id);
        empleado.setUsuario(usuario);
        empleado.setContraseña(contraseña);
        empleado.setNombre(nombreCompleto);
        empleado.setCurp(curp);
        empleado.setCelular(celular);
        empleado.setCorreo(correo);
        ctrlAdministrarEmpleado.actualizarEmpleado(empleado);
    }

    public void eliminarEmpleado(int id) {
        ctrlAdministrarEmpleado.eliminarEmpleado(id);
    }

    public List<EmpleadoDTO> obtenerListaEmpleados() {
        return ctrlAdministrarEmpleado.obtenerListaEmpleados();
    }
    
    public EmpleadoDTO obtenerEmpleado(int id) {
        return ctrlAdministrarEmpleado.obtenerEmpleado(id);
    }
}
