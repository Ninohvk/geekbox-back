package com.shop.geekbox.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="producto_oferta", schema = "dbo")
@Getter
@Setter
public class ProductoOferta {

    @Id
    @Basic(optional = false)
    @Column(name="IIdProdOfer")
    private Integer iidProdOfer;

    @Column(name="CNomProdOfer")
    private String cnomProdOfer;

    @Column(name="DPrecioProdOfer")
    private Long dprecioProdOfer;

    @Column(name="ICantOfer")
    private Integer icantOfer;

    @Column(name="CDescProdOfer")
    private String cdescProdOfer;

    @ManyToOne
    @JoinColumn(name = "Persona_IIdPer")
    private Persona persona;
}
