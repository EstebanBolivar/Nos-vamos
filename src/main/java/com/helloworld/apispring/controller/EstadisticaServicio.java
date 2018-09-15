package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.EstadisticaRepositorio;
import com.helloworld.apispring.model.entity.Estadistica;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadisticaServicio {
    
    @Autowired
    private EstadisticaRepositorio estadisticaRepositorio;

    public EstadisticaServicio() {
    }
    
    public List<Estadistica> getAllEstadistica(){
        return estadisticaRepositorio.getAllEstadistica();
    }
    
    public String crearEstadistica(Estadistica estadistica) {
    long idestadistica= estadisticaRepositorio.crearEstadistica(estadistica);
    return "Estadistica creada con ID:"+idestadistica;
    }
}
