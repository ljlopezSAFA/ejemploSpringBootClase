package com.app.safabooking.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "hamburgueseria")
public class Hamburgueseria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String paisOrigen;
    private Set<Hamburguesa> hamburguesas = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hamburgueria")
    public Set<Hamburguesa> getHamburguesas() {
        return hamburguesas;
    }

    public void setHamburguesas(Set<Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburgueseria that = (Hamburgueseria) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(paisOrigen, that.paisOrigen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, paisOrigen);
    }
}
