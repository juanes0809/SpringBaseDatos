package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.modelos.Pedido;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServicio {
    @Autowired
    ValidacionPedido validacionPedido;
    @Autowired
    PedidoRepositorio pedidoRepositorio;

    public Pedido guardarPedido(){
        return null;
    }
    public Pedido consultarPedidoId(){
        return null;
    }

    public List<Pedido> buscarTodosPedido(){
        return null;
    }
    public Pedido editarPedido(){
        return null;
    }
    public boolean eliminarPedido(){
        return true;
    }

}
