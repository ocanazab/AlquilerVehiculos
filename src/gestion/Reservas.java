package gestion;
// Generated 10-ene-2020 12:41:48 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Reservas generated by hbm2java
 */
public class Reservas  implements java.io.Serializable {


     private int idReserva;
     private Clientes clientes;
     private Coches coches;
     private Date fechaInicio;
     private Date fechaDevolucion;
     private Float precioTotal;
     private Float litros;

    public Reservas() {
    }

	
    public Reservas(int idReserva, Date fechaInicio, Date fechaDevolucion) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
    }
    public Reservas(int idReserva, Clientes clientes, Coches coches, Date fechaInicio, Date fechaDevolucion, Float precioTotal, Float litros) {
       this.idReserva = idReserva;
       this.clientes = clientes;
       this.coches = coches;
       this.fechaInicio = fechaInicio;
       this.fechaDevolucion = fechaDevolucion;
       this.precioTotal = precioTotal;
       this.litros = litros;
    }
   
    public int getIdReserva() {
        return this.idReserva;
    }
    
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public Coches getCoches() {
        return this.coches;
    }
    
    public void setCoches(Coches coches) {
        this.coches = coches;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public Float getPrecioTotal() {
        return this.precioTotal;
    }
    
    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }
    public Float getLitros() {
        return this.litros;
    }
    
    public void setLitros(Float litros) {
        this.litros = litros;
    }




}


