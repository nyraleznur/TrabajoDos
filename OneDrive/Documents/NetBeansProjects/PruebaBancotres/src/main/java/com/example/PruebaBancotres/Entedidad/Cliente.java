
package com.example.PruebaBancotres.Entedidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clientete")
public class Cliente {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,length = 13)
    private int docunemto;
 
    @Column(name="nombre",nullable = false,length=50)
    private String nombre;
    @Column(name="apellido",nullable = false,length=50)
    private String apellido;
    @Column(name="celular",nullable = false,length=50)
    private String celular;
    @Column(name="correo",nullable = false,length=50,unique = true)
    private String correo;
    @Column(name="edad",nullable = false,length=50)
    private int edad;
    @Column(name="fecha",nullable = false,length=50)
    private Date fecha;
   
    public Cliente() {
    }

    public Cliente(int docunemto, String nombre, String apellido, String celular, String correo, int edad, Date fecha) {
        this.docunemto = docunemto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.edad = edad;
        this.fecha = fecha;
    }

    public int getDocunemto() {
        return docunemto;
    }

    public void setDocunemto(int docunemto) {
        this.docunemto = docunemto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cliente{" + "docunemto=" + docunemto + ", nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + ", correo=" + correo + ", edad=" + edad + ", fecha=" + fecha + '}';
    }
    
    
    
    
    
}
