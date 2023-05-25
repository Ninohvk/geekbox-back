package com.shop.geekbox.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="producto_oferta", schema = "dbo")
@Getter
@Setter
public class ProductoOferta {

    @Id
    @Column(name="IIdProdOfer")
    private Integer IIdProdOfer;

    @Column(name="CNomProdOfer")
    private String CNomProdOfer;

    @Column(name="DPrecioProdOfer")
    private Long DPrecioProdOfer;

    @Column(name="ICantOfer")
    private Integer ICantOfer;

    @Column(name="CDescProdOfer")
    private String CDescProdOfer;

    @Column(name="Persona_IIdPer")
    private Integer Persona_IIdPer;
}
