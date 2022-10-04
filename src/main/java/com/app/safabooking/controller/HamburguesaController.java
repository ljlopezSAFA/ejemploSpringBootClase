package com.app.safabooking.controller;

import com.app.safabooking.model.Hamburguesa;
import com.app.safabooking.model.Hamburgueseria;
import com.app.safabooking.service.HamburguesaService;
import com.app.safabooking.service.HamburgueseriaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@RestController
public class HamburguesaController {

    @Autowired
    private HamburguesaService burguerService;
    @Autowired
    private HamburgueseriaService hamburgueseriaService;




    @RequestMapping("/burguers")
    public List<Hamburguesa> getHamburguesas(@RequestParam String ciudad,
                                             @RequestParam LocalDate fechaInicio,
                                             @RequestParam LocalDate fechaFin){
        return burguerService.getAll() ;
    }

    @RequestMapping("/listBurguers")
    public ModelAndView listHamburguesas(){
        List<Hamburguesa> listHamburguesa = burguerService.getAll();
        ModelAndView model = new ModelAndView("listHamburguesa");
        model.addObject("listHamburguesa", listHamburguesa);
        return model ;
    }


    @GetMapping("/burguers/new")
    public ModelAndView nuevaHamburguesa(){
        ModelAndView model = new ModelAndView("nuevaHamburguesa");
        Hamburguesa hamburguesa = new Hamburguesa();
        List<Hamburgueseria> hamburgueserias = hamburgueseriaService.getAll();
        model.addObject("listHamburgueserias", hamburgueserias);
        model.addObject("hamburguesa", hamburguesa);
        return model;
    }


    @PostMapping("/burgues/save")
    public void guardarHamburguesa( @RequestBody @ModelAttribute("hamburguesa") Hamburguesa hamburguesa){
        burguerService.guardarHamburguesa(hamburguesa);
    }




}
