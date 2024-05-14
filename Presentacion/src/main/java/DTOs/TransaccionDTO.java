/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class TransaccionDTO {
    int id;
    Date fecha;
    Float precio;
    String empleado;
    String cliente;
    String vehiculo;
    String tipoTransaccion;

    public TransaccionDTO() {
    }

    public TransaccionDTO(int id) {
        this.id = id;
    }
    
    public TransaccionDTO(Date fecha, Float precio, String empleado, String cliente, String vehiculo, String tipoTransaccion) {
        this.fecha = fecha;
        this.precio = precio;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tipoTransaccion = tipoTransaccion;
    }

    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public Float getPrecio() {return precio;}
    public void setPrecio(Float precio) {this.precio = precio;}

    public String getEmpleado() {return empleado;}
    public void setEmpleado(String empleado) {this.empleado = empleado;}

    public String getCliente() {return cliente;}
    public void setCliente(String cliente) {this.cliente = cliente;}

    public String getVehiculo() {return vehiculo;}
    public void setVehiculo(String vehiculo) {this.vehiculo = vehiculo;}

    public String getTipoTransaccion() {return tipoTransaccion;}
    public void setTipoTransaccion(String tipoTransaccion) {this.tipoTransaccion = tipoTransaccion;}

    @Override
    public String toString() {
        return "Transaccion{" + "fecha=" + fecha + ", precio=" + precio + ", empleado=" + empleado + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", tipoTransaccion=" + tipoTransaccion + '}';
    }
    
    
}
