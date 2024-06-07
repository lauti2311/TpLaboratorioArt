package com.example.buensaboruno.domain.services;

import com.example.buensaboruno.domain.entities.Pedido;
import com.example.buensaboruno.domain.entities.Sucursal;
import com.example.buensaboruno.repositories.SucursalRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SucursalServiceImpl extends BaseServiceImpl<Sucursal, Long> implements SucursalService{
    public SucursalServiceImpl(SucursalRepository baseRepository) {
        super(baseRepository);

    }
    @Override
    public List<Sucursal> search(String string) throws Exception {
        return null;
    }

    @Override
    public Page<Sucursal> search(String string, Pageable pageable) throws Exception {
        return null;
    }

}
