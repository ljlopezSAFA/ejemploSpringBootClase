package com.app.safabooking.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hamburguesa")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hamburguesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="valor_calorico")
    private Double valorCalorico;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_hamburgueseria")
    private Hamburgueseria hamburgueseria;

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "hamburguesa_ingrediente",
            joinColumns = @JoinColumn(name = "id_hamburguesa"),
            inverseJoinColumns = @JoinColumn(name = "id_ingrediente"))
    private Set<Ingrediente> ingredientes = new HashSet<>(0);






}
