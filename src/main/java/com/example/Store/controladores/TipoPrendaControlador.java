package com.example.Store.controladores;

import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.servicios.TipoPrendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("storeapi/v1/tipoprenda")
public class TipoPrendaControlador {
    @Autowired
    TipoPrendaServicio tipoPrendaServicio;

    @PostMapping
    public ResponseEntity<?> guardarTipoPrenda(@RequestBody TipoPrenda datosTipoPrenda){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoPrendaServicio.guardarTipoPrenda(datosTipoPrenda));
        }catch (Exception error){
            Map<String, Object> errorDetalle = new LinkedHashMap<>();
            errorDetalle.put("timestamp", LocalDateTime.now());
            errorDetalle.put("message", error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<?> consultarTipoPrenda(){
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(tipoPrendaServicio.buscarTodosTipoPrenda());
        }catch (Exception error){
            Map<String, Object> errorDetalle = new LinkedHashMap<>();
            errorDetalle.put("timestamp", LocalDateTime.now());
            errorDetalle.put("message", error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorDetalle);
        }
    }
    @GetMapping("{id}")
    public ResponseEntity<?> buscarTipoPrendaPorId(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(tipoPrendaServicio.buscarTipoPrendaId(id));
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
