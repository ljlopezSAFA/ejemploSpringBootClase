package com.app.safabooking.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Hamburguesa")
@Table(name = "hamburguesa")
public class Hamburguesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Double valorCalorico;
    private Hamburgueseria hamburgueseria;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorCalorico() {
        return valorCalorico;
    }

    public void setValorCalorico(Double valorCalorico) {
        this.valorCalorico = valorCalorico;
    }

    @ManyToOne
    @JoinColumn(name = "id_hamburgueseria")
    public Hamburgueseria getHamburgueseria() {
        return hamburgueseria;
    }

    public void setHamburgueseria(Hamburgueseria hamburgueseria) {
        this.hamburgueseria = hamburgueseria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburguesa burguer = (Hamburguesa) o;
        return id == burguer.id && Objects.equals(nombre, burguer.nombre) && Objects.equals(valorCalorico, burguer.valorCalorico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, valorCalorico);
    }

    @Override
    public String toString() {
        return "Burguer{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", valorCalorico=" + valorCalorico +
                '}';
    }
}
