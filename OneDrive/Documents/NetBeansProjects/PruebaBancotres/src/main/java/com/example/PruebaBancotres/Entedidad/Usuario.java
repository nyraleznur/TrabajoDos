package com.example.PruebaBancotres.Entedidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="usuarioT")
public class Usuario {
   @javax.persistence.Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,length = 13)
    
    private int documento;
    @Column(name = "usuario",nullable = false, length = 50)
    private String usuario;
    @Column(name = "clave", nullable = false, length = 50)
    private  String clave;
    @Column(name="rol", nullable = false, length = 50 )
    private  String rol;
    @Column(name="estado", nullable = false, length = 50 )
    private  String estado;
    
    @OneToOne
     @JoinColumn(name="docunemto")
     private Cliente cliente;
   
    
    
    
    
    public Usuario(int documento, String usuario, String clave, String rol, String estado) {
        this.documento = documento;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
    } 
    
    

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
