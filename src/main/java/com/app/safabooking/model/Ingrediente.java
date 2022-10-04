package com.app.safabooking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ingrediente")
@Getter @Setter
@NoArgsConstructor
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_caducidad")
    private LocalDate fechaCaducidad;

    @Column(name = "tiene_lactosa")
    private boolean tieneLactosa;

//    @ManyToMany
//    @JoinTable(
//            name = "hamburguesa_ingrediente",
//            joinColumns = @JoinColumn(name = "id_ingrediente"),
//            inverseJoinColumns = @JoinColumn(name = "id_hamburguesa"))
//    private Set<Hamburguesa> hamburguesas = new HashSet<>(0);


}
