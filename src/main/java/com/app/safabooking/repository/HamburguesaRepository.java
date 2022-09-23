package com.app.safabooking.repository;


import com.app.safabooking.model.Hamburguesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HamburguesaRepository extends JpaRepository<Hamburguesa, Integer> {

    @Query(value = "select id, nombre,valor_calorico from hamburguesa ", nativeQuery = true)
    List<Hamburguesa> obtenerBurguers();
}

