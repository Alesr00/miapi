package com.example.miapi.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name ="domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
@Builder

public class Domicilio extends Base {

    @Column(name="calle")
    private String calle;
    @Column(name="numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;


}
