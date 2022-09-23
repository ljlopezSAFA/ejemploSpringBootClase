package com.app.safabooking.repository;

import com.app.safabooking.model.Hamburgueseria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HamburgueseriaRepository extends JpaRepository<Hamburgueseria,Integer> {
}
