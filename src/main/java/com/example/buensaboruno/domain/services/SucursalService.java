package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.Pedido;
import com.example.buensaboruno.domain.entities.Sucursal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SucursalService extends BaseService<Sucursal, Long>{

    List<Sucursal> search(String string) throws Exception;
    Page<Sucursal> search(String string, Pageable pageable) throws Exception;

}
