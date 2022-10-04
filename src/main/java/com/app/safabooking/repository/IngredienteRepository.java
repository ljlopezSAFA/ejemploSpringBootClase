package com.app.safabooking.repository;

import com.app.safabooking.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepository  extends JpaRepository<Ingrediente,Integer> {


//    //JPA default Queries
//     List<Ingrediente> findAll();
//
//
//    //SQL NATIVO
//     @Query(name = "select * from ingrediente", nativeQuery = true)
//     List<Ingrediente> findAllQuery();
//
//
//     // JPQL with JPA REPOSITORY
//    @Query("select i from Ingrediente i where i.hamburguesas.size= 3 ")
//    List<Ingrediente> findAllQueryJPQL();
}
