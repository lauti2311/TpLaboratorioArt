package com.example.buensaboruno.domain.controllers;

import com.example.buensaboruno.domain.entities.Pedido;
import com.example.buensaboruno.domain.services.PedidoServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedido")
@CrossOrigin(origins = "http://localhost:5173")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
        try{
            System.out.println("sas\n\n\n");
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}
