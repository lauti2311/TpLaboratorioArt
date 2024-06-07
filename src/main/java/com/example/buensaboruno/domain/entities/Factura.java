package com.example.buensaboruno.domain.entities;

import com.example.buensaboruno.domain.enums.FormaPago;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Factura extends Base {
    private LocalDate fechaFcturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;

    @OneToOne(mappedBy = "factura")
    @JsonManagedReference(value = "pedido-factura")
    private Pedido pedido;
}
