package com.app.safabooking.service;

import com.app.safabooking.model.Hamburguesa;
import com.app.safabooking.repository.HamburguesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamburguesaService {

    @Autowired
    private HamburguesaRepository burguerRepository;


    public List<Hamburguesa> getAll(){
        return burguerRepository.findAll();
    }

    public Hamburguesa getById(int id){
        return burguerRepository.findById(id).orElse(null);

    }

}
