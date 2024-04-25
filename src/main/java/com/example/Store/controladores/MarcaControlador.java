package com.example.Store.controladores;

import com.example.Store.modelos.Marca;
import com.example.Store.modelos.Usuario;
import com.example.Store.servicios.MarcaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("storeapi/v1/marca")
public class MarcaControlador {
    @Autowired
    MarcaServicio marcaServicio;

    @PostMapping
    public ResponseEntity<?> guardarMarca(@RequestBody Marca datosMarca){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(marcaServicio.guardarMarca(datosMarca));
        }catch (Exception error){
            Map<String, Object> errorDetalle = new LinkedHashMap<>();
            errorDetalle.put("timestamp", LocalDateTime.now());
            errorDetalle.put("message", error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
    @GetMapping
    public ResponseEntity<?> buscarMarca(){
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(marcaServicio.buscarTodosMarca());
        }catch (Exception error){
            Map<String, Object> errorDetalle = new LinkedHashMap<>();
            errorDetalle.put("timestamp", LocalDateTime.now());
            errorDetalle.put("message", error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorDetalle);
        }
    }
    @GetMapping
    public ResponseEntity<?> buscarMarcaPorId(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(marcaServicio.consultarMarcaId(id));
        }catch (Exception error){
            Map<String, Object> errorDetalle = new LinkedHashMap<>();
            errorDetalle.put("timestamp", LocalDateTime.now());
            errorDetalle.put("message", error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorDetalle);
        }
    }
}
