package com.app.safabooking.controller;


import com.app.safabooking.model.Ingrediente;
import com.app.safabooking.service.IngredienteService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;


    @GetMapping("/listar")
    public List<Ingrediente> listarIngredientes(){
        return  ingredienteService.listar();
    }

    @GetMapping("/buscar")
    public Ingrediente getById(@RequestParam Integer id){
        return  ingredienteService.buscarPorID(id);
    }


    @PostMapping("/guardar")
    public String guardarIngrediente(@RequestBody Ingrediente ingrediente){
        ingredienteService.guardar(ingrediente);
        return "Datos guardados correctamente";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestBody Integer id){
        ingredienteService.eliminar(id);
        return "Datos eliminados correctamente";
    }


    @GetMapping("/generar")
    public void generarIngredienteAleatorio(){
        Faker faker = new Faker();
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setTieneLactosa(faker.bool().bool());
        ingrediente.setFechaCaducidad(faker.date().future(30, TimeUnit.DAYS)
                .toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        ingrediente.setNombre(faker.food().ingredient());
        ingredienteService.guardar(ingrediente);
    }

}
