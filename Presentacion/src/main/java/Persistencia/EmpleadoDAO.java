/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import DTOs.EmpleadoDTO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class EmpleadoDAO implements IEmpleadoDAO{
    
    private final String INSERT = "INSERT INTO empleado (usuario, contraseña, nombreCompleto, curp, celular, correo) VALUES (?, ?, ?, ?, ?, ?)";
    private final String UPDATE= "UPDATE empleado SET usuario = ?, contraseña = ?, nombreCompleto = ?, curp = ?, celular = ?, correo = ? WHERE id = ?";
    private final String DELETE= "DELETE FROM empleado WHERE id = ?";
    private final String GETALL= "SELECT * FROM empleado";
    private final String GETONE= "SELECT * FROM empleado WHERE id = ?";
    
    private final Connection conexion;

    public EmpleadoDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public void agregarEmpleado(EmpleadoDTO empleado) {
        try {
            String sql = "INSERT INTO empleado (usuario, contraseña, nombreCompleto, curp, celular, correo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, empleado.getUsuario());
            statement.setString(2, empleado.getContraseña());
            statement.setString(3, empleado.getNombre());
            statement.setString(4, empleado.getCurp());
            statement.setString(5, empleado.getCelular());
            statement.setString(6, empleado.getCorreo());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizarEmpleado(EmpleadoDTO empleado) {
        try {
            String sql = "UPDATE empleado SET usuario = ?, contraseña = ?, nombreCompleto = ?, curp = ?, celular = ?, correo = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, empleado.getUsuario());
            statement.setString(2, empleado.getContraseña());
            statement.setString(3, empleado.getNombre());
            statement.setString(4, empleado.getCurp());
            statement.setString(5, empleado.getCelular());
            statement.setString(6, empleado.getCorreo());
            statement.setInt(8, empleado.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarEmpleado(int id) {
        try {
            String sql = "DELETE FROM empleado WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public EmpleadoDTO obtenerEmpleado(int id) {
        EmpleadoDTO empleado = null;
        try {
            String sql = "SELECT * FROM empleado WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                empleado = new EmpleadoDTO();
                empleado.setId(result.getInt("id"));
                empleado.setUsuario(result.getString("usuario"));
                empleado.setContraseña(result.getString("contraseña"));
                empleado.setNombre(result.getString("nombreCompleto"));
                empleado.setCurp(result.getString("curp"));
                empleado.setCelular(result.getString("celular"));
                empleado.setCorreo(result.getString("correo"));
                empleado.setAdministrador(result.getBoolean("esAdmin"));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }
   
    @Override
    public List<EmpleadoDTO> obtenerListaEmpleados() {
        List<EmpleadoDTO> empleados = new ArrayList<>();
        try {
            String sql = "SELECT * FROM empleado";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                EmpleadoDTO empleado = new EmpleadoDTO();
                empleado.setId(result.getInt("id"));
                empleado.setUsuario(result.getString("usuario"));
                empleado.setContraseña(result.getString("contraseña"));
                empleado.setNombre(result.getString("nombreCompleto"));
                empleado.setCurp(result.getString("curp"));
                empleado.setCelular(result.getString("celular"));
                empleado.setCorreo(result.getString("correo"));
                empleado.setAdministrador(result.getBoolean("esAdmin"));
                empleados.add(empleado);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }
    
    /*
    @Override
    public void agregarEmpleado(EmpleadoDTO empleado) throws PersistenciaException {
        PreparedStatement stat = null;
        try{
            stat = conexion.prepareStatement(INSERT);
            stat.setString(1, empleado.getUsuario());
            stat.setString(2, empleado.getContraseña());
            stat.setString(3, empleado.getNombre());
            stat.setString(4, empleado.getCurp());
            stat.setString(5, empleado.getCelular());
            stat.setString(6, empleado.getCorreo());
        }
    }

    @Override
    public void actualizarEmpleado(EmpleadoDTO empleado) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarEmpleado(EmpleadoDTO empleado) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EmpleadoDTO> obtenerListaEmpleados() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoDTO obtenerEmpleado() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */

}