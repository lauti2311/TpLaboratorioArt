package com.example.buensaboruno.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
//@Audited
public class ArticuloManufacturadoDetalle extends Base{
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "articulo_insumo_id")
    @ToString.Exclude
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name = "articulo_manufacturado_id")
    @ToString.Exclude
    @JsonBackReference
    private ArticuloManufacturado articuloManufacturado;
}
