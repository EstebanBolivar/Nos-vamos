/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.entity;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author esteb
 */
@Entity
@Table(name = "usuario")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idViaje")
    private Integer idViaje;

    @Column(name = "fecha_viaje")
    private Date fechaVijae;

    @Column(name = "origen")
    private String origen;

    @Column(name = "destino")
    private Integer destino;

    @Column(name = "hora_viaje")
    private Time horaViaje;

    @Column(name = "precio_viaje")
    private String direccion;

    @Column(name = "num_cupos")
    private Integer numCupos;

    @JoinColumn(name = "idvehiculo")
    private Integer idVehiculo;

    public Viaje() {

    }

    public Integer getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Integer idViaje) {
        this.idViaje = idViaje;
    }

    public Date getFechaVijae() {
        return fechaVijae;
    }

    public void setFechaVijae(Date fechaVijae) {
        this.fechaVijae = fechaVijae;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }

    public Time getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(Time horaViaje) {
        this.horaViaje = horaViaje;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumCupos() {
        return numCupos;
    }

    public void setNumCupos(Integer numCupos) {
        this.numCupos = numCupos;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

}
