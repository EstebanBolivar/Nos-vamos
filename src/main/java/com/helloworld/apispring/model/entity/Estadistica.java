package com.helloworld.apispring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static org.hibernate.engine.internal.Cascade.cascade;

@Entity
@Table(name="estadistica")
public class Estadistica {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_estadistica")
    private Integer idestadistica;

    @Column(name = "viaje_anterior")//duda
    private String viajeanterior;
    
    @Column(name = "proximo_viaje")
    private String proximoviaje;

    @Column(name = "viaje_mas_publicado")
    private String viajemaspublicado;
     
    @Column(name = "cantidad_cupos")
    private Integer cantidadcupos;
    
    @Column(name = "precio_viaje")
    private Integer precioviaje;
    
    @JoinColumn(name = "id_viaje")
    private Viaje idviaje;  
    
    //@ManyToOne(mappedby = "Viaje", cascade = CascadeType )//duda

    public Estadistica() {
    }

    public Integer getIdestadistica() {
        return idestadistica;
    }

    public void setIdestadistica(Integer idestadistica) {
        this.idestadistica = idestadistica;
    }

    public String getViajeanterior() {
        return viajeanterior;
    }

    public void setViajeanterior(String viajeanterior) {
        this.viajeanterior = viajeanterior;
    }

    public String getProximoviaje() {
        return proximoviaje;
    }

    public void setProximoviaje(String proximoviaje) {
        this.proximoviaje = proximoviaje;
    }

    public String getViajemaspublicado() {
        return viajemaspublicado;
    }

    public void setViajemaspublicado(String viajemaspublicado) {
        this.viajemaspublicado = viajemaspublicado;
    }

    public Integer getCantidadcupos() {
        return cantidadcupos;
    }

    public void setCantidadcupos(Integer cantidadcupos) {
        this.cantidadcupos = cantidadcupos;
    }

    public Integer getPrecioviaje() {
        return precioviaje;
    }

    public void setPrecioviaje(Integer precioviaje) {
        this.precioviaje = precioviaje;
    }

    public Viaje getIdviaje() {
        return idviaje;
    }

    public void setIdviaje(Viaje idviaje) {
        this.idviaje = idviaje;
    }
    
    
}
