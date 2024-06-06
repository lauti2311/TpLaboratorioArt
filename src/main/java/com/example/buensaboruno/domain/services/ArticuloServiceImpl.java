package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.Articulo;
import com.example.buensaboruno.repositories.ArticuloRepository;
import com.example.buensaboruno.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloServiceImpl extends BaseServiceImpl<Articulo, Long> implements ArticuloService {

    @Autowired
    ArticuloRepository articuloRepository;

    @Autowired
    public ArticuloServiceImpl(BaseRepository<Articulo, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Articulo> search(String string) throws Exception {
        return null;
    }

    @Override
    public Page<Articulo> search(String string, Pageable pageable) throws Exception {
        return null;
    }
}