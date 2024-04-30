
package dtos;
/**
 * @author 
 */
public class EmpleadoDTO {
    
    
    private int id;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String telefono;
    private String direccion;
    private String curp;
    private String correo;
    private String departamento;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int id) {
        this.id = id;
    }

    public EmpleadoDTO(String usuario, String contraseña, String nombre, String telefono, String direccion, String curp, String correo, String departamento) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.curp = curp;
        this.correo = correo;
        this.departamento = departamento;
    }

    public EmpleadoDTO(int id, String usuario, String contraseña, String nombre, String telefono, String direccion, String curp, String correo, String departamento) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.curp = curp;
        this.correo = correo;
        this.departamento = departamento;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public String getContraseña() {return contraseña;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getCurp() {return curp;}
    public void setCurp(String curp) {this.curp = curp;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}

    public String getDepartamento() {return departamento;}
    public void setDepartamento(String departamento) {this.departamento = departamento;}

    @Override
    public String toString() {
        return "EmpleadoDTO{" + "id=" + id + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", curp=" + curp + ", correo=" + correo + ", departamento=" + departamento + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
