package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.entity.Estadistica;
import com.helloworld.apispring.model.entity.Reserva;
import com.helloworld.apispring.model.entity.Usuario;
import com.helloworld.apispring.model.entity.Vehiculo;
import com.helloworld.apispring.model.entity.Viaje;
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
    private ReservaServicio reservaServicio;
    private VehiculoServicio vehiculoServicio;
    private ViajeServicio viajeServicio;

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

    @RequestMapping(value = "/Reservas/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearReserva(@RequestBody Reserva reserva) {
        String resultado = reservaServicio.crearReserva(reserva);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/Reservas/", method = RequestMethod.GET)
    public ResponseEntity<List<Reserva>> obtenerReservas() {
        List<Reserva> reserva = reservaServicio.getAllReserva();
        return new ResponseEntity<List<Reserva>>(reserva, HttpStatus.OK);
    }

    @RequestMapping(value = "/Vehiculos/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearVehiculo(@RequestBody Vehiculo vehiculo) {
        String resultado = vehiculoServicio.crearVehiculo(vehiculo);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/Vehiculos/", method = RequestMethod.GET)
    public ResponseEntity<List<Vehiculo>> obtenerVehiculo() {
        List<Vehiculo> vehiculo = vehiculoServicio.getAllReserva();
        return new ResponseEntity<List<Vehiculo>>(vehiculo, HttpStatus.OK);
    }

    @RequestMapping(value = "/Viajes/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearViaje(@RequestBody Viaje viaje) {
        String resultado = viajeServicio.crearViaje(viaje);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }

    @RequestMapping(value = "/Viajes/", method = RequestMethod.GET)
    public ResponseEntity<List<Viaje>> obtenerViajes() {
        List<Viaje> viaje = viajeServicio.getAllViajes();
        return new ResponseEntity<List<Viaje>>(viaje, HttpStatus.OK);
    }
}
