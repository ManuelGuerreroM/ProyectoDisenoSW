
package dtos;

/**
 * @author labcisco
 */
public class VehiculoDTO {
    
    private int id;
    private String agencia;
    private String modelo;
    private int año;
    private String color;
    private String numIdVehicular;
    private int lecturaOdometro;
    private String notasAdicionales;
    private enum estado[Disponible, vendido]

    public VehiculoDTO() {
    }

    public VehiculoDTO(int id) {
        this.id = id;
    }

    public VehiculoDTO(String agencia, String modelo, int año, String color, String numIdVehicular, int lecturaOdometro, String notasAdicionales, Bolean estado) {
        this.agencia = agencia;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.numIdVehicular = numIdVehicular;
        this.lecturaOdometro = lecturaOdometro;
        this.notasAdicionales = notasAdicionales;
        this.estado = estado;
    }

    public VehiculoDTO(int id, String agencia, String modelo, int año, String color, String numIdVehicular, int lecturaOdometro, String notasAdicionales, Bolean estado) {
        this.id = id;
        this.agencia = agencia;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.numIdVehicular = numIdVehicular;
        this.lecturaOdometro = lecturaOdometro;
        this.notasAdicionales = notasAdicionales;
        this.estado = estado;
    }

    public int getId() {
         return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumIdVehicular() {
        return numIdVehicular;
    }

    public void setNumIdVehicular(String numIdVehicular) {
        this.numIdVehicular = numIdVehicular;
    }

    public int getLecturaOdometro() {
        return lecturaOdometro;
    }

    public void setLecturaOdometro(int lecturaOdometro) {
        this.lecturaOdometro = lecturaOdometro;
    }

    public String getNotasAdicionales() {
        return notasAdicionales;
    }

    public void setNotasAdicionales(String notasAdicionales) {
        this.notasAdicionales = notasAdicionales;
    }

    public Bolean getEstado() {
        return estado;
    }

    public void setEstado(Bolean estado) {this.estado = estado;}

    @Override
    public String toString() {
        return "VehiculoDTO{" + "id=" + id + ", agencia=" + agencia + ", modelo=" + modelo + ", a\u00f1o=" + año + ", color=" + color + ", numIdVehicular=" + numIdVehicular + ", lecturaOdometro=" + lecturaOdometro + ", notasAdicionales=" + notasAdicionales + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
