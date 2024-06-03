package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.ArticuloManufacturado;
import com.example.buensaboruno.domain.entities.DetallePedido;
import com.example.buensaboruno.repositories.ArticuloManufacturadoRepository;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.repositories.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido, Long> implements DetallePedidoService{
    @Autowired
    DetallePedidoRepository detallePedidoRepository;
    @Autowired
    public DetallePedidoServiceImpl(BaseRepository<DetallePedido, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<DetallePedido> search(String string) throws Exception {
        return null;
    }

    @Override
    public Page<DetallePedido> search(String string, Pageable pageable) throws Exception {
        return null;
    }
}
