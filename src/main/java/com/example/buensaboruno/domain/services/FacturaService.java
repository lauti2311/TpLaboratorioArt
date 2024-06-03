package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.ArticuloInsumo;
import com.example.buensaboruno.domain.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FacturaService extends BaseService<Factura, Long>{
    List<Factura> search(String string) throws Exception;
    Page<Factura> search(String string, Pageable pageable) throws Exception;
}
