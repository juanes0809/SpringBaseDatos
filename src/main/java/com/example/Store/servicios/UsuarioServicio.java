package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionUsuario;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    //en los servicios debo inyectar las dependencias de las validaciones y las consultas o repositorios
    @Autowired
    ValidacionUsuario validacionUsuario;
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    //  en el servicio se creanun metodo para cada una de las consultas a realizar en BD


    // metodo para guardar un usuario, metodo para consultar un usuario en bd por id , metodo para consultar todos los usuarios,
    // metodo para editar un usuario, metodo para eliminar un usuario.

    public Usuario guardarUsuario(){
        return null;
    }
    public Usuario consultarUsuarioId(){
        return null;
    }

    public List<Usuario> buscarTodosUsuarios(){
        return null;
    }
    public Usuario editarUsuario(){
        return null;
    }
    public boolean eliminarUsuario(){
        return true;
    }

}
