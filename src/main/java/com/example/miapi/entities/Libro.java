package com.example.miapi.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
@Builder
public class Libro extends Base{

    @Column(name="titulo")
    private String titulo;
    @Column(name="fecha")
    private int fecha;
    @Column(name="genero")
    private String genero;
    @Column(name="paginas")
    private int paginas;

    @ManyToMany(cascade= CascadeType.REFRESH)
    private List<Autor>  autores;

}
