package com.app.safabooking.model;

import com.app.safabooking.model.enumerados.Rol;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@Getter @Setter
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private Rol rol;

}
