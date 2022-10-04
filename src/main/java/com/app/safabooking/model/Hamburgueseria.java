package com.app.safabooking.model;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "hamburgueseria")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hamburgueseria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "pais_origen")
    private String paisOrigen;


}
