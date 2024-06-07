package com.example.buensaboruno.domain.controllers;

import com.example.buensaboruno.domain.entities.DetallePedido;
import com.example.buensaboruno.domain.entities.Pedido;
import com.example.buensaboruno.domain.services.DetallePedidoServiceImpl;
import com.example.buensaboruno.domain.services.FacturaServiceImpl;
import com.example.buensaboruno.domain.services.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedido")
@CrossOrigin(origins = "http://localhost:5173")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {
    @Autowired
    private DetallePedidoServiceImpl detallePedidoService;
    @Autowired
    private FacturaServiceImpl facturaService;
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

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Pedido pedido) {
        try {
            // Guardar el Pedido en la base de datos
            Pedido createdPedido = servicio.save(pedido);

            // Guardar cada DetallePedido en la base de datos
            for (DetallePedido detalle : pedido.getDetallePedidos()) {
                detalle.setPedido(createdPedido);
                detallePedidoService.save(detalle);
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(createdPedido);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error. Please try again later.\"}");
        }
    }

}
