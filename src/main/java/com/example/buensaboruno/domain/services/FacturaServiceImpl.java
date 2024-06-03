package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.Base;
import com.example.buensaboruno.domain.entities.Factura;
import com.example.buensaboruno.domain.entities.Pedido;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.repositories.FacturaRepository;
import com.example.buensaboruno.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;
    @Autowired
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Factura> search(String string) throws Exception {
        return null;
    }

    @Override
    public Page<Factura> search(String string, Pageable pageable) throws Exception {
        return null;
    }
}
