package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.DetallePedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DetallePedidoService extends BaseService<DetallePedido, Long>{

    List<DetallePedido> search(String string) throws Exception;

    Page<DetallePedido> search(String string, Pageable pageable) throws Exception;
}
