package com.example.buensaboruno.domain.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
//@Audited

public class Domicilio extends Base{
    private String calle;
    private Integer numero;
    private Integer cp;
    private Integer piso;
    private Integer nroDpto;

    @ManyToOne
    @NotAudited
    private Localidad localidad;

    @OneToMany(mappedBy = "domicilio",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference(value = "pedido-domicilio")
    @Builder.Default
    @NotAudited
    private Set<Pedido> pedidos = new HashSet<>();


}
