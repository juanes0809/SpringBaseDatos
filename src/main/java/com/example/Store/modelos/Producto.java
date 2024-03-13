package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreProducto;
    private String referencia;
    private String talla;
    private Integer cantidadBodega;
    private Integer precioUnitario;
    private String descripcion;
    private String fotografia;
}
