package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.Articulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticuloService extends BaseService<Articulo, Long> {
    List<Articulo> search(String string) throws Exception;
    Page<Articulo> search(String string, Pageable pageable) throws Exception;
}
