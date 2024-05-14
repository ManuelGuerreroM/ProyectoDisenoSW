/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package administrarEmpleado;

import DTOs.EmpleadoDTO;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IAdministrarEmpleado {
    void agregarEmpleado(String usuario, String contraseña, String nombreCompleto, String curp, String celular, String correo);
    void actualizarEmpleado(int id, String usuario, String contraseña, String nombreCompleto, String curp, String celular, String correo, boolean esAdmin);
    void eliminarEmpleado(int id);
    List<EmpleadoDTO> obtenerListaEmpleados();
    EmpleadoDTO obtenerEmpleado(int id);
}

