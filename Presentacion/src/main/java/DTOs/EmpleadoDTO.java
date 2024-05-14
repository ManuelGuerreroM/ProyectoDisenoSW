/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

/**
 *
 * @author Admin
 */
public class EmpleadoDTO {
    private int id;
    private String usuario;
    private String contraseña;
    protected String nombre;
    protected String Curp;
    protected String celular;
    protected String correo;
    protected Boolean Administrador;
    
    
    public EmpleadoDTO() {}

    public EmpleadoDTO(int id) {
        this.id = id;
    }
    //SIN ID
    public EmpleadoDTO(String usuario, String contraseña, String nombre, String Curp, String celular, String correo, Boolean Administrador) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.Curp = Curp;
        this.celular = celular;
        this.correo = correo;
        this.Administrador = Administrador;
    }
    //COMPLETO
    public EmpleadoDTO(int id, String usuario, String contraseña, String nombre, String Curp, String celular, String correo, Boolean Administrador) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.Curp = Curp;
        this.celular = celular;
        this.correo = correo;
        this.Administrador = Administrador;
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