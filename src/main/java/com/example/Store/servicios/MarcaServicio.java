package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionMarca;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServicio {
    @Autowired
    ValidacionMarca validacionMarca;
    @Autowired
    MarcaRepositorio marcaRepositorio;

    public Marca guardarMarca(){
        return null;
    }
    public Marca consultarMarcaId(){
        return null;
    }

    public List<Marca> buscarTodosMarca(){
        return null;
    }
    public Marca editarMarca(){
        return null;
    }
    public boolean eliminarMarca(){
        return true;
    }

}
