package com.example.buensaboruno.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subTotal;

    @Override
    public String toString() {
        return "DetallePedido{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                '}';
    }

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    @JsonBackReference(value = "pedido-detallePedidos")
    private Pedido pedido;
}
