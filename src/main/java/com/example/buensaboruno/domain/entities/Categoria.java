package com.example.buensaboruno.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
//@Audited
public class Categoria extends Base{
    private String denominacion;



    @ManyToMany(mappedBy = "categorias")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

//    @OneToMany
//    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
//    //DE ESTA MANERA PONE EL FOREIGN KEY 'categoria_id' EN LA TABLA DE LOS MANY
//    @JoinColumn(name = "categoria_id")
//    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
//    @Builder.Default
//    private Set<Articulo> articulos = new HashSet<>();

    @OneToMany(mappedBy = "categoria",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'categoria_id' EN LA TABLA DE LOS MANY
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    @JsonManagedReference(value = "categoria-articulos")
    private Set<Articulo> articulos = new HashSet<>();


    @OneToMany
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'categoria_id' EN LA TABLA DE LOS MANY
    @JoinColumn(name = "categoria_id")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Categoria> subCategorias = new HashSet<>();


}
