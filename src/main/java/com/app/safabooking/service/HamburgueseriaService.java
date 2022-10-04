package com.app.safabooking.service;

import com.app.safabooking.model.Hamburgueseria;
import com.app.safabooking.repository.HamburgueseriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamburgueseriaService {

    @Autowired
    private HamburgueseriaRepository hamburgueseriaRepository;


    public List<Hamburgueseria> getAll(){
        return hamburgueseriaRepository.findAll();
    }
 }



