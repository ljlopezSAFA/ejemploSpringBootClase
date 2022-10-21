package com.app.safabooking.service;

import com.app.safabooking.model.Usuario;
import com.app.safabooking.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public boolean validar(Usuario usuario){
        return usuarioRepository.exists(Example.of(usuario));
    }

    public void guardar(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
