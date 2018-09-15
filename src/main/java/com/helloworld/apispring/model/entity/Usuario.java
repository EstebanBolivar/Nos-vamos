package com.helloworld.apispring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idusuario;

    @Column(name = "nombre_usuario")
    private String nombreusuario;
    
    @Column(name = "apellido_usuario")
    private String apellidousuario;

    @Column
    private Integer fechanacimiento;
     
    @Column
    private Integer telefono;
    
    @Column
    private String direccion;
    
    @Column
    private Integer Tipousuario;  

    public Usuario() {
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    public Integer getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Integer fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTipousuario() {
        return Tipousuario;
    }

    public void setTipousuario(Integer Tipousuario) {
        this.Tipousuario = Tipousuario;
    }   
}
