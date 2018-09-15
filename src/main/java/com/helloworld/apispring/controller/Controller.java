package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.entity.Estadistica;
import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    private UsuarioServicio usuarioServicio;
    private EstadisticaServicio estadisticaServicio;

    @RequestMapping(value = "/usuarios/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario) {
        String resultado = usuarioServicio.crearUsuario(usuario);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/usuarios/", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> obtenerUsuario() {
        List<Usuario> usuarios = usuarioServicio.getAllUsuario();
        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/estadisticas/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearEstadistica(@RequestBody Estadistica estadistica) {
        String resultado = estadisticaServicio.crearEstadistica(estadistica);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/estadisticas/", method = RequestMethod.GET)
    public ResponseEntity<List<Estadistica>> obtenerEstadistica() {
        List<Estadistica> estadisticas = estadisticaServicio.getAllEstadistica();
        return new ResponseEntity<List<Estadistica>>(estadisticas, HttpStatus.OK);
    }
    
}
