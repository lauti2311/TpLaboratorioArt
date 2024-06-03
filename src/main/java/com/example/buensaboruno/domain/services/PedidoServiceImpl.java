package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.DetallePedido;
import com.example.buensaboruno.domain.entities.Pedido;
import com.example.buensaboruno.repositories.BaseRepository;
import com.example.buensaboruno.repositories.DetallePedidoRepository;
import com.example.buensaboruno.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService{

    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Pedido> search(String string) throws Exception {
        return null;
    }

    @Override
    public Page<Pedido> search(String string, Pageable pageable) throws Exception {
        return null;
    }
}
