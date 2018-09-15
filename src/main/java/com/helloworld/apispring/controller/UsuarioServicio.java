package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.UsuarioRepositorio;
import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicio() {
    }       

    public List<Usuario> getAllUsuario() {
        return usuarioRepositorio.getAllUsuario();
    }

    public String crearUsuario(Usuario usuario) {
        long UsuarioId = usuarioRepositorio.crearUsuario(usuario);
        return "Usuario creado con ID:" + UsuarioId;
    }
}
