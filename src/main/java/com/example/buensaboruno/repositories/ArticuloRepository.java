package com.example.buensaboruno.repositories;

import com.example.buensaboruno.domain.entities.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloRepository extends BaseRepository<Articulo, Long> {
}