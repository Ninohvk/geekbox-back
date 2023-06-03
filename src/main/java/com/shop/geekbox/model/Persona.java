package com.shop.geekbox.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Persona", schema = "dbo")
@Getter
@Setter
public class Persona {

    @Id
    @Basic(optional = false)
    @Column(name="IIdPer")
    private Integer iidPer;

    @Column(name="CEmail")
    private String cemail;

    @Column(name="CPass")
    private String cpass;

    @Column(name="CNom")
    private String cnom;

    @Column(name="CPrimerApellido")
    private String cprimerApellido;

    @Column(name="CSegundoApellido")
    private String csegundoApellido;

    @Column(name="ITelefono")
    private Long itelefono;

    @Column(name="CRut")
    private String crut;
}
