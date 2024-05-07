
package objetoNegocio;

/**
 * @author Luis Eduardo Garces Rodriguez 181441
 */
public class Empleado {
 
    private int id;
    private String usuario;
    private String contraseña;
    protected String nombre;
    protected String Curp;
    protected String celular;
    protected String correo;
    protected Boolean Administrador;
    
    
    public Empleado() {}

    public Empleado(int id) {
        this.id = id;
    }
    //SIN ID
    public Empleado(String usuario, String contraseña, String nombre, String Curp, String celular, String correo, Boolean Administrador) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.Curp = Curp;
        this.celular = celular;
        this.correo = correo;
        this.Administrador = Administrador;
    }
    //COMPLETO
    public Empleado(int id, String usuario, String contraseña, String nombre, String Curp, String celular, String correo, Boolean Administrador) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.Curp = Curp;
        this.celular = celular;
        this.correo = correo;
        this.Administrador = Administrador;
    }

    
    
    public static void registrarUsuario(int id, String usuario, String contraseña, String nombre, String curp, 
                                 String celular, String correo, Boolean administrador){
        
        Empleado empleado = new Empleado(id, usuario, contraseña, nombre, curp, celular, correo, administrador);
        System.out.println(empleado.toString());
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", Curp=" + Curp + ", celular=" + celular + ", correo=" + correo + ", Administrador=" + Administrador + '}';
    }
    
    public int getId() {return id;}
    public void setId(int id) {    this.id = id;}

    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public String getContraseña() {return contraseña;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCurp() {return Curp;}
    public void setCurp(String Curp) {this.Curp = Curp;}

    public String getCelular() {return celular;}
    public void setCelular(String celular) {this.celular = celular;}

    public Boolean getAdministrador() {return Administrador;}
    public void setAdministrador(Boolean Administrador) {this.Administrador = Administrador;}
    
}
