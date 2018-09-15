/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.VehiculoRepositorio;
import com.helloworld.apispring.model.entity.Vehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Manuel Bello
 */
@Service
public class VehiculoServicio {

    @Autowired
    private VehiculoRepositorio vehiculoRepositorio;

    public VehiculoServicio() {
    }

    public List<Vehiculo> getAllReserva() {
        return vehiculoRepositorio.getAllVehiculo();
    }

    public String crearVehiculo(Vehiculo vehiculo) {
        long vehiculoId = vehiculoRepositorio.crearVehiculo(vehiculo);
        return "vehiculo creado con ID:" + vehiculoId;
    }
}
