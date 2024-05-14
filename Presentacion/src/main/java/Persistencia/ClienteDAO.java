
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
public class ClienteDAO implements IClienteDAO{
    
    private final IConexion conexion;
    //private static final Logger Log = Logger.getLogger();
    public ClienteDAO(IConexion conexion){
        this.conexion = conexion;
    }

    @Override
    public Cliente agregarCliente(Cliente c) throws PersistenciaException {
        String crearCliente = "INSERT INTO cliente (nombre, CURP, celular, correo, noIne) " +
                    "VALUES (?, ?, ?, ?, ?)";
        Cliente resultado = null;
      
        try {
            Connection con =  conexion.crearConexion();
            PreparedStatement insert = con.prepareStatement(crearCliente);
            insert.setString(1, c.getNombre());
            insert.setString(2, c.getCURP());
            insert.setString(3, c.getCelular());
            insert.setString(4, c.getCorreo());
            insert.setString(5, c.getNoINE());
            insert.executeUpdate();
            
            ResultSet res = insert.getGeneratedKeys();         
            
            if (res.next()) {
                Integer id = res.getInt(Statement.RETURN_GENERATED_KEYS);
                
                resultado = buscarClienteId(id);
                
               // resultado = new Cliente(id, res.getString("nombres"), res.getString("ap_paterno"), 
               // res.getString("ap_materno"), res.getString("telefono"), res.getDate("fechaInicioLabores"));
                
                return resultado;
            }
            
        }catch(SQLException e){
            //Log.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException ("No fue posible agregar el Activista");
        }
        return resultado;
    }

    @Override
    public Cliente eliminarCliente(Cliente c) throws PersistenciaException {
        Cliente result =  buscarClienteId(c.getId());
        //String buscarCliente = "DELETE * FROM cliente WHERE id = " + result.getId();
        System.out.println(result);
        return null;
    }

    @Override
    public Cliente actualizarCliente(Cliente c) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente buscarClienteId(int id) throws PersistenciaException {
        String buscarCliente = "SELECT * FROM cliente WHERE id = " + id;
        
        Cliente resultado = null;
        
        try {
            Connection con =  conexion.crearConexion();
            PreparedStatement insert = con.prepareStatement(buscarCliente);          
            
            ResultSet res = insert.getGeneratedKeys();         
            
            if (res.next()) {
                Integer idResultado = res.getInt("id");
                resultado = new Cliente(idResultado, res.getString("nombre"), res.getString("curp"), 
                        res.getString("celular"), res.getString("correo"), res.getString("noIne"));
                
                return resultado;
            }
            
        }catch(SQLException e){
           // Log.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException ("No fue posible buscar el Activista");
        }
        return resultado;
    }
}