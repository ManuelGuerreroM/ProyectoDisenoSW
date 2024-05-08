
package objetoNegocio;

/**
 * Luis Eduardo Garces Rodriguez 181441
 */
public class Cliente {
    
        private int id;
        private String nombre;
        private String CURP;
        private String celular;
        private String correo;
        private String noIne;

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(String nombre, String CURP, String celular, String correo, String noIne) {
        this.nombre = nombre;
        this.CURP = CURP;
        this.celular = celular;
        this.correo = correo;
        this.noIne = noIne;
    }

    public Cliente(int id, String nombre, String CURP, String celular, String correo, String noIne) {
        this.id = id;
        this.nombre = nombre;
        this.CURP = CURP;
        this.celular = celular;
        this.correo = correo;
        this.noIne = noIne;
    }

    public static void registrarCliente(int id, String nombre, String CURP, 
                                 String celular, String correo, String noIne){
        
        Cliente cliente = new Cliente(id, nombre, CURP, celular, correo, noIne);
        System.out.println(cliente.toString());
    }

    public int getId() { return id;}
    public void setId(int id) {this.id = id;}
    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCURP() {return CURP;}
    public void setCURP(String CURP) {this.CURP = CURP;}

    public String getCelular() {return celular;}
    public void setCelular(String celular) {this.celular = celular;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}

    public String getNoINE() {return noIne;}
    public void setNoIne(String direccion) {this.noIne = noIne;}

    @Override
    public String toString() {
        return "Cliente | " + "id=" + id + ", nombre=" + nombre + ", CURP=" + CURP + ", celular=" + celular + ", correo=" + correo + ", NumINE=" + noIne + '}';
    }
       
}
