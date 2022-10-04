package com.app.safabooking.controller;


import com.app.safabooking.model.Ingrediente;
import com.app.safabooking.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

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



}
