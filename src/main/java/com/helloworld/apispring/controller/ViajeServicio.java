/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.ViajeRepositorio;
import com.helloworld.apispring.model.entity.Viaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Manuel Bello
 */
@Service
public class ViajeServicio {

    @Autowired
    private ViajeRepositorio viajeRepositorio;

    public ViajeServicio() {
    }

    public List<Viaje> getAllViajes() {
        return viajeRepositorio.getAllViajes();
    }

    public String crearViaje(Viaje viaje) {
        long viajeId = viajeRepositorio.crearViajes(viaje);
        return "vehiculo creado con ID:" + viajeId;
    }
}
