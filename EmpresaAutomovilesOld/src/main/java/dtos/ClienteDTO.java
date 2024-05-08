
package dtos;

/**
 * @author labcisco
 */
public class ClienteDTO {
    
    private int id;
    private String nombre;
    private String telefono;
    private String curp;    
    private String correo;

    public ClienteDTO() {
    }

    public ClienteDTO(int id) {
        this.id = id;
    }

    public ClienteDTO(String nombre, String telefono, String curp, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.curp = curp;
        this.correo = correo;
    }

    public ClienteDTO(int id, String nombre, String telefono, String curp, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.curp = curp;
        this.correo = correo;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getCurp() {return curp;}
    public void setCurp(String curp) {this.curp = curp;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;
    
    @Override
    public String toString() {
        return "ClienteDTO{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", curp=" + curp + ", correo=" + correo + '}';
    }
}
    
    
    
}
