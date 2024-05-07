
package objetoNegocio;

/**
 * @author Luis Eduardo Garces Rodriguez 181441
 */
public class Vehiculo {
    
    protected int id;
    protected String marca;
    protected String modelo;
    protected String añoFabricacion;
    protected String noIdentificacionVehiculo;
    protected String color;
    protected Float precio;
    protected int kilometraje;
    protected String notasAdicionales;

    public Vehiculo() {
    }

    public Vehiculo(int id) {
        this.id = id;
    }

    public Vehiculo(String marca, String modelo, String añoFabricacion, String noIdentificacionVehiculo, String color, Float precio, int kilometraje, String notasAdicionales) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.noIdentificacionVehiculo = noIdentificacionVehiculo;
        this.color = color;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.notasAdicionales = notasAdicionales;
    }
    
    public Vehiculo(int id, String marca, String modelo, String añoFabricacion, String noIdentificacionVehiculo, String color, Float precio, int kilometraje, String notasAdicionales) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.noIdentificacionVehiculo = noIdentificacionVehiculo;
        this.color = color;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.notasAdicionales = notasAdicionales;
    }
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getAñoFabricacion() {return añoFabricacion;}
    public void setAñoFabricacion(String añoFabricacion) {this.añoFabricacion = añoFabricacion;}

    public String getNoIdentificacionVehiculo() {return noIdentificacionVehiculo;}
    public void setNoIdentificacionVehiculo(String noIdentificacionVehiculo) {this.noIdentificacionVehiculo = noIdentificacionVehiculo;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public Float getPrecio() {return precio;}
    public void setPrecio(Float precio) {this.precio = precio;}

    public int getKilometraje() {return kilometraje;}
    public void setKilometraje(int kilometraje) {this.kilometraje = kilometraje;}

    public String getNotasAdicionales() {return notasAdicionales;}
    public void setNotasAdicionales(String notasAdicionales) {this.notasAdicionales = notasAdicionales;}
    
    public static void agregarVehiculo(int id, String marca, String modelo, String añoFabricacion, String noIdentificacionVehiculo,
                                       String color, Float pesoEnKg, Float precio, int kilometraje, String notasAdicionales) {
        
        Vehiculo vehiculo = new Vehiculo(id, marca, modelo, añoFabricacion, noIdentificacionVehiculo, color, precio, kilometraje, notasAdicionales);
        
        System.out.println(vehiculo.toString());
    }
    
    @Override
    public String toString() {
    return "Vehiculo " + id + " - Marca(" + marca + ") Modelo(" + modelo + ") AñoFabricacion(" + añoFabricacion +
            ") No.Identificacion(" + noIdentificacionVehiculo + ") Color(" + color +
            ") Precio(" + precio + ") Kilometraje(" + kilometraje + ") Notas(" + notasAdicionales + ")";
    }
    
}
