
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import objetoNegocio.Cliente;

/**
 * @author Equipo2
 */
public class ClienteDAO extends Conexion implements IClienteDAO {

    public ClienteDAO() {
    }
    Conexion conex = new Conexion();
    
    /**
     * Registra a un nuevo cliente en la base de datos.
     *
     * @param nombre
     * @param CURP
     * @param celular
     * @param correo
     * @param noIne
     * @return true si el registro es exitoso, false en caso contrario.
     */
    @Override
    public boolean agregarCliente(String nombre, String CURP, String celular, String correo, String noIne) {
        PreparedStatement pst = null;
        try {
            String consulta = "insert into cliente(nombreCompleto, curp, celular, correo, noIne) values(?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, CURP);
            pst.setString(3, celular);
            pst.setString(4, correo);
            pst.setString(5, noIne);

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error en " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    conex.getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                };
            } catch (Exception e) {
                System.out.println("Error en " + e);
            }

        }
        return false;
    }

    @Override
    public Cliente eliminarCliente(Cliente c) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente actualizarCliente(Cliente c) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente buscarClienteId(int id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}